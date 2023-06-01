package com.example.toddlerslearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_rhymes.*

class Rhymes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rhymes)
        //for bits of paper
        bitsofpaper.setOnClickListener {
            val intent1 = Intent(this, Bitsofpaper::class.java)
            startActivity(intent1)
        }
        //for jack and jill
        jackandjill.setOnClickListener {
            val intent2 = Intent(this, Jackandjill::class.java)
            startActivity(intent2)
        }
        humpty_dumpty.setOnClickListener {
            val intent3 = Intent(this, Humptydumpty::class.java)
            startActivity(intent3)
        }
        rainrain.setOnClickListener {
            val intent4 = Intent(this, Rainrain::class.java)
            startActivity(intent4)
        }
        littlemonkey.setOnClickListener {
            val intent5 = Intent(this, Littlemonkey::class.java)
            startActivity(intent5)
        }
    }
}