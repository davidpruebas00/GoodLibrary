package es.icp.prueba

import android.content.Context
import android.provider.Settings
import android.util.Log

class showLog(private val context: Context) {

    fun showLog() {
        Log.d("showLog", getAndroidDeviceId()) // Aquí llamamos a la función sin el signo $
    }

    private fun getAndroidDeviceId(): String {
        return Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
    }

}