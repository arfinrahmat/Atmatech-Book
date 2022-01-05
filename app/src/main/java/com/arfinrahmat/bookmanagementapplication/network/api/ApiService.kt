package com.arfinrahmat.bookmanagementapplication.network.api

import com.arfinrahmat.bookmanagementapplication.network.RetrofitClient

object ApiService {
    fun getAuthService(): AuthService{
        return RetrofitClient.newInstance()
            .getRetrofitInstance()
            .create(AuthService::class.java)
    }
}