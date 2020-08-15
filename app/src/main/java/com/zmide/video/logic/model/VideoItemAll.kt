package com.zmide.video.logic.model

data class VideoItemAll(val movies: List<VideoItem>)

data class VideoItem(
    val poster: String,
    val name: String,
    val description: String,
    val tag: String,
    val url: String,
    val source: String
)
