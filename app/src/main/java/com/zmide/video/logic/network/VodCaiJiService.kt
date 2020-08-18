package com.zmide.video.logic.network

import com.zmide.video.logic.model.VodCaiJi
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface VodCaiJiService {

    @GET("api.php/provide/vod/at/json/")
    fun tiankongapiCom(@Query("wd") wd: String): Call<VodCaiJi>

}