package com.afaf.animation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    lateinit var tvLogo: TextView
    lateinit var logo : ImageView
    lateinit var background : ImageView
    lateinit var animation: LottieAnimationView
    lateinit var main : ConstraintLayout
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvLogo = findViewById(R.id.tvLogo)
        logo = findViewById(R.id.logo)
        animation = findViewById(R.id.animaition)
        main = findViewById(R.id.main)
        background = findViewById(R.id.background)
        background.animate().translationY(-2700F).setDuration(1000).setStartDelay(4000).withEndAction {

            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()

        }

        logo.animate().translationY(1700F).setDuration(1000).setStartDelay(4000)
        tvLogo.animate().translationY(1700F).setDuration(1000).setStartDelay(4000)
        animation.animate().translationY(1700F).setDuration(1000).setStartDelay(4000)

    //        handler = Handler()
//        handler.postDelayed({
//
//        val intent = Intent(this,MainActivity2::class.java)
//        startActivity(intent)
//            finish()
//        }, 5000)


    }
}