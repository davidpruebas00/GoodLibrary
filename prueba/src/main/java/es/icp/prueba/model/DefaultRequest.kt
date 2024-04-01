package es.icp.prueba.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class DefaultRequest(
    @SerializedName("ID_APP") val id_app: Int? = null,
    @SerializedName("IMPORTE") val importe: Double? = null,
    @SerializedName("PROPINA") val propina: Double? = null,
    @SerializedName("URL_APP") val url_app: String? = null
): Serializable