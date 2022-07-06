package io.sentry.kotlin.multiplatform

import io.sentry.Sentry as SentryJvm

internal actual object SentryBridge {

    actual fun captureMessage(message: String) {
        SentryJvm.captureMessage(message)
    }

    actual fun start(context: Any?, configuration: OptionsConfiguration<SentryOptions>) {

    }

    actual fun captureException(throwable: Throwable) {
        SentryJvm.captureException(throwable)
    }

    actual fun close() {
        SentryJvm.close()
    }

}
