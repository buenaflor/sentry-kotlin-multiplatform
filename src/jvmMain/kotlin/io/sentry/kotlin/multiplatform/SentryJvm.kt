package io.sentry.kotlin.multiplatform

import io.sentry.Sentry as SentryJvm

object Sentry {

    fun captureMessage(message: String) {
        SentryJvm.captureMessage(message)
    }

    fun init(dsn: String, context: Any?) {
        SentryJvm.init {
            it.setDebug(true)
            it.dsn = dsn
        }
    }

    fun captureException(throwable: Throwable) {
        SentryJvm.captureException(throwable)
    }

    fun close() {
        SentryJvm.close()
    }

}
