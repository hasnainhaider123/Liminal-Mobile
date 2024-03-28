package com.app.liminal.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import com.app.liminal.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class AfterSplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_after_splash)

        val splashScreenDuration = 2000L // 2 seconds
        val nextActivityIntent = Intent(this, SignUpWith::class.java)

        lifecycleScope.launch {
            delay(splashScreenDuration)
            startActivity(nextActivityIntent)
            finish()
        }

    }
}