package com.cassiopea.foodordering

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.cassiopea.foodordering.databinding.ActivityHomeBinding

class Home : AppCompatActivity () {

    private lateinit var binding : ActivityHomeBinding
    override fun onCreate ( savedInstanceState : Bundle ? ) {

        super.onCreate ( savedInstanceState )
        binding = ActivityHomeBinding.inflate ( layoutInflater )
        setContentView ( binding.root )

        val navHostFragment = supportFragmentManager.findFragmentById ( R.id.fragment_navigation_container ) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bottomNavigation.setupWithNavController( navController )

    }
}