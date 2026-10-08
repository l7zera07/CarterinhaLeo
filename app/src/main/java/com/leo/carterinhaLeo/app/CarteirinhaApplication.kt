package com.maysa.carterinhaLeo.app

import android.app.Application
import com.maysa.carterinhaLeo.app.di.AppContainer
import com.maysa.carterinhaLeo.app.di.DefaultAppContainer

class CarteirinhaApplication : Application() {
    val container: AppContainer by lazy {
        DefaultAppContainer()
    }
}