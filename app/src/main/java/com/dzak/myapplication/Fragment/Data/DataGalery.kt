package com.dzak.myapplication.Fragment.Data

import com.dzak.myapplication.Fragment.Model.Galery
import com.dzak.myapplication.R

object DataGalery {
    private val gambarGalery = intArrayOf(
        R.drawable.pramuka,
        R.drawable.ekstrakulikulerbasket,
        R.drawable.upacarahome,
        R.drawable.baksos,
        R.drawable.fieldstudy,
    )
    private val namaGalery = arrayOf(
        "Pramuka",
        "Basket",
        "Upacara",
        "Baksos",
        "Field Study",
    )
    private val dataGalery = arrayOf(
        "Kemah Yayasan Pramuka biasanya di lakukan setahun sekali untuk menguji \nmental dan fisik serta membuat anak anak SMPIT Abu Bakar menjadi tangguh",
        "Ekstrakulikuler rutin setiap jumat dan minggu untuk kelas 7 dan 8 \ndan di dampingi pelatih profesional dari UNY",
        "Upacara rutin setiap senin di lakukan di depan asrama putri,upacara ini rutin \ndilakukan untuk meningkatkan solidaritas dan memberi amanat kepada siswa",
        "Kegiatan baksos di GunungKidul di lakukan untuk meningkatkan kesadaran dan rasa syukur \nkepada Allah SWT serta membantu warga yang kekurangan bahan pangan",
        "Kegiatan Field Study dilakukan agar siswa bisa me refresh otaknya sehingga tidak stres \ndalam kegiatan KBM",
    )
    val listdataGalery : ArrayList<Galery>
    get() {
        val list = arrayListOf<Galery>()
        for (position in namaGalery.indices){
            val galery = Galery()
            galery.name = namaGalery[position]
            galery.gambar = gambarGalery[position]
            galery.detail = dataGalery[position]
            list.add(galery)
        }
        return list
    }
}
