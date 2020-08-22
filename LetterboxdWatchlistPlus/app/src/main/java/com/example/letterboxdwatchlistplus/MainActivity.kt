package com.example.letterboxdwatchlistplus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))
        // https://medium.com/@suragch/theme-appcompat-vs-themeoverlay-appcompat-in-android-c4abdc4d9683
        // https://developer.android.com/training/appbar/setting-up
        // https://medium.com/androiddevelopers/android-styling-themes-vs-styles-ebe05f917578
        val navController = findNavController(R.id.nav_host_fragment)
        findViewById<BottomNavigationView>(R.id.bottom_nav).setupWithNavController(navController)
    }
}
