plugins {
   `java-test-fixtures`
}

dependencies {
   api("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.2")
   api("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.14.2")
}

dependencies {
   testFixturesImplementation("io.kotest:kotest-property:5.6.1")
}
