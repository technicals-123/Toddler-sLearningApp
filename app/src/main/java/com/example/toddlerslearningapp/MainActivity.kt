package com.example.toddlerslearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
//    private lateinit var tvRedirectSignUp: TextView
//    lateinit var etEmail: EditText
//    private lateinit var etPass: EditText
//    lateinit var btnLogin: Button
    // Creating firebaseAuth object
//    lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // View Binding
//        tvRedirectSignUp = findViewById(R.id.tvRedirectSignUp)
//        btnLogin = findViewById(R.id.btnLogin)
//        etEmail = findViewById(R.id.etEmailAddress)
//        etPass = findViewById(R.id.etPassword)
//
//        // initialising Firebase auth object
//        auth = FirebaseAuth.getInstance()

//        btnLogin.setOnClickListener {
//            login()
//        }

//        tvRedirectSignUp.setOnClickListener {
//            val intent = Intent(this, MainPage::class.java)
//            startActivity(intent)
//            // using finish() to end the activity
//            finish()
//        }
//    }


//    private fun login() {
//        val email = etEmail.text.toString()
//        val pass = etPass.text.toString()
        // calling signInWithEmailAndPassword(email, pass)
        // function using Firebase auth object
        // On successful response Display a Toast
//        auth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(this)
//        {
//            if (it.isSuccessful) {
//                Toast.makeText(this, "Successfully LoggedIn", Toast.LENGTH_SHORT).show()
////
//                //}
//
//            }
//            else
//                Toast.makeText(this, "Log in successful ", Toast.LENGTH_SHORT).show()
//            btnLogin.setOnClickListener {
//                    val intent=Intent(this,MainPage::class.java)
//                    startActivity(intent)
//            }
//        }

//        for page change alphabet
        btnLogin.setOnClickListener{
            val intent1=Intent(this,MainPage::class.java)
            startActivity(intent1)
                             }

    }
}