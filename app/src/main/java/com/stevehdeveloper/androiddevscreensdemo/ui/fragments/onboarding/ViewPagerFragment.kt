package com.stevehdeveloper.androiddevscreensdemo.ui.fragments.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.stevehdeveloper.androiddevscreensdemo.R
import com.stevehdeveloper.androiddevscreensdemo.databinding.FragmentViewPagerBinding
import com.stevehdeveloper.androiddevscreensdemo.ui.fragments.onboarding.screens.FirstScreenFragment
import com.stevehdeveloper.androiddevscreensdemo.ui.fragments.onboarding.screens.SecondScreenFragment
import com.stevehdeveloper.androiddevscreensdemo.ui.fragments.onboarding.screens.ThirdScreenFragment


class ViewPagerFragment : Fragment() {
    private lateinit var binding : FragmentViewPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentViewPagerBinding.inflate(inflater, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FirstScreenFragment(),
            SecondScreenFragment(),
            ThirdScreenFragment()
        )

        val adapter = ViewPagerAdapter(
           fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )


        binding.MyViewpager.adapter = adapter

        return binding.root
    }



}