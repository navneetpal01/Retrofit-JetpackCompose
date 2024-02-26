package com.example.retrofit_jetpackcompose.data

import android.net.http.HttpException
import android.os.Build
import androidx.annotation.RequiresExtension
import com.example.retrofit_jetpackcompose.data.model.Product
import com.example.retrofit_jetpackcompose.data.model.Products
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class ProductsRepositoryImpl(
    private val api : Api
) : ProductsRepository{
    @RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
    override suspend fun getProjectsList(): Flow<Result<List<Product>>> {
        return flow {
            val productsFromApi  = try {
                api.getProductsList()
            } catch (e : IOException){
                e.printStackTrace()
                emit(Result.Error(message ="Error loading products"))
                return@flow
            }
            catch (e : HttpException){
                e.printStackTrace()
                emit(Result.Error(message ="Error loading products"))
                return@flow
            }
            catch (e : Exception){
                e.printStackTrace()
                emit(Result.Error(message ="Error loading products"))
                return@flow
            }
            emit(Result.Success(productsFromApi.products))
        }
    }
}