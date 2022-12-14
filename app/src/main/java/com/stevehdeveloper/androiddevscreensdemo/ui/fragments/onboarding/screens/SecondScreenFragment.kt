package com.stevehdeveloper.androiddevscreensdemo.ui.fragments.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.stevehdeveloper.androiddevscreensdemo.R
import com.stevehdeveloper.androiddevscreensdemo.databinding.FragmentSecondScreenBinding


class SecondScreenFragment : Fragment() {

    private lateinit var binding: FragmentSecondScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondScreenBinding.inflate(inflater, container, false)

        val viewPager: ViewPager2? = activity?.findViewById(R.id.MyViewpager)

        binding.next2.setOnClickListener {
           viewPager?.currentItem = 2
        }



        return binding.root
    }

}