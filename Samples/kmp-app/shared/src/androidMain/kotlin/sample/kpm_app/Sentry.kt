package sample.kpm_app

import android.content.Context
import io.sentry.kotlin.multiplatform.Sentry

class Sentry {
    companion object {
        /**
         * For manual initialization
         */
        fun init(dsn: String, context: Context) {
            Sentry.init(context) {
                it.dsn = dsn
                it.attachStackTrace = true
                it.attachThreads = true
                it.enableActivityLifecycleBreadcrumbs = true
            }
        }

        fun captureMessage(message: String) {
            Sentry.captureMessage(message)
        }

        fun captureException(throwable: Throwable) {
            Sentry.captureException(throwable)
        }
    }
}