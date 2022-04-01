package com.dzak.myapplication.Fragment.fragment.prestasi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dzak.myapplication.Fragment.Adapter.PrestasiAdapter
import com.dzak.myapplication.Fragment.Data.DataPrestasi
import com.dzak.myapplication.Fragment.Model.prestasi
import com.dzak.myapplication.R


class PrestasiFragment : Fragment() {

    private lateinit var adapter : PrestasiAdapter
    private val daftar : ArrayList<prestasi> = arrayListOf()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val prestasi = inflater.inflate(R.layout.fragment_prestasi,container,false)

        val recycler : RecyclerView = prestasi.findViewById(R.id.Recycler_prestasi)
        recycler.setHasFixedSize(true)
        daftar.addAll(DataPrestasi.listdataprestasi)
        recycler.layoutManager = LinearLayoutManager(context)
        val listprestasiadapter = PrestasiAdapter(daftar)
        recycler.adapter = listprestasiadapter

        return prestasi
    }

}