package io.sentry.kotlin.multiplatform

import android.content.Context
import io.sentry.Sentry
import io.sentry.android.core.SentryAndroid
import io.sentry.android.core.SentryAndroidOptions

object Sentry {

    fun init(context: Context, configuration: OptionsConfiguration<SentryKmpAndroidOptions>) {
        val options = SentryKmpAndroidOptions()
        configuration.configure(options)
        SentryAndroid.init(context, convertToSentryAndroidOptions(options))
    }

    fun captureMessage(message: String) {
        Sentry.captureMessage(message)
    }

    fun captureException(throwable: Throwable) {
        Sentry.captureException(throwable)
    }

    fun close() {
        Sentry.close()
    }

    private fun convertToSentryAndroidOptions(options: SentryKmpAndroidOptions): (SentryAndroidOptions) -> Unit {
        return { sentryAndroidOptions ->
            sentryAndroidOptions.dsn = options.dsn
            sentryAndroidOptions.isAttachThreads = options.attachThreads
            sentryAndroidOptions.isAttachStacktrace = options.attachStackTrace
            sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs = options.enableActivityLifecycleBreadcrumbs
        }
    }
}


