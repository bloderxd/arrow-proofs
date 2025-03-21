package arrow.meta.plugins.proofs

import arrow.meta.plugin.testing.CompilerTest
import arrow.meta.plugin.testing.assertThis
import arrow.meta.plugins.newMetaDependencies
import org.junit.jupiter.api.Test

class GivenTest {

  @Test
  fun `coherent polymorphic identity`() {
    givenTest(
      source =
        """
        @Given internal val x = "yes!"
        val result = given<String>()
      """,
      expected = "result" to "yes!"
    )
  }

  @Test
  fun `coherent polymorphic identity inference`() {
    givenTest(
      source =
        """
        @Given internal val x = "yes!"
        val result: String = given()
      """,
      expected = "result" to "yes!"
    )
  }

  @Test
  fun `coherent concrete identity`() {
    givenTest(
      source =
        """
        @Given internal val x = "yes!"
        fun id(@Given evidence: String): String =
          evidence
        val result = id()
      """,
      expected = "result" to "yes!"
    )
  }

  @Test
  fun `user explicit local override`() {
    givenTest(
      source =
        """
        @Given internal val x = "yes!"
        fun id(@Given evidence: String): String =
          evidence
        val result = id("nope!")
      """,
      expected = "result" to "nope!"
    )
  }

  @Test
  fun `value provider`() {
    givenTest(
      source =
        """
        class X(val value: String)
        @Given val x: X = X("yes!")
        val result = given<X>().value
      """,
      expected = "result" to "yes!"
    )
  }

  @Test
  fun `fun provider`() {
    givenTest(
      source =
        """
        class X(val value: String)
        @Given fun x(): X = X("yes!")
        val result = given<X>().value
      """,
      expected = "result" to "yes!"
    )
  }

  @Test
  fun `class provider`() {
    givenTest(
      source =
        """
        @Given class X {
          val value = "yes!"
        }
        val result = given<X>().value
      """,
      expected = "result" to "yes!"
    )
  }

  @Test
  fun `object provider`() {
    givenTest(
      source =
        """
        @Given object X {
          val value = "yes!"
        }
        val result = given<X>().value
      """,
      expected = "result" to "yes!"
    )
  }

  val prelude =
    """
    package test
    import arrow.Context
    
    @Context
    @Retention(AnnotationRetention.RUNTIME)
    @Target(
      AnnotationTarget.CLASS,
      AnnotationTarget.FUNCTION,
      AnnotationTarget.PROPERTY,
      AnnotationTarget.VALUE_PARAMETER
    )
    @MustBeDocumented
    annotation class Given

    inline fun <A> given(@Given identity: A): A = identity
      
    //metadebug
  """.trimIndent()

  private fun givenTest(source: String, expected: Pair<String, Any?>) {
    val codeSnippet = """
       $prelude
       $source
      """
    assertThis(
      CompilerTest(
        config = { newMetaDependencies() },
        code = { codeSnippet.source },
        assert = { allOf(expected.first.source.evalsTo(expected.second)) }
      )
    )
  }
}
