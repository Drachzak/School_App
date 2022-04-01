package com.dzak.myapplication.Fragment.fragment.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dzak.myapplication.Fragment.Adapter.HomeAdapter
import com.dzak.myapplication.Fragment.Data.DataHome
import com.dzak.myapplication.Fragment.Data.DataPrestasi
import com.dzak.myapplication.Fragment.Model.Home
import com.dzak.myapplication.R


class HomeFragment : Fragment() {
    private lateinit var adapter : HomeFragment
    private var listhome : ArrayList<Home> = arrayListOf()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val home = inflater.inflate(R.layout.fragment_home, container, false)

        val recycler : RecyclerView = home.findViewById(R.id.Recycler_home)
        recycler.setHasFixedSize(true)
        listhome.addAll(DataHome.list)
        recycler.layoutManager = LinearLayoutManager(context)
        val listhomeadapter = HomeAdapter(listhome)
        recycler.adapter = listhomeadapter
        return home

    }
}