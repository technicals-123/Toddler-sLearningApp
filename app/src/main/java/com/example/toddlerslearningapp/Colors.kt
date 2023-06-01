
package com.example.toddlerslearningapp
//code1
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//
//import android.view.View
//import android.widget.Button
//import  android.media.MediaPlayer
//import android.net.Uri
//
//import kotlinx.android.synthetic.main.activity_colors.*
//
//class Colors : AppCompatActivity(), View.OnClickListener {
//    var mp = MediaPlayer()
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_colors)
//        var blue = findViewById<Button>(R.id.blue)
//        var orange = findViewById<Button>(R.id.orange)
//        var black = findViewById<Button>(R.id.black)
//        var red = findViewById<Button>(R.id.red)
//        var pink=findViewById<Button>(R.id.pink)
//        var Yellow=findViewById<Button>(R.id.Yellow)
//        var green=findViewById<Button>(R.id.green)
//        var brown=findViewById<Button>(R.id.brown)
//
//
//        blue.setOnClickListener(this)
//        orange.setOnClickListener(this)
//        black.setOnClickListener(this)
//        red.setOnClickListener(this)
//        pink.setOnClickListener(this)
//        Yellow.setOnClickListener(this)
//        green.setOnClickListener(this)
//        brown.setOnClickListener(this)
//    }
//
//    override fun onClick(v: View) {
//
//        when (v.id) {
//            R.id.red ->    red.setOnClickListener {
//                mp.setDataSource(this, Uri.parse("android.resource://" + this.packageName + "/" + R.raw.red))
//                mp.prepare()
//                mp.start()
//            }
//            R.id.blue -> blue.setOnClickListener {
//                mp.setDataSource(this, Uri.parse("android.resource://" + this.packageName + "/" + R.raw.blue))
//                mp.prepare()
//                mp.start()
//            }
//            R.id.orange -> orange.setOnClickListener {
//                mp.setDataSource(this, Uri.parse("android.resource://" + this.packageName + "/" + R.raw.orange))
//                mp.prepare()
//                mp.start()
//            }
//            R.id.black -> black.setOnClickListener {
//                mp.setDataSource(this, Uri.parse("android.resource://" + this.packageName + "/" + R.raw.black))
//                mp.prepare()
//                mp.start()
//            }
//            R.id.pink -> pink.setOnClickListener {
//                mp.setDataSource(this, Uri.parse("android.resource://" + this.packageName + "/" + R.raw.pink))
//                mp.prepare()
//                mp.start()
//            }
//            R.id.Yellow ->  Yellow.setOnClickListener {
//                mp.setDataSource(this, Uri.parse("android.resource://" + this.packageName + "/" + R.raw.yellow))
//                mp.prepare()
//                mp.start()
//            }
//            R.id.green -> green.setOnClickListener {
//                mp.setDataSource(this, Uri.parse("android.resource://" + this.packageName + "/" + R.raw.green))
//                mp.prepare()
//                mp.start()
//            }
//            R.id.brown -> brown.setOnClickListener {
//                mp.setDataSource(this, Uri.parse("android.resource://" + this.packageName + "/" + R.raw.brown))
//                mp.prepare()
//                mp.start()
//            }
//        }
//
//    }
//}
//code1 close

