package test_repo

fun brokenFactory(): String = missingGreeting

fun brokenConsumer() {
    val value = brokenFactory()
    println(value)
    println(missingConsumerValue)
}
