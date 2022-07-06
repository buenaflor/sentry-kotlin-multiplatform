package io.sentry.kotlin.multiplatform

open class SentryKmpOptions {
    var dsn: String? = null
    var attachStackTrace = true
    var attachThreads = true
}