package com.maysa.carterinhaLeo.feature.unidadecurriculares.data.remote.service

import com.maysa.carterinhaLeo.feature.unidadecurriculares.data.remote.dto.UnidadeCurricularDTO
import retrofit2.http.GET

interface UnidadeCurricularApi {

    @GET("unidades-curriculares")
    suspend fun listarUnidadesCurriculares():
        List<UnidadeCurricularDTO>
}