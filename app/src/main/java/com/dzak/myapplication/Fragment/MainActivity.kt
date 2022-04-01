package com.dzak.myapplication.Fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.dzak.myapplication.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //step 1
        val managefragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment? ?: return
        //step 2
        val navController = managefragment.navController
        //step 3
        val bottomnavigation : BottomNavigationView = findViewById(R.id.bottomNavigationView)

        bottomnavigation.setupWithNavController(navController)
    }

}