//code2
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import  android.media.MediaPlayer
//import android.net.Uri
//import android.widget.Button
//class Colors : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_colors)
//        var play = findViewById<Button>(R.id.red)
//        var blue = findViewById<Button>(R.id.blue)
//        var orange=findViewById<Button>(R.id.orange)
//        var black=findViewById<Button>(R.id.black)
//        var pink=findViewById<Button>(R.id.pink)
//        var yellow=findViewById<Button>(R.id.Yellow)
//        var green=findViewById<Button>(R.id.green)
//        var brown=findViewById<Button>(R.id.brown)
//        var mp = MediaPlayer()
//        //original code
//        for(i:Int in 0..10) {
//            play.setOnClickListener {
//                mp.setDataSource(
//                    this,
//                    Uri.parse("android.resource://" + this.packageName + "/" + R.raw.red)
//                )
//                mp.prepare()
//                mp.start()
//            }
//            blue.setOnClickListener {
//                mp.setDataSource(
//                    this,
//                    Uri.parse("android.resource://" + this.packageName + "/" + R.raw.blue)
//                )
//                mp.prepare()
//                mp.start()
//            }
//            orange.setOnClickListener {
//                mp.setDataSource(
//                    this,
//                    Uri.parse("android.resource://" + this.packageName + "/" + R.raw.orange)
//                )
//                mp.prepare()
//                mp.start()
//            }
//            black.setOnClickListener {
//                mp.setDataSource(
//                    this,
//                    Uri.parse("android.resource://" + this.packageName + "/" + R.raw.black)
//                )
//                mp.prepare()
//                mp.start()
//            }
//            pink.setOnClickListener {
//                mp.setDataSource(
//                    this,
//                    Uri.parse("android.resource://" + this.packageName + "/" + R.raw.pink)
//                )
//                mp.prepare()
//                mp.start()
//            }
//            yellow.setOnClickListener {
//                mp.setDataSource(
//                    this,
//                    Uri.parse("android.resource://" + this.packageName + "/" + R.raw.yellow)
//                )
//                mp.prepare()
//                mp.start()
//            }
//            green.setOnClickListener {
//                mp.setDataSource(
//                    this,
//                    Uri.parse("android.resource://" + this.packageName + "/" + R.raw.green)
//                )
//                mp.prepare()
//                mp.start()
//            }
//            brown.setOnClickListener {
//                mp.setDataSource(
//                    this,
//                    Uri.parse("android.resource://" + this.packageName + "/" + R.raw.brown)
//                )
//                mp.prepare()
//                mp.start()
//            }
//        }
//        //original code over
//
//
//
//    }
//} //original

//code2 close
//code 3
//
import androidx.appcompat.app.AppCompatActivity
import android.media.SoundPool
import android.os.Bundle
import android.os.Build
import android.media.AudioAttributes
import android.media.AudioManager
import android.view.View

class Colors : AppCompatActivity() {
    private var soundPool: SoundPool? = null
    private var sound1 = 0
    private var sound2 = 0
    private var sound3 = 0
    private var sound4 = 0
    private var sound5 = 0
    private var sound6 = 0
    private var sound7 = 0
    private var sound8 = 0
    private var sound3StreamId = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_colors)
        soundPool = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val audioAttributes = AudioAttributes.Builder().setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION).setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION).build()
            SoundPool.Builder().setMaxStreams(8).setAudioAttributes(audioAttributes).build()
        } else {
            SoundPool(8, AudioManager.STREAM_MUSIC, 0)
        }
        sound1 = soundPool!!.load(this, R.raw.red, 1)
        sound2 = soundPool!!.load(this, R.raw.blue, 1)
        sound3 = soundPool!!.load(this, R.raw.orange, 1)
        sound4 = soundPool!!.load(this, R.raw.black, 1)
        sound5 = soundPool!!.load(this, R.raw.pink, 1)
        sound6 = soundPool!!.load(this, R.raw.yellow, 1)
        sound7 = soundPool!!.load(this, R.raw.green, 1)
        sound8 = soundPool!!.load(this, R.raw.brown, 1)
    }

    fun playSound(v: View) {
        when (v.id) {
            R.id.red -> soundPool!!.play(sound1, 1f, 1f, 0, 0, 1f)
            R.id.blue -> soundPool!!.play(sound2, 1f, 1f, 0, 0, 1f)
            R.id.orange -> sound3StreamId = soundPool!!.play(sound3, 1f, 1f, 0, 0, 1f)
            R.id.black -> soundPool!!.play(sound4, 1f, 1f, 0, 0, 1f)
            R.id.pink -> soundPool!!.play(sound5, 1f, 1f, 0, 0, 1f)
            R.id.Yellow -> soundPool!!.play(sound6, 1f, 1f, 0, 0, 1f)
            R.id.green -> soundPool!!.play(sound7, 1f, 1f, 0, 0, 1f)
            R.id.brown -> soundPool!!.play(sound8, 1f, 1f, 0, 0, 1f)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        soundPool!!.release()
        soundPool = null
    }
}
//code3 closes