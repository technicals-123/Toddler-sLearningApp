package com.example.toddlerslearningapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_alphabets2.*

class alphabets2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabets2)
        var name= intent.getStringExtra("name")?.toLowerCase()
        Toast.makeText(applicationContext,name, Toast.LENGTH_LONG).show()
        var id=resources.getIdentifier(name,"drawable",packageName)
        imageView.setImageResource(id)
        var mid=resources.getIdentifier(name,"raw",packageName)
        var mp= MediaPlayer.create(applicationContext,mid)
        mp.start()
    }
}