package com.example.lucaslima.bottomappbar

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.view.Gravity
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_bottom_bar_2.*

class About : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        setSupportActionBar(bottom_app_bar)

        val link_email = "mailto:developer.app.lln@gmail.com"
        val link_facebook = "https://www.facebook.com/profile.php?id=100004399720527"
        val link_github = "https://github.com/lucaslima777"
        val link_linkedin = "https://linkedin.com/in/lucas-lima-torre"


        val fab = findViewById(R.id.fab) as FloatingActionButton
        val email = findViewById(R.id.envelope) as ImageView
        val text_email = findViewById(R.id.textview_envelope) as TextView
        val facebook = findViewById(R.id.facebook) as ImageView
        val text_facebook = findViewById(R.id.textview_facebook) as TextView
        val github = findViewById(R.id.github) as ImageView
        val text_github = findViewById(R.id.textview_github) as TextView
        val linkedin = findViewById(R.id.linkedin) as ImageView
        val text_linkedin = findViewById(R.id.textview_linkedin) as TextView

        email.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse(link_email))
            startActivity(i)
        }

        text_email.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse(link_email))
            startActivity(i)
        }

        facebook.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse(link_facebook))
            startActivity(i)
        }

        text_facebook.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse(link_facebook))
            startActivity(i)
        }

        github.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse(link_github))
            startActivity(i)
        }

        text_github.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse(link_github))
            startActivity(i)
        }

        linkedin.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse(link_linkedin))
            startActivity(i)
        }

        text_linkedin.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse(link_linkedin))
            startActivity(i)
        }


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
