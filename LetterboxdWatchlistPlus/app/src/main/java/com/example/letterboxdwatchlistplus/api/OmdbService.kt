package com.example.letterboxdwatchlistplus.api

import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object OmdbService {

    private val client = OkHttpClient.Builder().build()

    private val retrofit = Retrofit.Builder()
        .baseUrl("http://www.omdbapi.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    private val omdbApi = retrofit.create(OmdbApi::class.java)


    fun getMovie() {
        val call = omdbApi.getMovie("3574a1f7")

        call.enqueue(object : Callback<OmdbMovie> {
            override fun onResponse(call: Call<OmdbMovie>, response: Response<OmdbMovie>) {
                if (response.isSuccessful) {
                    // do something
                }
            }

            override fun onFailure(call: Call<OmdbMovie>, t: Throwable) {
                // do something
            }
        })
    }

}