package com.example.footballbadgequiz

import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class SplashScreen : AppCompatActivity() {
    private val SPLASH_TIME_OUT:Long = 3000 // 1 sec
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

    Handler().postDelayed({
        // This method will be executed once the timer is over
        // Start your app main activity

        startActivity(Intent(this, MainActivity::class.java))

        // close this activity
        finish()
    }, SPLASH_TIME_OUT)
}
}