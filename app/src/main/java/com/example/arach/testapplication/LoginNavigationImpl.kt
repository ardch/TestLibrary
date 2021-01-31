package com.example.arach.testapplication

import android.content.Context
import android.content.Intent
import com.example.arach.login.LoginActivity
import com.example.arach.login.LoginNavigation
import com.example.arach.login.UserInfo

class LoginNavigationImpl: LoginNavigation {
    override fun openLoginActivity(context: Context): Intent {
        return Intent(context, LoginActivity::class.java)
    }

    override fun openAfterLoginActivity(context: Context, data: UserInfo): Intent {
        return Intent(context, MainActivity::class.java)
    }
}