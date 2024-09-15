package com.example.tutorial.architecture_components.set_data_fragment_2.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.tutorial.architecture_components.R
import com.example.tutorial.architecture_components.set_data_fragment_2.model.MyFragmentViewModel
import com.example.tutorial.architecture_components.databinding.FragmentMyBinding

class MyFragment : Fragment() {

    lateinit var binding : FragmentMyBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_my,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.myFragmentViewModel = MyFragmentViewModel("Vu dien")
    }
}