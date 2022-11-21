package com.packagesmaster.sharedutils.app

import android.app.Application

class SharedUtilsController: Application() {

    companion object {
        private lateinit var instance: SharedUtilsController

        fun getSharedUtilsController(): SharedUtilsController {
            return instance
        }
    }

    init {
        instance = this
    }

}