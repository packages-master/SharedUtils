package com.packagesmaster.sharedutils

import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.packagesmaster.sharedutils.app.SharedUtilsController

class SharedUtils() {

    private val sharedPreferences = SharedUtilsController.getSharedUtilsController().getSharedPreferences(SharedUtilsController.getSharedUtilsController().packageName, MODE_PRIVATE)

    companion object {
        private lateinit var instance: SharedUtils

        fun getSharedUtils(): SharedUtils {
            return instance
        }
    }

    init {
        instance = this
    }

    fun getSharedPreferences(): SharedPreferences {
        return sharedPreferences
    }

    fun getSharedPreferencesEditor(): SharedPreferences.Editor {
        return sharedPreferences.edit()
    }

}