package org.techtown.air.pollution.music_streaming_app.service

import org.techtown.air.pollution.music_streaming_app.MusicModel

fun MusicEntity.mapper(id: Long): MusicModel =
    MusicModel(
        id = id,
        streamUrl = streamUrl,
        coverUrl = coverUrl,
        track =  track,
        artist =  artist
    )