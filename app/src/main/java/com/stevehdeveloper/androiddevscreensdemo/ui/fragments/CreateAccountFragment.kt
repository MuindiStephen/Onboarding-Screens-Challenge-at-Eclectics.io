package com.stevehdeveloper.androiddevscreensdemo.ui.fragments

import android.app.ActionBar
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.stevehdeveloper.androiddevscreensdemo.R
import com.stevehdeveloper.androiddevscreensdemo.databinding.FragmentCreateAccountBinding


class CreateAccountFragment : Fragment() {

    private lateinit var binding: FragmentCreateAccountBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {




        binding = FragmentCreateAccountBinding.inflate(inflater, container, false)

        binding.textView3.setOnClickListener {
            findNavController().navigate(R.id.action_createAccountFragment_to_loginFragment)
        }

        binding.backToLogin.setOnClickListener {
            findNavController().navigate(R.id.action_createAccountFragment_to_loginFragment)
        }
        return binding.root
    }

}