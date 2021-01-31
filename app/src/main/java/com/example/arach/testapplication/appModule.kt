package com.example.arach.testapplication

import com.example.arach.login.LoginNavigation
import org.koin.dsl.module

val appModule = module {
    single<LoginNavigation> { LoginNavigationImpl() }
}