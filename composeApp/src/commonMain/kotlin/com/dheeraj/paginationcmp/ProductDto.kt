package com.dheeraj.paginationcmp

import kotlinx.serialization.Serializable

@Serializable
data class ProductDto(
    val id: Int,
    val title: String,
    val price: Double,
)
@Serializable
data class ProductResponseDto(
    val products: List<ProductDto>,
    val total: Long
)

