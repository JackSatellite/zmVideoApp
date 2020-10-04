package com.zmide.video.logic.network

import com.zmide.video.logic.model.VodCaiJi
import com.zmide.video.logic.model.VodCaiJis
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface VodCaiJiService {

    @GET("api.php/provide/vod/at/json/?ac=detail")
    fun tiankongapiCom(@Query("wd") wd: String): Call<VodCaiJis>


    @GET("api.php/provide/vod/at/json/?ac=detail")
    fun tiankongapiComInfo(@Query("ids") id: String): Call<VodCaiJis>

}