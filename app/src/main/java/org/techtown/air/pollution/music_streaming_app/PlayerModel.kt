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
    fun updateCurrentPosition(musicModel: MusicModel){
        currentPostion = playMusicList.indexOf(musicModel)
    }
    fun nextMusic(): MusicModel?{
        if(playMusicList.isEmpty()) return  null

        currentPostion = if((currentPostion +1) == playMusicList.size) 0 else currentPostion + 1
        return playMusicList[currentPostion]
    }
    fun prevMusic(): MusicModel?{
        if (playMusicList.isEmpty()) return  null

        currentPostion = if((currentPostion - 1 ) < 0) playMusicList.lastIndex else currentPostion -1
        return  playMusicList[currentPostion]

    }
    fun currentMusicModel(): MusicModel?{
        if (playMusicList.isEmpty() ) return  null

        return  playMusicList[currentPostion]

    }


}