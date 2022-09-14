package com.marsya.idn.kamuuappp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getName()
    }

    private fun getName() {
        val retro = Retro().getRetroClient().create(KamuAppApi::class.java)
        retro.getName().enqueue(object : Callback<List<KamuAppModel>>{
            override fun onResponse(
                call: Call<List<KamuAppModel>>,
                response: Response<List<KamuAppModel>>
            ) {
                for (q in response.body()!!){
                    Log.e("WOW", q.name.toString())
                }
            }

            override fun onFailure(call: Call<List<KamuAppModel>>, t: Throwable) {
                Log.e("Fail", "Be Fail")
            }
        })
    }
}