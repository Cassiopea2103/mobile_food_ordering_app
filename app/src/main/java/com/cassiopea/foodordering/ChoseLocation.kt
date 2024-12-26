package com.cassiopea.foodordering

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.cassiopea.foodordering.databinding.ActivityChoseLocationBinding

class ChoseLocation : AppCompatActivity ()  {

    private lateinit var binding : ActivityChoseLocationBinding


    override fun onCreate ( savedInstanceState : Bundle? ) {
        super.onCreate ( savedInstanceState ) ;
        binding = ActivityChoseLocationBinding.inflate ( layoutInflater )
        setContentView ( binding.root )

        val locations = arrayOf ( "Nord-Foire" , "Keur Gorgui" , "Sacre-Coeur" , "Medina" , "Yoff" )
        val adapter = ArrayAdapter ( this , android.R.layout.simple_list_item_1 , locations )

        val location_select = binding.locationSelect
        location_select.setAdapter ( adapter )

        
    }
}