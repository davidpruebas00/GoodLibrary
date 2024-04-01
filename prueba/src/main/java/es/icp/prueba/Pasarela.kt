package es.icp.prueba

import android.content.Context
import android.content.Intent
import android.net.Uri
import com.google.gson.Gson
import es.icp.prueba.model.DefaultRequest

class Pasarela {

    fun sendDefaultRequest(context: Context, jsonDefaultRequest: String): Boolean {

        //Enviamos datos a DTM
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse("respuestapedidos://result")
            putExtra("jsonDefaultRequest", jsonDefaultRequest)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }

        //Si no hay activity que pueda manejar el intent, mandamos false, si no, true
        if (intent.resolveActivity(context.packageManager) == null) {
           return false
        }

        context.startActivity(intent)
        return true
    }

}