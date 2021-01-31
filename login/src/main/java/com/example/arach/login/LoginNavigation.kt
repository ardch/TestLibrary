package com.example.arach.login

import android.content.Context
import android.content.Intent

interface LoginNavigation {
    fun openLoginActivity(context: Context): Intent
    fun openAfterLoginActivity(context: Context, data: UserInfo): Intent
}