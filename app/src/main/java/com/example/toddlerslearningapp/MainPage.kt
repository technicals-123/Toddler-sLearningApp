package com.example.toddlerslearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

import kotlinx.android.synthetic.main.activity_main_page.*

class MainPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)
        //for page change alphabet
        alpha.setOnClickListener{
            val intent= Intent(this,ALPHABETS::class.java)
            startActivity(intent)
        }
        //for page change game
        game.setOnClickListener{
            val intent1= Intent(this,Game::class.java)
            startActivity(intent1)
        }
        //for rhymes page
        rhymes.setOnClickListener{
            val intent2= Intent(this,Rhymes::class.java)
            startActivity(intent2)
        }
        //for painting app
        painting.setOnClickListener{
            val intent3= Intent(this,Painting::class.java)
            startActivity(intent3)
        }
//        //for colors
        colors.setOnClickListener{
            val intent5= Intent(this,Colors::class.java)
            startActivity(intent5)
        }
//
        //for picture book
        pbook.setOnClickListener{
            val intent4= Intent(this,Pbook::class.java)
            startActivity(intent4)
        }

    }
}