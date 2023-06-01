package com.example.toddlerslearningapp

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView

class Littlemonkey : AppCompatActivity() {
    var videoView: VideoView? = null
    var mediaController :MediaController? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_littlemonkey)
        videoView= findViewById<View>(R.id.video_view) as VideoView?
        if(mediaController==null)
        {
            mediaController= MediaController(this)
            mediaController!!.setAnchorView(this.videoView)
        }
        videoView!!.setMediaController(mediaController)
        videoView!!.setVideoURI(Uri.parse("android.resource://"+packageName+"/"+R.raw.littlemonkey))
        videoView!!.requestFocus()
        videoView!!.start()
        videoView!!.setOnCompletionListener {
            Toast.makeText(applicationContext,"Video End", Toast.LENGTH_LONG).show()
        }
    }
}