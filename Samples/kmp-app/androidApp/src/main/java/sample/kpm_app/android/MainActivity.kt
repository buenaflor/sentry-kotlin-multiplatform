package sample.kpm_app.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import sample.kpm_app.Platform
import sample.kpm_app.Sentry
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val captureMessageBtn: Button = findViewById(R.id.captureMessageBtn)
        val captureExceptionBtn: Button = findViewById(R.id.captureExceptionBtn)
        captureMessageBtn.setOnClickListener {
            Sentry.captureMessage("From KPM Sample App: " + Platform().platform)
        }

        captureExceptionBtn.setOnClickListener {
            try {
                // will throw an outOfBounds exception
                val arr = arrayOf(1)
                arr[2]
            } catch (e: Exception) {
                Sentry.captureException(e)
            }
        }
    }
}