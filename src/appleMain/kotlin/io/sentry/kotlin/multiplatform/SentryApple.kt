package io.sentry.kotlin.multiplatform

internal actual object SentryBridge {
    actual fun start(dsn: String, context: Any?) {

    }

    actual fun captureMessage(message: String) {
    }

    actual fun captureException(throwable: Throwable) {
    }

    actual fun close() {
        // sentry-cocoa has no close
    }
}