package com.example.toddlerslearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pbook.*

class Pbook : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pbook)
        //for fruits
        fruit.setOnClickListener{
            val intent1= Intent(this,Fruit::class.java)
            startActivity(intent1)
        }
        //for vegatables
        vegatables.setOnClickListener{
            val intent2= Intent(this,Vegetable::class.java)
            startActivity(intent2)
        }
        //for flowers
        flowers.setOnClickListener{
            val intent3= Intent(this,Flower::class.java)
            startActivity(intent3)
        }
        //for birds
        birds.setOnClickListener{
            val intent4= Intent(this,Bird::class.java)
            startActivity(intent4)
        }
       //sea animals
        seaanimal.setOnClickListener{
            val intent5= Intent(this,Seaanimal::class.java)
            startActivity(intent5)
        }
       //butterfly
       butterflies.setOnClickListener{
           val intent6= Intent(this,Butterfly::class.java)
           startActivity(intent6)
       }
    }
}