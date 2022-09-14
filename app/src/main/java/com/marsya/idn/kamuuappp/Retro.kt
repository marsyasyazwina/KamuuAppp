package com.marsya.idn.kamuuappp

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retro {
    fun getRetroClient(): Retrofit {
        val gson = GsonBuilder().setLenient().create()
        return Retrofit.Builder()
            .baseUrl("https://63155021fa82b738f755190e.mockapi.io/Kamuuapp")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
}