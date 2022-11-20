package com.packagesmaster.sharedutils

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences

class SharedUtils(context: Context) {

    private val sharedPreferences = context.getSharedPreferences(context.packageName, MODE_PRIVATE)

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