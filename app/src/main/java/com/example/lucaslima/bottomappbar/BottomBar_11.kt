package com.example.lucaslima.bottomappbar

import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.CoordinatorLayout
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_bottom_bar_11.*

class BottomBar_11 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_bar_11)
        setSupportActionBar(bottom_app_bar)


        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#f12711")));

        fab.setOnClickListener {
            toast("Fab clicked!")
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_3, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val intent = Intent(this, Principal::class.java)

        when (item!!.itemId) {
            R.id.email -> toast("Email clicked!")
            R.id.trash -> toast("Trash clicked!")
            R.id.download -> toast("Download clicked!")
        }


        if (item.itemId == android.R.id.home){
            startActivity(intent)
            finish()
        }
        return true
    }

    override fun onBackPressed() {
        val intent = Intent(this, Principal::class.java)
        startActivity(intent)
        finish()
        super.onBackPressed()
    }

    fun Context.toast(message: CharSequence) {
        val toast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.BOTTOM, 0, 325)
        toast.show()
    }

}
