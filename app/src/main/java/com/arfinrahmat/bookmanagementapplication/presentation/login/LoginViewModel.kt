package com.arfinrahmat.bookmanagementapplication.presentation.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.arfinrahmat.bookmanagementapplication.data.repository.auth.AuthRepository

class LoginViewModel: ViewModel() {

    fun login(body: String) =
        AuthRepository.login(body).asLiveData()
}