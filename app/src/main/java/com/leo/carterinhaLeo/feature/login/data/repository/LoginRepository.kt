package com.maysa.carterinhaLeo.feature.login.data.repository

import com.maysa.carterinhaLeo.feature.login.domain.model.UsuarioLogado

interface LoginRepository {
    suspend fun login( usuario:String, senha:String): Result<UsuarioLogado>
}