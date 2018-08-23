package com.edan.www.navigationdemo.bottomnavgation

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.View
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.edan.www.navigationdemo.R


class BottomNavigationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        val navigation = findViewById<View>(R.id.navigation) as BottomNavigationView
        val fragmentManager = supportFragmentManager
        val navHostFragment = fragmentManager.findFragmentById(R.id.frag_nav_bottom_navigation) as NavHostFragment
        val navController = navHostFragment.navController
        NavigationUI.setupWithNavController(navigation, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this, R.id.frag_nav_bottom_navigation).navigateUp()
    }
}
