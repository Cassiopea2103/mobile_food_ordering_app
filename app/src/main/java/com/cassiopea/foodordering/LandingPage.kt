package com.cassiopea.foodordering

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.cassiopea.foodordering.databinding.LandingBinding

class LandingPage : AppCompatActivity () , View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // set content view :
        val binding : LandingBinding = LandingBinding.inflate ( layoutInflater )

        setContentView ( binding.root )

        // initialize views :
        val nextButton :AppCompatButton = binding.nextButton

        nextButton.setOnClickListener ( this )
    }


    override fun onClick( landingpage : View ) {
        val loginIntent = Intent ( applicationContext , Login::class.java )
        startActivity ( loginIntent )
        finish ()
    }

}