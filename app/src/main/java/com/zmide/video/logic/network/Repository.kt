package com.zmide.video.logic.network

import androidx.lifecycle.liveData
import com.zmide.video.logic.model.VodCaiJi
import kotlinx.coroutines.Dispatchers
import kotlin.Exception

object Repository {
    fun searchVodCaiJiList(wd: String) = liveData(Dispatchers.IO) {
        val result = try {
            val vodCaiJiListResponse = VodCaiJiNetwork.searchVodCaiJiList(wd)
            if (vodCaiJiListResponse.total > 0) {
                val vodList = vodCaiJiListResponse.list
                Result.success(vodList)
            } else {
                Result.failure(RuntimeException("vodCaiJiListResponse total is ${vodCaiJiListResponse.total}"))
            }
        } catch (e: Exception) {
            Result.failure<List<VodCaiJi>>(e)
        }
        emit(result)
    }
}