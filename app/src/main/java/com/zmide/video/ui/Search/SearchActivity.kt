package com.zmide.video.ui.Search

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.zmide.video.BaseApplication
import com.zmide.video.R
import com.zmide.video.logic.model.VideoItem
import kotlinx.android.synthetic.main.activity_search.*

class SearchActivity : AppCompatActivity() {

    companion object {

        fun actionStart() {
            actionStart("")
        }

        fun actionStart(keyword: String) {
            val context = BaseApplication.context
            val intent = Intent().setClass(context, SearchActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            if (keyword !== "") intent.putExtra("keyword", keyword)
            context.startActivity(intent)
        }
    }

    private val videoList = ArrayList<VideoItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        val keyword = intent.getStringExtra("keyword")
        if (keyword !== null) {
            // 存在关键词操作
            Log.d("开始搜索", keyword)
        }

        initVideoList() // 初始化视频数据
        val layoutManager = LinearLayoutManager(this)
        search_list_movies.layoutManager = layoutManager
        val adapter = VideoAdapter(videoList)
        search_list_movies.adapter = adapter

    }

    private fun initVideoList() {
        repeat(6) {
            videoList.add(
                VideoItem(
                    "https://img9.doubanio.com/view/photo/s_ratio_poster/public/p2615015805.webp",
                    "流浪地球",
                    "2019 / 中国大陆 / 科幻 冒险 灾难 / 吴京 吴京 吴京 吴京 吴京 吴京",
                    "电影",
                    "",
                    "逐梦视频"
                )
            )
            videoList.add(
                VideoItem(
                    "https://img1.doubanio.com/view/photo/l/public/p2546876229.webp",
                    "流浪地球",
                    "2019 / 中国大陆 / 科幻 冒险 灾难 / 吴京 吴京 吴京 吴京 吴京 吴京",
                    "电影",
                    "",
                    "逐梦视频"
                )
            )
        }
    }

}