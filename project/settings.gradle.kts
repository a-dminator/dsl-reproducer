include(
    ":client",
    ":client-jvm"
)

project(":client").projectDir = File("../modules/client")
project(":client-jvm").projectDir = File("../modules/client-jvm")