package es.icp.goodlibrary

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import es.icp.goodlibrary.model.DefaultResponse

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        recibirDatosDTM()
    }

    //Recibimos los datos que nos devuelve DTM
//    private fun recibirDatosDTM() {
//        val dataResponse = intent.data
//
//        if (dataResponse != null) {
//            if (intent.extras != null) {
//                val datosIntent = intent.extras!!.getString("jsonDefaultResponse")
//                val datos = Gson().fromJson(datosIntent, DefaultResponse::class.java)
//                Log.d("DATOS RECIBIDOS: ", datos.toString())
//                enviarDatosApp(datos)
//            }
//        }
//    }
//
//    //Después de recibir los datos, enviamos los datos a la app que nos ha llamado
//    private fun enviarDatosApp(dates: DefaultResponse) {
//        val intent = Intent(Intent.ACTION_VIEW).apply {
//
//            //Depende del id_app que nos devuelva DTM, enviamos los datos a una app u otra
//            // De momento, enviamos a la misma app de pruebas
//            when (dates.id_app) {
//                1 -> data = Uri.parse("respuestaapp://result")
//                2 -> data = Uri.parse("respuestaapp://result")
//                3 -> data = Uri.parse("respuestaapp://result")
//                4 -> data = Uri.parse("respuestaapp://result")
//            }
//
//            putExtra("jsonDefaultRequest", Gson().toJson(dates))
//            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//        }
//
//        this.startActivity(intent)
//    }

}