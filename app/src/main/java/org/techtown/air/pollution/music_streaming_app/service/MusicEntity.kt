package org.techtown.air.pollution.music_streaming_app.service

import com.google.gson.annotations.SerializedName

class MusicEntity (
    @SerializedName("track")val track: String,
    @SerializedName("streamUrl") val streamUrl: String,
    @SerializedName("artist")val artist: String,
    @SerializedName("coverUrl")val coverUrl: String
)