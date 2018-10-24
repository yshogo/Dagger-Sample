package com.example.shogoyamada.dagger2_sample.ui.main

import javax.inject.Inject

class MainUseCase @Inject constructor() {

    fun getGreeting() = "ハロー ダガーさん"
}