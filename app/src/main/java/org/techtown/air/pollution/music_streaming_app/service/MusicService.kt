package org.techtown.air.pollution.music_streaming_app.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {

    @GET("v3/07e56c45-3994-440f-b28d-832d67bc9286")
    fun listMusics() : Call<MusicDto>
}