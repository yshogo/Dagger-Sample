package com.example.shogoyamada.dagger2_sample

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.example.shogoyamada.dagger2_sample.databinding.MainActivityBinding
import com.example.shogoyamada.dagger2_sample.ui.main.MainViewModel
import android.databinding.DataBindingUtil
import com.example.shogoyamada.dagger2_sample.di.ViewModelFactory
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: MainActivityBinding

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)
//        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding = DataBindingUtil.setContentView(this, R.layout.main_activity)

        binding.apply {
            viewModel = this@MainActivity.viewModel
        }
    }

}
