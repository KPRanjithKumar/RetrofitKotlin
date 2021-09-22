package ran.am.retrofitkotlin

import retrofit2.Call
import retrofit2.http.GET


interface APIInterface {
    @GET("/api/unknown")
    fun doGetListResources(): Call<BookDetails?>?
}