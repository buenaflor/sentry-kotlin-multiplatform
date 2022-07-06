package io.sentry.kotlin.multiplatform

internal expect object SentryBridge {
    /**
     * We can't use init because of `init` is reserved in Objective-C and Swift.
     */
    fun start(dsn: String, context: Any? = null)

    fun captureMessage(message: String)

    fun captureException(throwable: Throwable)

    fun close()
}
