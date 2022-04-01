package com.dzak.myapplication.Fragment.fragment.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.dzak.myapplication.R
import com.dzak.myapplication.databinding.FragmentDetailHomeBinding


class DetailHomeFragment : Fragment() {

    private lateinit var detailhomebinding : FragmentDetailHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        detailhomebinding = FragmentDetailHomeBinding.inflate(inflater, container, false)

        detailhomebinding.imgBackhome.setOnClickListener { view ->
            findNavController().navigate(R.id.action_detailHomeFragment_to_homeFragment)
        }

        val datanamedarihome = DetailHomeFragmentArgs.fromBundle(arguments as Bundle).detailjudulhome
        val datadeskhome = DetailHomeFragmentArgs.fromBundle(arguments as Bundle).detaildeskhome
        val datagambardarihome = DetailHomeFragmentArgs.fromBundle(arguments as Bundle).detailgambarhome

        detailhomebinding.txtDetailjudulhome.text = datanamedarihome
        detailhomebinding.txtDeskdetailhome.text = datadeskhome
        detailhomebinding.imgDetailhome.setImageResource(datagambardarihome)

        return detailhomebinding.root
    }


}
