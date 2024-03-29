package com.latihanbyrg.tugaspertemuan11.api

import com.latihanbyrg.tugaspertemuan11.model.Cat
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("images/search?limit=1")
    fun getCat(@Query("breed_ids") key: String): Call<List<Cat>>
}