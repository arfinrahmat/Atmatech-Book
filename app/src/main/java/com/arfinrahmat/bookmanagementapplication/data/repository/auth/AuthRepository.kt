package com.arfinrahmat.bookmanagementapplication.data.repository.auth

import com.arfinrahmat.bookmanagementapplication.data.model.ApiResponse
import com.arfinrahmat.bookmanagementapplication.data.model.Resource
import com.arfinrahmat.bookmanagementapplication.data.model.auth.LoginResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow

object AuthRepository {
    private val authRemoteDataSource = AuthRemoteDataSource()

    fun login(body: String): Flow<Resource<LoginResponse>> = flow {
        emit(Resource.Loading)
        when(val apiResponse = authRemoteDataSource.login(body).first()){
            is ApiResponse.Success -> {
                val data = apiResponse.data
                emit(Resource.Success(data))
            }

           is ApiResponse.Empty -> {
                emit(Resource.Empty)
           }

            is ApiResponse.Error -> {
                val errorMessage = apiResponse.errorMessage
                emit(Resource.Error(errorMessage))
            }
        }
    }
}