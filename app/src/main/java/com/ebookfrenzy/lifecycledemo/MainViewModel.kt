package com.ebookfrenzy.lifecycledemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    companion object {
        private var outputList: MutableList<String> = mutableListOf()
        private var output: MutableLiveData<String> = MutableLiveData()

        fun addObservation(observation: String) {
            if (observation.isNotEmpty()) {
                outputList.add(observation)
                updateOutput()
            }
        }

        private fun updateOutput() {
            output.value = outputList.joinToString("\n")
        }
    }

    fun getObservations(): LiveData<String> {
        return output
    }
}
