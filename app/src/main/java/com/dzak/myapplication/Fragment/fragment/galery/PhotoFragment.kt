package com.dzak.myapplication.Fragment.fragment.galery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dzak.myapplication.Fragment.Adapter.GaleryAdapter
import com.dzak.myapplication.Fragment.Data.DataGalery
import com.dzak.myapplication.Fragment.Model.Galery
import com.dzak.myapplication.R


class PhotoFragment : Fragment() {
   private lateinit var adapterpres : GaleryAdapter
   private var list : ArrayList<Galery> = arrayListOf()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val gallery = inflater.inflate(R.layout.fragment_photo, container, false)

        val recycler: RecyclerView = gallery.findViewById(R.id.Recycler_galeri)
        recycler.setHasFixedSize(true)
        list.addAll(DataGalery.listdataGalery)
        recycler.layoutManager = LinearLayoutManager(context)
        val listgalleryadapter = GaleryAdapter(list)
        recycler.adapter = listgalleryadapter

        return gallery
    }


    }

