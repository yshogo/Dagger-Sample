package com.example.shogoyamada.dagger2_sample

import android.arch.lifecycle.ViewModel
import com.example.shogoyamada.dagger2_sample.di.ViewModelKey
import com.example.shogoyamada.dagger2_sample.ui.main.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class MainModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel
}
