package com.dzak.myapplication.Fragment.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dzak.myapplication.Fragment.Model.Home
import com.dzak.myapplication.Fragment.fragment.home.HomeFragmentDirections
import com.dzak.myapplication.databinding.ItemRecyclerHomeBinding

class HomeAdapter (private val listdatahome : ArrayList<Home>) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {
    class ViewHolder(var binding : ItemRecyclerHomeBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
     val itembinding = ItemRecyclerHomeBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return ViewHolder(itembinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val home = listdatahome[position]
        holder.binding.txtJudulhome.text = home.namahome
        holder.binding.textView2.text = home.deskhome
        Glide.with(holder.binding.root)
            .load(home.imagehome)
            .into(holder.binding.imgHome)

        holder.itemView.setOnClickListener { view ->
            val dariadapterhomekedetailhome = HomeFragmentDirections.actionHomeFragmentToDetailHomeFragment()

            dariadapterhomekedetailhome.detailjudulhome = home.namahome.toString()
            dariadapterhomekedetailhome.detaildeskhome = home.deskhome.toString()
            dariadapterhomekedetailhome.detailgambarhome = home.imagehome.toInt()
            view.findNavController().navigate(dariadapterhomekedetailhome)
        }

    }

    override fun getItemCount() = listdatahome.size
    }