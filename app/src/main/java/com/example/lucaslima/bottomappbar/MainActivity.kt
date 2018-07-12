package com.example.bottomappbar

import android.content.Context
import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.lucaslima.bottomappbar.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_bottomappbar.*




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(bottom_app_bar)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.bottomappbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId) {
            R.id.app_bar_fav -> toast("Fav menu item is clicked!")
            R.id.app_bar_search -> toast("Search menu item is clicked!")
            R.id.app_bar_settings -> toast("Settings item is clicked!")
            //android.R.id.home -> drawer_layout.openDrawer(Gravity.START)
        }
        return true
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawers()
            return
        }

        super.onBackPressed()
    }


    // Create an extension method for easy Toast call
    fun Context.toast(message: CharSequence) {
        val toast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.BOTTOM, 0, 325)
        toast.show()
    }

}
