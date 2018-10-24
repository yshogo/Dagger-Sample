package com.example.shogoyamada.dagger2_sample.di

import com.example.shogoyamada.dagger2_sample.ActivityScoped
import com.example.shogoyamada.dagger2_sample.MainActivity
import com.example.shogoyamada.dagger2_sample.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [
        MainModule::class]
    )
    internal abstract fun mainActivity(): MainActivity
}