package com.example.lucaslima.bottomappbar

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import kotlinx.android.synthetic.main.layout_bottom_bar_2.*

class BottomBar_10 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_bar_10)
        setSupportActionBar(bottom_app_bar)


        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FC5C7D")));

        fab.setOnClickListener {
            val intent = Intent(this, Principal::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, Principal::class.java)
        startActivity(intent)
        finish()
        super.onBackPressed()
    }
}
