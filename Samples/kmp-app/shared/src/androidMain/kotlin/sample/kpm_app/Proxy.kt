package sample.kpm_app

import android.content.Context
import io.sentry.kotlin.multiplatform.ContextProvider
import io.sentry.kotlin.multiplatform.Sentry

class Proxy {
    /**
     * For manual initialization
     */
    fun init(dsn: String, resolveContext: ()-> Context) {
        ContextProvider.init(resolveContext)
        Sentry.init(dsn)
    }

    fun captureMessage(msg: String) {
        Sentry.captureMessage(msg)
    }

    fun captureException(throwable: Throwable) {
        Sentry.captureException(throwable)
    }
}