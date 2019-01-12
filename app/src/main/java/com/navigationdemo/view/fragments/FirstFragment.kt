package com.navigationdemo.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.navigationdemo.R

class FirstFragment : BaseFragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        mView = inflater.inflate(R.layout.first_fragment, container, false)

        mView.findViewById<Button>(R.id.nextScreen).setOnClickListener {

            Navigation.findNavController(mView).navigate(R.id.action_firstFragment_to_secondFragment)
        }

        return mView
    }
}