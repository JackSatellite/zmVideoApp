package com.zmide.video.ui.Home

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.zmide.video.R
import com.zmide.video.ui.Search.SearchActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    val TAG = "HomeActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Log.d(TAG, "启动")

        home_but_search.setOnClickListener {
            val keyword = home_edit_keyword.text.toString()
            SearchActivity.actionStart(keyword)
        }
    }

}