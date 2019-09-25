package es.david.sfyapp.Model.Data

import android.widget.ImageView
import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("poster_path") val img: ImageView,
    @SerializedName("original_title") val title: String,
    @SerializedName("release_date") val date: String,
    @SerializedName("overview") val overview: String
)