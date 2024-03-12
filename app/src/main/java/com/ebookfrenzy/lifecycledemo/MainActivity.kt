package com.ebookfrenzy.lifecycledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ebookfrenzy.lifecycledemo.DemoObserver
import com.ebookfrenzy.lifecycledemo.DemoOwner
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var demoOwner: DemoOwner
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        setContentView(R.layout.activity_main)

        demoOwner = DemoOwner(this.lifecycle)
        demoOwner.startOwner()
        demoOwner.stopOwner()

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }

    }

}