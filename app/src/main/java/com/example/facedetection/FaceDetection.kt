package com.example.facedetection

import android.app.Application
import com.example.facedetection.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class FaceDetection : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@FaceDetection)
            modules(viewModelModule)
        }
    }

}