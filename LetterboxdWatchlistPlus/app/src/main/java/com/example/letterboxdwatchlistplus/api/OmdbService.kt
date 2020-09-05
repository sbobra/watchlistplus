package com.example.letterboxdwatchlistplus.api

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.Schedulers
import okhttp3.OkHttpClient
import org.reactivestreams.Subscriber
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


object OmdbService {

    private val client = OkHttpClient.Builder().build()

    private val retrofit = Retrofit.Builder()
        .baseUrl("http://www.omdbapi.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .client(client)
        .build()

    private val omdbApi = retrofit.create(OmdbApi::class.java)


    fun getMovie(handleResults: (result: OmdbMovie) -> Unit, handleError: (error: Throwable) -> Unit) {
        val movieObservable: Observable<OmdbMovie> = omdbApi.getMovie("3574a1f7")
        movieObservable.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { value -> handleResults(value) }, // onNext
                { error -> handleError(error) },    // onError
                { println("Completed!") }                 // onComplete
            )
//            .subscribe(handleResults, handleError)

//        call.enqueue(object : Callback<OmdbMovie> {
//            override fun onResponse(call: Call<OmdbMovie>, response: Response<OmdbMovie>) {
//                if (response.isSuccessful) {
//                    // do something
//                }
//            }
//
//            override fun onFailure(call: Call<OmdbMovie>, t: Throwable) {
//                // do something
//            }
//        })
    }

}