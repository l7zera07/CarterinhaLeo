package com.maysa.carterinhaLeo.feature.unidadecurriculares.presentation

import com.maysa.carterinhaLeo.feature.unidadecurriculares.domain.model.UnidadeCurricular

data class UnidadeCurricularUiState(
    val listaUnidadesCurriculares: List<UnidadeCurricular> = emptyList(),
    val isLoading: Boolean = false,
    val errorMessage: String? = null
) {
}