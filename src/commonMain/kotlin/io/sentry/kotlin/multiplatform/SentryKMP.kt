package io.sentry.kotlin.multiplatform

object SentryKMP {
    fun start(dsn: String, context: Any? = null) {
        SentryBridge.start(dsn, context)
    }

    fun captureMessage(msg: String) {
        SentryBridge.captureMessage(msg)
    }

    fun captureException(throwable: Throwable) {
        SentryBridge.captureException(throwable)
    }

    /**
     * Throws a RuntimeException, useful for testing.
     */
    fun crash() {
        throw RuntimeException("Uncaught Exception from Kotlin Multiplatform.")
    }

    fun close() {
        SentryBridge.close()
    }
}
