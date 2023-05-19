package com.tazkiyatech.material.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigationView = findViewById<NavigationView>(R.id.navigationView)

        navigationView.setNavigationItemSelectedListener {
            it.isChecked = !it.isChecked
            return@setNavigationItemSelectedListener false
        }

        val menu = navigationView.menu

        menu.findItem(R.id.option1MenuItem).isChecked = true
        menu.findItem(R.id.option2MenuItem).isChecked = true
    }
}