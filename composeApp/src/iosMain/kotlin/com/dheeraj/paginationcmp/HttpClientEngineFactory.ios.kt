package com.dheeraj.paginationcmp

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.darwin.Darwin

actual class HttpClientEngineFactory actual constructor() {
    actual fun create(): HttpClientEngine = Darwin.create()
}