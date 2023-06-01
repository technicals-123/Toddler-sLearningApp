package com.example.toddlerslearningapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import java.util.*

class Game : AppCompatActivity() {
    var startBtn: Button? = null
    var TimeTextView: TextView? = null
    var ScoreTextView: TextView? = null
    var AlertTextView: TextView? = null
    var QuestionTextView: TextView? = null
    var FinalScoreTextView: TextView? = null
    var button0: Button? = null
    var button1: Button? = null
    var button2: Button? = null
    var button3: Button? = null
    var countDownTimer: CountDownTimer? = null
    var constraintLayout: ConstraintLayout? = null
    var lastLayout: ConstraintLayout? = null
    var buttonPlayAgain: Button? = null
    var random = Random()
    var a = 0
    var b = 0
    var indexOfCorrectAnswer = 0
    var answers = ArrayList<Int>()
    var points = 0
    var totalQuestions = 0
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        startBtn = findViewById<View>(R.id.btnStart) as Button
        TimeTextView = findViewById(R.id.TimeTextView)
        ScoreTextView = findViewById(R.id.ScoreTextView)
        FinalScoreTextView = findViewById(R.id.FinalscoreTextView)
        AlertTextView = findViewById(R.id.AlertTextView)
        QuestionTextView = findViewById(R.id.QuestionTextView)
        button0 = findViewById(R.id.button0)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        buttonPlayAgain = findViewById(R.id.buttonPlayAgain)
        constraintLayout = findViewById(R.id.quizUi)
        lastLayout = findViewById(R.id.lastUi)
        lastLayout!!.setVisibility(View.INVISIBLE);
        constraintLayout!!.setVisibility(View.INVISIBLE);
    }

    @SuppressLint("SetTextI18n")
    fun NextQuestion() {
        a = random.nextInt(10)
        b = random.nextInt(10)
        QuestionTextView!!.text = "$a+$b"
        indexOfCorrectAnswer = random.nextInt(4)
        answers.clear()
        for (i in 0..3) {
            if (indexOfCorrectAnswer == i) {
                answers.add(a + b)
            } else {
                var wrongAnswer = random.nextInt(20)
                while (wrongAnswer == a + b) {
                    wrongAnswer = random.nextInt(20)
                }
                answers.add(wrongAnswer)
            }
        }
        button0!!.text = Integer.toString(answers[0])
        button1!!.text = Integer.toString(answers[1])
        button2!!.text = Integer.toString(answers[2])
        button3!!.text = Integer.toString(answers[3])
    }

    fun optionSelect(view: View) {
        totalQuestions++
        if (Integer.toString(indexOfCorrectAnswer) == view.tag.toString()) {
            points++
            AlertTextView!!.text = "Correct"
        } else {
            AlertTextView!!.text = "Wrong"
        }
        ScoreTextView!!.text = Integer.toString(points) + "/" + Integer.toString(totalQuestions)
        NextQuestion()
    }

    fun playAgain(view: View?) {
        points = 0
        totalQuestions = 0
        ScoreTextView!!.text =
            Integer.toString(points) + "/" + Integer.toString(totalQuestions)
        countDownTimer!!.start()
        lastLayout!!.visibility = View.INVISIBLE
        constraintLayout!!.visibility = View.VISIBLE
    }

    fun start(view: View?) {
        startBtn!!.visibility = View.INVISIBLE
        constraintLayout!!.visibility = View.VISIBLE
        NextQuestion()
        countDownTimer = object : CountDownTimer(30000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                TimeTextView!!.text = (millisUntilFinished / 1000).toString() + "s"
            }

            override fun onFinish() {
                TimeTextView!!.text = "Time Up!"
                FinalScoreTextView!!.text =
                    Integer.toString(points) + "/" + Integer.toString(totalQuestions)
                constraintLayout!!.visibility = View.INVISIBLE
                lastLayout!!.visibility = View.VISIBLE
            }
        }.start()
    }
}