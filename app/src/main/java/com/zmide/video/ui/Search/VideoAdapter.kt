package com.zmide.video.ui.Search

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.zmide.video.BaseApplication
import com.zmide.video.R
import com.zmide.video.logic.model.VideoItem
import com.zmide.video.ui.Video.VideoActivity

// 视频项列表适配器
class VideoAdapter(val videoList: List<VideoItem>) :
    RecyclerView.Adapter<VideoAdapter.ViewHolder>() {

    // 组件控制器
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val rootView : View = view

        // 视频海报 View
        val moviePoster: ImageView = view.findViewById(R.id.video_item_poster)

        // 视频名 View
        val movieName: TextView = view.findViewById(R.id.video_item_name)

        // 视频标签 View
        val movieTag: TextView = view.findViewById(R.id.video_item_tag)

        // 视频描述 View
        val movieDescription: TextView = view.findViewById(R.id.video_item_description)

        // 视频来源 View
        val movieSource: TextView = view.findViewById(R.id.video_item_source)
    }

    // 绑定视频列表项 Layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.video_item, parent, false)
        return ViewHolder(view)
    }

    // 返回视频列表项总个数
    override fun getItemCount() = videoList.size

    // 设置每个视频列表项数据
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // 取出视频数据
        val movie = videoList[position]

        // TODO:设置海报
        if (movie.poster !== "") Glide.with(BaseApplication.context)
            .load(movie.poster)
            .into(holder.moviePoster);

        // 设置视频名
        holder.movieName.text = movie.name

        // 设置视频标签
        if (movie.tag !== "") {
            // 有标签，设置标签显示组件显示
            holder.movieTag.visibility = View.VISIBLE
            holder.movieTag.text = movie.tag
        } else {
            // 这个视频没有标签，设置标签组件隐藏
            holder.movieTag.visibility = View.GONE
        }

        // 设置视频描述
        holder.movieDescription.text = movie.description

        // 设置视频来源
        holder.movieSource.text = "来源：" + movie.source

        // 设置视频项点击事件
        holder.rootView.setOnClickListener {
            VideoActivity.actionStart()
        }

    }
}