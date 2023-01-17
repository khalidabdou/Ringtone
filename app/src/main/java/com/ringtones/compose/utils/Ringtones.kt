package com.ringtones.compose.utils

import com.ringtones.compose.R

class Ringtones {

    val rawSongs = listOf(
        SongDetails(
            R.raw.ringtone1,
            "Ringtone 01", ""
        ),
    )

    fun getAllRingtone():List<SongDetails>{
        return rawSongs
    }

}


data class SongDetails(
    var raw:Int,
    val title:String,
    val desc:String
)