package com.navigationdemo.view.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.widget.Toolbar
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController

import com.navigationdemo.R

class MainActivity : AppCompatActivity() {

    lateinit var mToolbar: Toolbar
    lateinit var mNavController: NavHostFragment
    lateinit var mBottomNavController: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mToolbar = findViewById(R.id.toolbar)
        mNavController = supportFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment
        mBottomNavController = findViewById(R.id.bottomNavigationView)
        setSupportActionBar(mToolbar)
        mNavController.navController.setGraph(R.navigation.mobile_navigation)
        mBottomNavController.setupWithNavController(mNavController.navController)

    }

}
