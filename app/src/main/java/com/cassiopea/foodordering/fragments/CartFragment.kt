package com.cassiopea.foodordering.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cassiopea.foodordering.R

class CartFragment : Fragment() {

    override fun onCreate ( savedInstanceState : Bundle? ) {
        super.onCreate ( savedInstanceState )
    }

    override fun onCreateView ( inflater : LayoutInflater , parent : ViewGroup ? , bundle : Bundle ? ) : View ? {
        return inflater.inflate ( R.layout.fragment_cart , parent , false )
    }
}