

package arrow.inject.compiler.plugin.runners;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link GenerateNewCompilerTests.kt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
public class BoxTestGenerated extends AbstractBoxTest {
    @Nested
    @TestMetadata("src/testData/box/value-arguments")
    @TestDataPath("$PROJECT_ROOT")
    public class Value_arguments {
        @Test
        @TestMetadata("a_polymorphic_provider_may_have_injection_arguments_which_are_polymorphically_resolved.kt")
        public void testA_polymorphic_provider_may_have_injection_arguments_which_are_polymorphically_resolved() throws Exception {
            runTest("src/testData/box/value-arguments/a_polymorphic_provider_may_have_injection_arguments_which_are_polymorphically_resolved.kt");
        }

        @Test
        @TestMetadata("a_provider_may_have_injection_arguments_which_are_polymorphically_resolved.kt")
        public void testA_provider_may_have_injection_arguments_which_are_polymorphically_resolved() throws Exception {
            runTest("src/testData/box/value-arguments/a_provider_may_have_injection_arguments_which_are_polymorphically_resolved.kt");
        }

        @Test
        public void testAllFilesPresentInValue_arguments() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("src/testData/box/value-arguments"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("class_provider.kt")
        public void testClass_provider() throws Exception {
            runTest("src/testData/box/value-arguments/class_provider.kt");
        }

        @Test
        @TestMetadata("coherent_concrete_identity.kt")
        public void testCoherent_concrete_identity() throws Exception {
            runTest("src/testData/box/value-arguments/coherent_concrete_identity.kt");
        }

        @Test
        @TestMetadata("coherent_polymorphic_identity.kt")
        public void testCoherent_polymorphic_identity() throws Exception {
            runTest("src/testData/box/value-arguments/coherent_polymorphic_identity.kt");
        }

        @Test
        @TestMetadata("coherent_polymorphic_identity_inference.kt")
        public void testCoherent_polymorphic_identity_inference() throws Exception {
            runTest("src/testData/box/value-arguments/coherent_polymorphic_identity_inference.kt");
        }

        @Test
        @TestMetadata("different_context_providers_of_the_same_type_are_not_ambiguous.kt")
        public void testDifferent_context_providers_of_the_same_type_are_not_ambiguous() throws Exception {
            runTest("src/testData/box/value-arguments/different_context_providers_of_the_same_type_are_not_ambiguous.kt");
        }

        @Test
        @TestMetadata("fun_provider.kt")
        public void testFun_provider() throws Exception {
            runTest("src/testData/box/value-arguments/fun_provider.kt");
        }

        @Test
        @TestMetadata("given_internal_orphan_override.kt")
        public void testGiven_internal_orphan_override() throws Exception {
            runTest("src/testData/box/value-arguments/given_internal_orphan_override.kt");
        }

        @Test
        @TestMetadata("member_injection_class_.kt")
        public void testMember_injection_class_() throws Exception {
            runTest("src/testData/box/value-arguments/member_injection_class_.kt");
        }

        @Test
        @TestMetadata("member_injection_class_with_injected_args_and_members.kt")
        public void testMember_injection_class_with_injected_args_and_members() throws Exception {
            runTest("src/testData/box/value-arguments/member_injection_class_with_injected_args_and_members.kt");
        }

        @Test
        @TestMetadata("member_injection_class_with_injected_args_and_members_re_scoped_.kt")
        public void testMember_injection_class_with_injected_args_and_members_re_scoped_() throws Exception {
            runTest("src/testData/box/value-arguments/member_injection_class_with_injected_args_and_members_re_scoped_.kt");
        }

        @Test
        @TestMetadata("member_injection_object_.kt")
        public void testMember_injection_object_() throws Exception {
            runTest("src/testData/box/value-arguments/member_injection_object_.kt");
        }

        @Test
        @TestMetadata("member_injection_object_inference.kt")
        public void testMember_injection_object_inference() throws Exception {
            runTest("src/testData/box/value-arguments/member_injection_object_inference.kt");
        }

        @Test
        @TestMetadata("multiple_context_providers_are_supported.kt")
        public void testMultiple_context_providers_are_supported() throws Exception {
            runTest("src/testData/box/value-arguments/multiple_context_providers_are_supported.kt");
        }

        @Test
        @TestMetadata("object_provider.kt")
        public void testObject_provider() throws Exception {
            runTest("src/testData/box/value-arguments/object_provider.kt");
        }

        @Test
        @TestMetadata("primitive_internal_orphan_override.kt")
        public void testPrimitive_internal_orphan_override() throws Exception {
            runTest("src/testData/box/value-arguments/primitive_internal_orphan_override.kt");
        }

        @Test
        @TestMetadata("provider_supports_multiple_contexts.kt")
        public void testProvider_supports_multiple_contexts() throws Exception {
            runTest("src/testData/box/value-arguments/provider_supports_multiple_contexts.kt");
        }

        @Test
        @TestMetadata("type_bounds_based_injection.kt")
        public void testType_bounds_based_injection() throws Exception {
            runTest("src/testData/box/value-arguments/type_bounds_based_injection.kt");
        }

        @Test
        @TestMetadata("user_explicit_local_override.kt")
        public void testUser_explicit_local_override() throws Exception {
            runTest("src/testData/box/value-arguments/user_explicit_local_override.kt");
        }

        @Test
        @TestMetadata("value_class_support.kt")
        public void testValue_class_support() throws Exception {
            runTest("src/testData/box/value-arguments/value_class_support.kt");
        }

        @Test
        @TestMetadata("value_provider.kt")
        public void testValue_provider() throws Exception {
            runTest("src/testData/box/value-arguments/value_provider.kt");
        }
    }

    @Nested
    @TestMetadata("src/testData/box/context-receivers")
    @TestDataPath("$PROJECT_ROOT")
    public class Context_receivers {
        @Test
        @TestMetadata("a_polymorphic_provider_may_have_injection_arguments_which_are_polymorphically_resolved.kt")
        public void testA_polymorphic_provider_may_have_injection_arguments_which_are_polymorphically_resolved() throws Exception {
            runTest("src/testData/box/context-receivers/a_polymorphic_provider_may_have_injection_arguments_which_are_polymorphically_resolved.kt");
        }

        @Test
        @TestMetadata("a_polymorphic_provider_may_have_injection_arguments_which_are_polymorphically_resolved2.kt")
        public void testA_polymorphic_provider_may_have_injection_arguments_which_are_polymorphically_resolved2() throws Exception {
            runTest("src/testData/box/context-receivers/a_polymorphic_provider_may_have_injection_arguments_which_are_polymorphically_resolved2.kt");
        }

        @Test
        public void testAllFilesPresentInContext_receivers() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("src/testData/box/context-receivers"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("context_receivers.kt")
        public void testContext_receivers() throws Exception {
            runTest("src/testData/box/context-receivers/context_receivers.kt");
        }

        @Test
        @TestMetadata("context_receivers_2.kt")
        public void testContext_receivers_2() throws Exception {
            runTest("src/testData/box/context-receivers/context_receivers_2.kt");
        }
    }
}
