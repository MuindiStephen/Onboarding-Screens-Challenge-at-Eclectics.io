package com.stevehdeveloper.androiddevscreensdemo.viewmodel

import android.os.Handler
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow

class SplashViewModel : ViewModel () {
//var myValue:MutableLiveData<Boolean> = MutableLiveData<Boolean>()
//    private val _liveData = MutableLiveData(false)
//    val liveData: LiveData<Boolean> = _liveData


    //StateFlow updates the state and it just works close like LiveData observable
    private val _stateFlow = MutableStateFlow(true)
    val stateFlow = _stateFlow.asStateFlow()

    //Shared Flow
//    private val _sharedFlow = MutableSharedFlow<Boolean>()
//    val sharedFlow = _sharedFlow.asSharedFlow()

    fun setValue() {
        Handler().postDelayed(
            {
                _stateFlow.value = true
            }, 3000
        )
    }
}