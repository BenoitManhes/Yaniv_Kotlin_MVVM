package com.example.yanivscorekeeper.application

import android.app.Application
import timber.log.Timber

class YanivApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}