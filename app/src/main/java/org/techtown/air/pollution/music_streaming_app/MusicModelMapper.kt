package org.techtown.air.pollution.music_streaming_app.service

import org.techtown.air.pollution.music_streaming_app.MusicModel
import org.techtown.air.pollution.music_streaming_app.PlayerModel

fun MusicEntity.mapper(id: Long): MusicModel =
    MusicModel(
        id = id,
        streamUrl = streamUrl,
        coverUrl = coverUrl,
        track =  track,
        artist =  artist
    )

fun MusicDto.mapper() : PlayerModel =
    PlayerModel(
        playMusicList = musics.mapIndexed{index, musicEntity->
            musicEntity.mapper(index.toLong())

        }
    )
