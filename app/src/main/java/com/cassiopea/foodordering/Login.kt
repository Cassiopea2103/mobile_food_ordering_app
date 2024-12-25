package com.cassiopea.foodordering

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cassiopea.foodordering.databinding.LoginBinding

class Login : AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = LoginBinding.inflate ( layoutInflater )
        setContentView ( binding.root )

    }
}