package io.sentry.kotlin.multiplatform

internal actual object SentryBridge {
    /**
     * We can't use init because of `init` is reserved in Objective-C and Swift.
     */
    actual fun start(dsn: String, context: Any?) {
    }

    actual fun captureMessage(message: String) {
    }

    actual fun captureException(throwable: Throwable) {
    }

    actual fun close() {
    }

}