package com.marsya.idn.kamuuappp

import retrofit2.Call
import retrofit2.http.GET

interface KamuAppApi {
    @GET("quotes")
    fun getName(): Call<List<KamuAppModel>>

}