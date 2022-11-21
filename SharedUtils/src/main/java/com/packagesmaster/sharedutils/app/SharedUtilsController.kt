package com.packagesmaster.sharedutils.app

import android.app.Application

class SharedUtilsController: Application() {

    companion object {
        private lateinit var instance: SharedUtilsController

        fun getSharedUtilsController(): SharedUtilsController {
            return instance
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

}