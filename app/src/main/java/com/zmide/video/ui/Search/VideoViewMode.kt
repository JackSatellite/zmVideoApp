package com.zmide.video.ui.Search

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.zmide.video.logic.model.VodCaiJiList
import com.zmide.video.logic.network.Repository

class VideoViewMode : ViewModel() {

    private val searchLiveData = MutableLiveData<String>()

    val videoList = ArrayList<VodCaiJiList>()

    val videoLiveData = Transformations.switchMap(searchLiveData) { wd ->
        Repository.searchVodCaiJiList(wd)
    }

    fun searchVideo(wd: String) {
        searchLiveData.value = wd
    }

}