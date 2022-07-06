package sample.kpm_app

import io.sentry.kotlin.multiplatform.SentryKMP

object SharedBusinessLogic {
    fun hardCrash() {
        SentryKMP.crash()
    }

    fun captureMessage(message: String) {
        SentryKMP.captureMessage(message)
    }

    fun captureException(e: Throwable) {
        SentryKMP.captureException(e)
    }
}