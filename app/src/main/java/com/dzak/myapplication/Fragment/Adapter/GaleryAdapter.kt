package com.dzak.myapplication.Fragment.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dzak.myapplication.Fragment.Model.Galery
import com.dzak.myapplication.Fragment.fragment.galery.PhotoFragmentDirections
import com.dzak.myapplication.R
import com.dzak.myapplication.databinding.ItemRecyclerGaleriBinding

class GaleryAdapter(private val dataListGalery : ArrayList<Galery> ) : RecyclerView.Adapter<GaleryAdapter.ViewHolder>() {
    class ViewHolder(var binding : ItemRecyclerGaleriBinding) : RecyclerView.ViewHolder(binding.root) {
        //val txtJudulGalery : TextView = itemview.findViewById(R.id.txt_judul_galeri)
       // val txtDeskGalery : TextView = itemview.findViewById(R.id.txt_desk_galeri)
        //val gambarGalery : ImageView = itemview.findViewById(R.id.img_galery)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val  bindingitem = ItemRecyclerGaleriBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return ViewHolder(bindingitem)
        //val layout : View = LayoutInflater.from(parent.context)
          //  .inflate(R.layout.item_recycler_galeri,parent,false)
        //return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val galery = dataListGalery[position]
        holder.binding.txtJudulGaleri.text = galery.name
        holder.binding.txtDeskGaleri.text = galery.detail
       Glide.with(holder.binding.root)
           .load(galery.gambar)
           .into(holder.binding.imgGalery)

        holder.itemView.setOnClickListener { view ->
            val dariadaptergalerykedetailgalery = PhotoFragmentDirections.actionPhotoFragmentToDetailGaleryFragment2()
            //detailnamagalery = sebagai arguments untuk meneruskan data dari model.name
            dariadaptergalerykedetailgalery.namadetailgalery = galery.name.toString()
            dariadaptergalerykedetailgalery.deskripsidetailgalery = galery.detail.toString()
            dariadaptergalerykedetailgalery.gambardetailgalery = galery.gambar.toInt()
            view.findNavController().navigate(dariadaptergalerykedetailgalery)

        }






        //Glide.with(holder.itemView.context)
          //.load(dataListGalery[position].gambar)
          // .into(holder.)
        //holder.txtJudulGalery.text = galery.name
        //holder.txtDeskGalery.text = galery.detail

        //holder.itemView.setOnClickListener {
          //  val intent = Intent(it.context,DetailGalleryActivity::class.java)
            //intent.putExtra(DetailGalleryActivity.detailjudulgallery, galery.name)
            //intent.putExtra(DetailGalleryActivity.detaildeskgallery, galery.detail)
            //intent.putExtra(DetailGalleryActivity.detailgambargallery, galery.gambar)
            //it.context.startActivity(intent)

            //it.context.startActivity(intent)
        }

    override fun getItemCount() = dataListGalery.size
}

