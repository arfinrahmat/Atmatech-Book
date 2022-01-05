package com.arfinrahmat.bookmanagementapplication.presentation.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arfinrahmat.bookmanagementapplication.R
import com.arfinrahmat.bookmanagementapplication.databinding.ActivityBookBinding

class BookActivity : AppCompatActivity() {

    private lateinit var binding:ActivityBookBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}