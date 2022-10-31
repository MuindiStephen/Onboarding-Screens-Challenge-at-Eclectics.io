package com.stevehdeveloper.androiddevscreensdemo.ui.fragments.onboarding.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.stevehdeveloper.androiddevscreensdemo.R
import com.stevehdeveloper.androiddevscreensdemo.databinding.FragmentThirdScreenBinding


class ThirdScreenFragment : Fragment() {

    private lateinit var binding: FragmentThirdScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentThirdScreenBinding.inflate(inflater, container, false)

        binding.finish.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_loginFragment)
            onBoardingFinished()
        }

        return binding.root
    }

    // save the value to ensure that onBoarding has been done
    private fun onBoardingFinished() {
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
//        val editor = sharedPref.edit()
//        editor.putBoolean("Finished", true)
//        editor.apply()

        sharedPref.edit().putBoolean("Finished", true).apply()
    }


}