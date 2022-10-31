package com.stevehdeveloper.androiddevscreensdemo.ui.fragments.onboarding.screens

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.stevehdeveloper.androiddevscreensdemo.R
import com.stevehdeveloper.androiddevscreensdemo.databinding.FragmentFirstScreenBinding
import com.stevehdeveloper.androiddevscreensdemo.databinding.FragmentViewPagerBinding

class FirstScreenFragment : Fragment() {

    private lateinit var binding: FragmentFirstScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstScreenBinding.inflate(inflater, container, false)

       // val viewPager = activity?.findViewById<ViewPager2>(R.id.MyViewpager)
        val viewPager2: ViewPager2? = activity?.findViewById(R.id.MyViewpager)

        binding.next.setOnClickListener {
            viewPager2?.currentItem = 1
        }

        return binding.root
    }

}