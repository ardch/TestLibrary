package com.example.arach.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import org.koin.android.ext.android.get

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        submitButton.setOnClickListener {
            val loginNavigation: LoginNavigation = get()
            startActivity(loginNavigation.openAfterLoginActivity(this, UserInfo(emailEditText.text.toString())))
            finish()
        }

        registerTextView.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}