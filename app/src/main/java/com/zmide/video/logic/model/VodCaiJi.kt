package com.zmide.video.logic.model

import com.google.gson.annotations.SerializedName

data class VodCaiJi(val code: Int, val msg: String, val total: Int, val list: List<VodCaiJiList>)

data class VodCaiJiList(
    @SerializedName("vod_id") val vodId: Int,
    @SerializedName("vod_name") val vodName: String
)

data class VodCaiJiInfo(
    @SerializedName("vod_id") val vodId: Int,
    @SerializedName("vod_name") val vodName: String,
    @SerializedName("vod_pic") val vodPic: String,
    @SerializedName("vod_tag") val vodTag: String,
    @SerializedName("vod_actor") val vodActor: String,
    @SerializedName("vod_year") val vodYear: String,
    @SerializedName("vod_remarks") val vodRemarks: String,
    @SerializedName("vod_score") val vodScore: String,
    @SerializedName("vod_play_url") val vodPlayUrl: String
)
