package com.dicoding.handchat.ui.information

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dicoding.handchat.databinding.FragmentInformationsBinding

class InformationsFragment : Fragment() {

    private lateinit var informationsViewModel: InformationsViewModel
    private var _binding: FragmentInformationsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        informationsViewModel =
            ViewModelProvider(this).get(InformationsViewModel::class.java)

        _binding = FragmentInformationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}