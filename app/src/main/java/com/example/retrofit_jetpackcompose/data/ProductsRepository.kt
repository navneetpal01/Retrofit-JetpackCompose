package com.example.retrofit_jetpackcompose.data

import com.example.retrofit_jetpackcompose.data.model.Product
import kotlinx.coroutines.flow.Flow

interface ProductsRepository {
    suspend fun getProjectsList() : Flow<Result<List<Product>>>
}