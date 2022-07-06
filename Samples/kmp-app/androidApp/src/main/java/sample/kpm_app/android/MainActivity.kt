package sample.kpm_app.android

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import io.sentry.kotlin.multiplatform.SentryKMP
import sample.kpm_app.Platform
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val captureMessageBtn: Button = findViewById(R.id.captureMessageBtn)
        val captureExceptionBtn: Button = findViewById(R.id.captureExceptionBtn)
        captureMessageBtn.setOnClickListener {
            SentryKMP.captureMessage("From KMP Sample App: " + Platform().platform)
        }

        captureExceptionBtn.setOnClickListener {
            try {
                // will throw an outOfBounds exception
                val arr = arrayOf(1)
                arr[2]
            } catch (e: Exception) {
                SentryKMP.captureException(e)
            }
        }
    }
}

class SentryApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        SentryKMP.start(this) {
            it.dsn = "https://83f281ded2844eda83a8a413b080dbb9@o447951.ingest.sentry.io/5903800"
            it.attachStackTrace = true
            it.attachThreads = true
        }
    }
}