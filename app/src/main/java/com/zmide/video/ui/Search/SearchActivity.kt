package com.zmide.video.ui.Search

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.zmide.video.BaseApplication
import com.zmide.video.R

class SearchActivity : AppCompatActivity() {

    companion object {

        fun actionStart() {
            actionStart("")
        }

        fun actionStart(keyword: String) {
            val context = BaseApplication.context
            val intent = Intent().setClass(context, SearchActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            if(keyword !== "")  intent.putExtra("keyword", keyword)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        val keyword = intent.getStringExtra("keyword")
        if(keyword !== null) {
            // 存在关键词操作
            Log.d("开始搜索",keyword)
        }
    }

}