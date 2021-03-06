package com.example.professionalandroidapplicationdevelopment.application

import android.app.Application
import com.example.professionalandroidapplicationdevelopment.di.application
import com.example.professionalandroidapplicationdevelopment.di.mainScreen
import org.koin.core.context.startKoin

class TranslatorApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(listOf(application, mainScreen))
        }
    }
}