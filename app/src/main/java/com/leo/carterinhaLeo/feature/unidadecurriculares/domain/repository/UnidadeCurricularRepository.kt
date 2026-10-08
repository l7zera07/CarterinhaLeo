package com.maysa.carterinhaLeo.feature.unidadecurriculares.domain.repository

import com.maysa.carterinhaLeo.feature.unidadecurriculares.domain.model.UnidadeCurricular

interface UnidadeCurricularRepository {
    suspend fun listarUnidadesCurriculares(): Result<List<UnidadeCurricular>>
}