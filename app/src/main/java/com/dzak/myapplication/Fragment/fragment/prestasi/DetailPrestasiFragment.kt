package com.dzak.myapplication.Fragment.fragment.prestasi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.dzak.myapplication.R
import com.dzak.myapplication.databinding.FragmentDetailPrestasiBinding
import com.dzak.myapplication.databinding.FragmentPrestasiBinding


class DetailPrestasiFragment : Fragment() {
    private lateinit var detailprestasibinding : FragmentDetailPrestasiBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        detailprestasibinding = FragmentDetailPrestasiBinding.inflate(inflater,container,false)

        detailprestasibinding.imgBackprestasi.setOnClickListener { view ->
            findNavController().navigate(R.id.action_detailPrestasiFragment_to_prestasiFragment)
        }

        return detailprestasibinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val datajudulprestasi = DetailPrestasiFragmentArgs.fromBundle(arguments as Bundle).detailjudulprestasi
        val datagambarprestasi = DetailPrestasiFragmentArgs.fromBundle(arguments as Bundle).detailgambarprestasi
        val datadeskprestasi = DetailPrestasiFragmentArgs.fromBundle(arguments as Bundle).deskdetailprestasi

        detailprestasibinding.txtDetailjudulprestasi.text = datajudulprestasi
        detailprestasibinding.txtDeskDetailPrestasi.text = datadeskprestasi
        detailprestasibinding.imgDetailprestasi.setImageResource(datagambarprestasi)
    }
}