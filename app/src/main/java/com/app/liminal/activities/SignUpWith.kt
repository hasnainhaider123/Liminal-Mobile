package com.app.liminal.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.liminal.R

class SignUpWith : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up_with)

        // Find the loginLayout
        val loginLayout = findViewById<ConstraintLayout>(R.id.loginLayout)

        // Set OnClickListener for loginLayout
        loginLayout.setOnClickListener {
            // Start the LoginActivity when loginLayout is clicked
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}