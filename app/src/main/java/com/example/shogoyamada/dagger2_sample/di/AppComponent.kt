package com.google.samples.apps.iosched.di

import com.example.shogoyamada.dagger2_sample.MainApplication
import com.example.shogoyamada.dagger2_sample.di.ActivityModule
import com.example.shogoyamada.dagger2_sample.di.ViewModelModule
import com.example.shogoyamada.dagger2_sample.ui.main.MainViewModel
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Main component of the app, created and persisted in the Application class.
 *
 * Whenever a new module is created, it should be added to the list of modules.
 * [AndroidSupportInjectionModule] is the module from Dagger.Android that helps with the
 * generation and location of subcomponents.
 */
@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityModule::class,
        ViewModelModule::class,
        AppModule::class
    ]
)
interface AppComponent : AndroidInjector<MainApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MainApplication>()
}
