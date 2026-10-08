package com.maysa.carterinhaLeo.app.di

import com.maysa.carterinhaLeo.core.auth.AuthTokenStore
import com.maysa.carterinhaLeo.feature.login.data.repository.LoginRepository
import com.maysa.carterinhaLeo.feature.unidadecurriculares.domain.repository.UnidadeCurricularRepository

interface AppContainer {

    val loginRepository: LoginRepository

    val unidadeCurricularRepository: UnidadeCurricularRepository

    val authTokenStore: AuthTokenStore
}