package foo.bar

import arrow.inject.annotations.Provider
import arrow.inject.annotations.context

@Provider internal fun n(): Int = 42

@Provider internal fun d(): Double = 33.0

fun main() {
  <!AMBIGUOUS_PROOF_FOR_SUPERTYPE!>context<Number>()<!>
}
