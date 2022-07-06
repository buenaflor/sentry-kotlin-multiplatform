package io.sentry.kotlin.multiplatform

object SentryKMP {
    fun start(context: Any? = null, configuration: (SentryOptions) -> Unit) {
        SentryBridge.start(context, configuration)
    }

    fun captureMessage(message: String) {
        SentryBridge.captureMessage(message)
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

fun interface OptionsConfiguration<T: SentryOptions> {
    fun configure(options: T)
}