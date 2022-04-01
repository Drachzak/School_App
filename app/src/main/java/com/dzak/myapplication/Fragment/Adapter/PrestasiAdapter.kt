package com.dzak.myapplication.Fragment.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dzak.myapplication.Fragment.Model.prestasi
import com.dzak.myapplication.Fragment.fragment.prestasi.PrestasiFragmentDirections
import com.dzak.myapplication.R
import com.dzak.myapplication.databinding.ItemRecyclerPrestasiBinding

class PrestasiAdapter(private val datalistprestasi : ArrayList<prestasi>): RecyclerView.Adapter<PrestasiAdapter.ViewHolder>() {
    class ViewHolder(var binding : ItemRecyclerPrestasiBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val bindingitem = ItemRecyclerPrestasiBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return ViewHolder(bindingitem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val prestasi = datalistprestasi[position]
        holder.binding.txtJudulprestasi.text = prestasi.judul
        Glide.with(holder.binding.root)
            .load(prestasi.gambar)
            .into(holder.binding.imgPrestasi)

        holder.itemView.setOnClickListener { view ->
            val dariadapterprestasikedetailprestasi = PrestasiFragmentDirections.actionPrestasiFragmentToDetailPrestasiFragment()
            dariadapterprestasikedetailprestasi.detailjudulprestasi = prestasi.judul.toString()
            dariadapterprestasikedetailprestasi.deskdetailprestasi = prestasi.desk.toString()
            dariadapterprestasikedetailprestasi.detailgambarprestasi = prestasi.gambar.toInt()

            view.findNavController().navigate(dariadapterprestasikedetailprestasi)
        }

    }

    override fun getItemCount() = datalistprestasi.size
    }
