package com.cassiopea.foodordering

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.cassiopea.foodordering.databinding.ActivityLoginBinding

class Login : AppCompatActivity () , View.OnClickListener {

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate ( layoutInflater )
        setContentView ( binding.root )

        binding.registerOptionButton.setOnClickListener ( this )

    }

    override fun onClick ( loginView : View ) {
        if ( loginView.id == binding.registerOptionButton.id ) {
            val registerIntent = Intent ( applicationContext , Registration::class.java )
            startActivity ( registerIntent )
            finish ()
        }
    }
}