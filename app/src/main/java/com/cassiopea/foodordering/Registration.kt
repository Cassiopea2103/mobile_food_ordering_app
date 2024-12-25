package com.cassiopea.foodordering

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.cassiopea.foodordering.databinding.RegistrationBinding

class Registration : AppCompatActivity () , View.OnClickListener {

    private lateinit var binding : RegistrationBinding

    override fun onCreate ( savedInstanceState : Bundle? ) {
        super.onCreate ( savedInstanceState )
        binding = RegistrationBinding.inflate ( layoutInflater )
        setContentView ( binding.root )

        // set login button click listener :
        val loginButton : AppCompatButton = binding.loginOptionButton
        loginButton.setOnClickListener ( this )
    }

    override fun onClick ( registrationView : View ) {
        if ( registrationView.id == binding.loginOptionButton.id ) {
            val loginIntent = Intent ( applicationContext , Login::class.java )
            startActivity ( loginIntent )
            finish ()
        }
    }
}