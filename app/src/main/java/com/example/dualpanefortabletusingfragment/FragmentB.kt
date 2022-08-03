package com.example.dualpanefortabletusingfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dualpanefortabletusingfragment.databinding.FragmentBBinding

class FragmentB : Fragment() {

    private lateinit var binding: FragmentBBinding

    private var name: String? = ""
    private var des: String? = ""
    private var fee: String? = ""

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentBBinding.inflate(inflater , container , false)

        name = arguments?.getString("Name")
        des = arguments?.getString("Description")
        fee = arguments?.getString("Fee")

        val cName = binding.cname
        val cDes = binding.description
        val cFee = binding.fee

        cName.text = name
        cDes.text = des
        cFee.text = fee

        return binding.root
    }

    fun displayDetails(courseName: String, description: String, fee: Long) {

        val cName = binding.cname
        val cDes = binding.description
        val cFee = binding.fee

        cName.text = courseName
        cDes.text = description
        cFee.text = fee.toString()
    }

}