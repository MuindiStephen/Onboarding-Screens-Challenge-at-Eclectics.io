package com.stevehdeveloper.androiddevscreensdemo.ui.fragments.splash

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.stevehdeveloper.androiddevscreensdemo.R
import com.stevehdeveloper.androiddevscreensdemo.databinding.FragmentSplashScreenBinding
import com.stevehdeveloper.androiddevscreensdemo.viewmodel.SplashViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.observeOn


@SuppressLint("CustomSplashScreen")
class SplashScreenFragment : Fragment() {

    private val splashViewModel: SplashViewModel by viewModels()

    private lateinit var binding: FragmentSplashScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSplashScreenBinding.inflate(inflater, container, false)

         //viewModel.
        subscribeToObservables()

        return binding.root
    }

    private fun subscribeToObservables() {
        lifecycleScope.launchWhenStarted {
            splashViewModel.stateFlow.collectLatest {
                if (it) {
                    findNavController().navigate(R.id.action_splashScreenFragment_to_viewPagerFragment)
            }else {
                findNavController().navigate(R.id.action_splashScreenFragment_to_loginFragment2)
                }
        }
    }


}

//    private fun onBoardingFinished() : Boolean{
//        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
//        return sharedPref.getBoolean("Finished", false)
//    }
}