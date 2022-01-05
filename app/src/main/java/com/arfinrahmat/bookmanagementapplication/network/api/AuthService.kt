package com.arfinrahmat.bookmanagementapplication.network.api

import com.arfinrahmat.bookmanagementapplication.data.model.auth.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface AuthService {
    @Headers("Content-type: application/json")
    @POST("auth/login")
    suspend fun login(@Body body: String): Response<LoginResponse>
}