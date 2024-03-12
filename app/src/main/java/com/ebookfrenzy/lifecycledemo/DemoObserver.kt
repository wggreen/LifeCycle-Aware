package com.ebookfrenzy.lifecycledemo

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import com.ebookfrenzy.lifecycledemo.MainViewModel
import java.text.SimpleDateFormat
import java.util.*

class DemoObserver: DefaultLifecycleObserver {
    private val TAG = "DemoObserver"
    var mv = MainViewModel

    override fun onCreate(owner: LifecycleOwner) {
        Log.i(TAG, "onCreate")
        val currentTime = System.currentTimeMillis()
        val formattedTime = SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault()).format(Date(currentTime))
        mv.addObservation("onCreate was fired on: $formattedTime")
    }
    override fun onResume(owner: LifecycleOwner) {
        Log.i(TAG, "onResume")
        val currentTime = System.currentTimeMillis()
        val formattedTime = SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault()).format(Date(currentTime))
        mv.addObservation("onResume was fired on: $formattedTime")
        mv.addObservation("**********")
    }
    override fun onPause(owner: LifecycleOwner) {
        Log.i(TAG, "onPause")
        val currentTime = System.currentTimeMillis()
        val formattedTime = SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault()).format(Date(currentTime))
        mv.addObservation("onPause was fired on: $formattedTime")
        mv.addObservation("**********")
    }
    override fun onStart(owner: LifecycleOwner) {
        Log.i(TAG, "onStart")
        val currentTime = System.currentTimeMillis()
        val formattedTime = SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault()).format(Date(currentTime))
        mv.addObservation("onStart was fired on: $formattedTime")
    }
    override fun onStop(owner: LifecycleOwner) {
        Log.i(TAG, "onStop")
        val currentTime = System.currentTimeMillis()
        val formattedTime = SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault()).format(Date(currentTime))
        mv.addObservation("onStop was fired on: $formattedTime")
    }
    override fun onDestroy(owner: LifecycleOwner) {
        Log.i(TAG, "onDestroy")
        val currentTime = System.currentTimeMillis()
        val formattedTime = SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault()).format(Date(currentTime))
        mv.addObservation("onDestroy was fired on: $formattedTime")
        mv.addObservation("**********")
    }
}