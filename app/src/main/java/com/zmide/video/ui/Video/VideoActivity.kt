package com.zmide.video.ui.Video

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zmide.video.BaseApplication
import com.zmide.video.R

class VideoActivity: AppCompatActivity() {

    companion object {
        fun actionStart() {
            val context = BaseApplication.context;
            val intent = Intent().setClass(context, VideoActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
    }



}