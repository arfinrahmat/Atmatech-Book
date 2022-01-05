package com.arfinrahmat.bookmanagementapplication.presentation.user

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.arfinrahmat.bookmanagementapplication.R
import com.arfinrahmat.bookmanagementapplication.databinding.FragmentHomeBinding
import com.arfinrahmat.bookmanagementapplication.databinding.FragmentUserBinding


class UserFragment : Fragment() {

    private var _binding: FragmentUserBinding? = null
    private val binding: FragmentUserBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUserBinding.inflate(inflater, container, false)
        return _binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onAction()
    }

    private fun onAction() {
        binding.btnLogoutUser.setOnClickListener {
            Toast.makeText(context, "Logout", Toast.LENGTH_SHORT).show()
        }

        binding.btnChangeLanguageUser.setOnClickListener {
            Toast.makeText(context, "Change Language", Toast.LENGTH_SHORT).show()
        }
    }
}