package com.example.toddlerslearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_alphabets.*

class ALPHABETS : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabets)
        var alpha=Array<String>( size = 26){ " " }
        var j=65
        for(i:Int in 0..25)
        {
            alpha[i]=Character.toString(j.toChar())
            j++
        }
        var adapter= ArrayAdapter<String>(applicationContext,android.R.layout.simple_dropdown_item_1line,alpha)
        gridview.adapter =adapter
        gridview.setOnItemClickListener { adapterView, view, i, l ->
            var intent= Intent(applicationContext,alphabets2::class.java)
            intent.putExtra("name",alpha[i])
            startActivity(intent)
        }
    }
}