package com.java.scopingfunctionsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun goToLetActivity(view: View) {
        val intent = Intent(this@MainActivity,LetActivity::class.java)
        startActivity(intent)
    }

    fun goToRunActivity(view: View) {
        val intent = Intent(this@MainActivity,RunActivity::class.java)
        startActivity(intent)
    }

    fun goToWithActivity(view: View) {
        val intent = Intent(this@MainActivity,WithActivity::class.java)
        startActivity(intent)
    }

    fun goToApplyActivity(view: View) {
        val intent = Intent(this@MainActivity,ApplyActivity::class.java)
        startActivity(intent)
    }

    fun goToAlsoActivity(view: View) {
        val intent = Intent(this@MainActivity,AlsoActivity::class.java)
        startActivity(intent)
    }


}
