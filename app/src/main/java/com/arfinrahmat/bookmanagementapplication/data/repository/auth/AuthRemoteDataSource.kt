package com.arfinrahmat.bookmanagementapplication.data.repository.auth

import com.arfinrahmat.bookmanagementapplication.data.model.ApiResponse
import com.arfinrahmat.bookmanagementapplication.data.model.auth.LoginResponse
import com.arfinrahmat.bookmanagementapplication.network.api.ApiService
import com.google.android.gms.common.api.Api
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class AuthRemoteDataSource {
    suspend fun login(body: String): Flow<ApiResponse<LoginResponse>> = flow {
        try {
            val response = ApiService.getAuthService().login(body)
            if (response.isSuccessful){
                val data = response.body()
                if (data != null){
                    emit(ApiResponse.Success(data))
                }else{
                    emit(ApiResponse.Empty)
                }
            }else{
                val type = object : TypeToken<LoginResponse>(){}.type
                val erroResponse: LoginResponse = Gson().fromJson(response.errorBody()?.charStream(), type)
                emit(ApiResponse.Error(erroResponse.message))
            }
        }catch (e: Exception){
            emit(ApiResponse.Error(e.message.toString()))
        }
    }.flowOn(Dispatchers.IO)
}