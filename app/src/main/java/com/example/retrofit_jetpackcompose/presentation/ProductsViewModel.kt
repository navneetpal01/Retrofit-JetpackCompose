package com.example.retrofit_jetpackcompose.presentation

import androidx.lifecycle.ViewModel
import com.example.retrofit_jetpackcompose.data.ProductsRepository
import com.example.retrofit_jetpackcompose.data.model.Product
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow

class ProductsViewModel(
    private val productsRepository: ProductsRepository
): ViewModel(){
    private val _product = MutableStateFlow<List<Product>>(emptyList())
    val products = _product.asStateFlow()
    private val _showErrorToastChannel = Channel<Boolean>()
    val showErrorToastChannel = _showErrorToastChannel.receiveAsFlow()

    init {

    }
}