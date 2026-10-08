package com.maysa.carterinhaLeo.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.maysa.carterinhaLeo.app.di.AppContainer
import com.maysa.carterinhaLeo.app.navigation.AppNavHost
import com.maysa.carterinhaLeo.core.designsystem.theme.CarteirinhaDigital2DEVEST_BTheme

@Composable
fun App(container: AppContainer) {
    CarteirinhaDigital2DEVEST_BTheme() {
        val navController = rememberNavController()
        AppNavHost(
            navController = navController,
            container = container
        )
    }
}