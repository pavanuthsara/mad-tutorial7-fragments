package com.example.tutorial7

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FragmentViewModel : ViewModel(){
    public val backgroundColor = MutableLiveData<Int>()
    fun getBackgroundColor(): LiveData<Int> {
        return backgroundColor
    }
    fun setBackground(color:Int){
        backgroundColor.value = color
    }

}