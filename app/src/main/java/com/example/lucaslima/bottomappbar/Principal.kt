package com.example.lucaslima.bottomappbar


import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.support.design.bottomappbar.BottomAppBar
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.NavigationView
import android.support.v4.content.ContextCompat
import android.support.v4.view.GravityCompat
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.lucaslima.bottomappbar.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_bottomappbar.*




class Principal : AppCompatActivity() {

    val linkedin = "https://linkedin.com/in/lucas-lima-torre"
    val github = "https://github.com/lucaslima777"
    val email = "mailto:developer.app.lln@gmail.com"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.principal)
        setSupportActionBar(bottom_app_bar)
        val fab = findViewById(R.id.fab) as FloatingActionButton
        val navigationView = findViewById(R.id.navigation_view) as NavigationView

        navigationView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.profile -> {
                    val i = Intent(Intent.ACTION_VIEW, Uri.parse(linkedin))
                    startActivity(i)
                    drawer_layout.closeDrawer(Gravity.START)
                    true
                }
                R.id.projects -> {
                    val i = Intent(Intent.ACTION_VIEW, Uri.parse(github))
                    startActivity(i)
                    drawer_layout.closeDrawer(Gravity.START)
                    true
                }

                R.id.inbox -> {
                    val i = Intent(Intent.ACTION_VIEW, Uri.parse(email))
                    startActivity(i)
                    drawer_layout.closeDrawer(Gravity.START)
                    true
                }

                R.id.about -> {
                    val intent = Intent(this, About::class.java)
                    startActivity(intent)
                    finish()
                    drawer_layout.closeDrawer(Gravity.START)
                    true
                }

                R.id.license -> {
                    val intent = Intent(this, License::class.java)
                    startActivity(intent)
                    finish()
                    drawer_layout.closeDrawer(Gravity.START)
                    true
                }
                else -> false
            }
        }

        fab.setOnClickListener {
            toast("Fab")
        }

        val button_1 = findViewById(R.id.button_1) as Button
        button_1.setOnClickListener {
            val intent = Intent(this, BottomBar_1::class.java)
            startActivity(intent)
            finish()
        }

        val button_2 = findViewById(R.id.button_2) as Button
        button_2.setOnClickListener {
            val intent = Intent(this, BottomBar_2::class.java)
            startActivity(intent)
            finish()
        }

        val button_3 = findViewById(R.id.button_3) as Button
        button_3.setOnClickListener {
            val intent = Intent(this, BottomBar_3::class.java)
            startActivity(intent)
            finish()
        }

        val button_4 = findViewById(R.id.button_4) as Button
        button_4.setOnClickListener {
            val intent = Intent(this, BottomBar_4::class.java)
            startActivity(intent)
            finish()
        }

        val button_5 = findViewById(R.id.button_5) as Button
        button_5.setOnClickListener {
            val intent = Intent(this, BottomBar_5::class.java)
            startActivity(intent)
            finish()
        }

        val button_6 = findViewById(R.id.button_6) as Button
        button_6.setOnClickListener {
            val intent = Intent(this, BottomBar_6::class.java)
            startActivity(intent)
            finish()
        }

        val button_7 = findViewById(R.id.button_7) as Button
        button_7.setOnClickListener {
            val intent = Intent(this, BottomBar_7::class.java)
            startActivity(intent)
            finish()
        }

        val button_8 = findViewById(R.id.button_8) as Button
        button_8.setOnClickListener {
            val intent = Intent(this, BottomBar_8::class.java)
            startActivity(intent)
            finish()
        }

        val button_9 = findViewById(R.id.button_9) as Button
        button_9.setOnClickListener {
            val intent = Intent(this, BottomBar_9::class.java)
            startActivity(intent)
            finish()
        }

        val button_10 = findViewById(R.id.button_10) as Button
        button_10.setOnClickListener {
            val intent = Intent(this, BottomBar_10::class.java)
            startActivity(intent)
            finish()
        }

        val button_11 = findViewById(R.id.button_11) as Button
        button_11.setOnClickListener {
            val intent = Intent(this, BottomBar_11::class.java)
            startActivity(intent)
            finish()
        }


    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId) {
            //R.id.profile -> toast("Fav menu item is clicked!")
            //R.id.app_bar_search -> toast("Search menu item is clicked!")
            //R.id.app_bar_settings -> toast("Settings item is clicked!")
            android.R.id.home -> drawer_layout.openDrawer(Gravity.START)
        }
        return true
    }

    fun Context.toast(message: CharSequence) {
        val toast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.BOTTOM, 0, 325)
        toast.show()
    }

}