package com.dzak.myapplication.Fragment.fragment.galery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.dzak.myapplication.R
import com.dzak.myapplication.databinding.FragmentDetailGaleryBinding


class DetailGaleryFragment : Fragment() {

    private lateinit var detailgalerybinding : FragmentDetailGaleryBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        detailgalerybinding = FragmentDetailGaleryBinding.inflate(inflater,container,false)

        detailgalerybinding.imgBackgallery.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_detailGaleryFragment_to_photoFragment)
        }

        return detailgalerybinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val datanamedaridatagalery = DetailGaleryFragmentArgs.fromBundle(arguments as Bundle).namadetailgalery
        val datadeskripsidaridatagalery = DetailGaleryFragmentArgs.fromBundle(arguments as Bundle).deskripsidetailgalery
        val datagambardaridatagalery = DetailGaleryFragmentArgs.fromBundle(arguments as Bundle).gambardetailgalery

        detailgalerybinding.txtDetailjudul.text = datanamedaridatagalery
        detailgalerybinding.txtDetaildesk.text = datadeskripsidaridatagalery
        detailgalerybinding.imgDetailgallery.setImageResource(datagambardaridatagalery)
    }
}