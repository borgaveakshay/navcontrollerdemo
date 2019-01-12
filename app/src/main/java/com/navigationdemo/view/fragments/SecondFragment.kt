package com.navigationdemo.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.navigationdemo.R

class SecondFragment : BaseFragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        mView = inflater.inflate(R.layout.second_fragment, container, false)

        mView.findViewById<Button>(R.id.moveBack).setOnClickListener {

            Navigation.findNavController(mView).navigate(R.id.action_secondFragment_to_firstFragment)
        }
        return mView
    }
}