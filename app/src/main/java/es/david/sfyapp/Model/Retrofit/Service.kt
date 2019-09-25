package es.david.sfyapp.Model.Retrofit

import es.david.sfyapp.Model.Data.Movie
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface Service {

    @GET("/movie/popular")
    fun getMovies(@Query("api_key") api_key: String): Observable<List<Movie>>
}