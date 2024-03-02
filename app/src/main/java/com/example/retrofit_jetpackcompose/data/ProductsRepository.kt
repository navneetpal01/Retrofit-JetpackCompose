package com.example.retrofit_jetpackcompose.data

import com.example.retrofit_jetpackcompose.data.model.Product
import kotlinx.coroutines.flow.Flow

interface ProductsRepository {
    suspend fun getProductsList(): Flow<Result<List<Product>>>
}