package com.frezzcoding.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    /*
    TODO ON SCREEN ROTATION THE LIFECYCLE IS :
    onPause -> onStop -> onDestroy -> onCreate -> onStart -> onResume
     */

    //called first on activity open
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate")
    }

    //called second on activity open
    override fun onStart() {
        println("onStart")
        super.onStart()
    }

    //called third on activity open
    override fun onResume() {
        println("onResume")
        super.onResume()
    }

    //called first on back button press
    //called first on home/apps button press
    override fun onPause() {
        println("onPause")
        super.onPause()
    }

    //called second on home/apps button press
    override fun onStop() {
        println("onStop")
        super.onStop()
    }

    //called whenever app comes back from stop or pause state
    override fun onRestart() {
        println("onRestart")
        super.onRestart()
    }

    //called second on back button press
    override fun onDestroy() {
        println("onDestroy")
        super.onDestroy()
    }

}