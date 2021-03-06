package com.kekod.kekodweather

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {
    @GET("weather?appid=a17e19e4c74080d24b6ae73462525a99")
    fun getWeatherByCityName(
        @Query("q") cityName: String,
        @Query("units") unit: String
    ): Call<WeatherByCityNameResponse>
}