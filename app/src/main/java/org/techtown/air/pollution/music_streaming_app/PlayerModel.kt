package org.techtown.air.pollution.music_streaming_app

data class PlayerModel (
    private val playMusicList: List<MusicModel> = emptyList(),
    var currentPostion: Int = -1,
    var isWatchingPlayListView: Boolean = true

){
    fun getAdapterModels(): List<MusicModel>{
        return  playMusicList.mapIndexed{ index, musicModel ->
            val newItem = musicModel.copy(
                isPlaying = index == currentPostion
            )
            newItem
        }
    }


}