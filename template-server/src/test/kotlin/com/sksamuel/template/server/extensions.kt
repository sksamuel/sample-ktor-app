package com.sksamuel.template.server

import com.sksamuel.template.datastore.flywayMigrate
import com.sksamuel.template.datastore.postgresContainer
import io.kotest.extensions.testcontainers.SharedJdbcDatabaseContainerExtension

val postgres = SharedJdbcDatabaseContainerExtension(postgresContainer, afterStart = { flywayMigrate(it) })
