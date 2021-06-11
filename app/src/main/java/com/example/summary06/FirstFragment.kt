package com.example.summary06

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.ActivityNavigator
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.summary06.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
   lateinit var binding: FragmentFirstBinding
    val aboutInfo = mutableListOf<AboutInfo>()

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)



        binding.btnAdd.setOnClickListener {
            
        }



        return binding.root
    }
    fun initAdapter(){
        val adapter = AboutInfoAdapter(aboutInfo)
        binding.recyclerView.adapter = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = adapter

    }


}