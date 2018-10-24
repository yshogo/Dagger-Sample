package com.example.shogoyamada.dagger2_sample.ui.main

import android.arch.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(useCase: MainUseCase) : ViewModel() {
    var test = useCase.getGreeting()
}
