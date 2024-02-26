package com.example.retrofit_jetpackcompose.data

import com.example.retrofit_jetpackcompose.data.model.Product
import com.example.retrofit_jetpackcompose.data.model.Products
import retrofit2.http.GET

interface Api {

    @GET("products")
    suspend fun getProductsList(): Products

    //Only one instance of the companion object exists for the entire duration of your program (similar to a singleton)
    companion object {
        const val BASE_URL = "https://dummyjson.com/"
    }
    /*
    @GET("products/{type}")
    suspend fun getProductsList(
        @Path("type") type : String,
        Like a api key and a page
        @Query("api_key") apiKey: String,
        Query("page") page : Int
    ): Products
     */
}