package io.sentry.kotlin.multiplatform

internal actual object SentryBridge {
    actual fun start(context: Any?, configuration: OptionsConfiguration<SentryKmpOptions>) {

    }

    actual fun captureMessage(message: String) {
    }

    actual fun captureException(throwable: Throwable) {
    }

    actual fun close() {
        // sentry-cocoa has no close
    }
}