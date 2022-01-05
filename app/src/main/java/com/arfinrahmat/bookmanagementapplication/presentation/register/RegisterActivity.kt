package com.arfinrahmat.bookmanagementapplication.presentation.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arfinrahmat.bookmanagementapplication.R
import com.arfinrahmat.bookmanagementapplication.databinding.ActivityLoginBinding
import com.arfinrahmat.bookmanagementapplication.databinding.ActivityRegisterBinding
import com.arfinrahmat.bookmanagementapplication.utils.toast

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initActionBar()
        onAction()
    }

    private fun onAction() {
        binding.tbRegister.setOnClickListener { toast("Register") }
        binding.tbRegister.setNavigationOnClickListener { onBackPressed() }
    }

    private fun initActionBar() {
        setSupportActionBar(binding.tbRegister)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title=""
    }
}