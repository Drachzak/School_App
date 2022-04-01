package com.dzak.myapplication.Fragment.Data

import com.dzak.myapplication.Fragment.Model.prestasi
import com.dzak.myapplication.R

object DataPrestasi {
     private val namajudul = arrayOf(
        "Juara 3 LT 3 Kwarcab KOTA YOGYAKARTA",
        "Juara 2 Paskibra se KOTA YOGYAKARTA",
        "Juara 2 Lomba Futsal se-Provinsi",
        "Juara 3 Karya Ilmiah Remaja",
        "Juara MTQ 6 Kali Berturut turut se-YOGYAKARTA",
    )
    private val deskPrestasi = arrayOf(
        "Mmenangkan juara 3 lomba tingkat 3 Kwarcab se KOTA YOGYAKARTA",
        "Perlombaan di mandala krida se KOTA YOGYAKARTA dan memenangkan di juara 2 \nuntuk kedua kalinya",
        "Lomba futsal di GOR UNY dalam kejuaraan SMP se DIY masuk ke babak final dan gugur di juara 2",
        "KIR atau Karya Ilmiah Remaja SMPIT ABY juga mengikuti perlombaan se provinsi \ndi taman pintar",
        "Mengikuti Lomba MTQ dan selalu menang 6 angkatan berturut turut se YOGYAKARTA",
    )
   private val gambarprestasi = intArrayOf(
        R.drawable.prestasipramuka,
        R.drawable.paskibra,
        R.drawable.prestasifutsal,
        R.drawable.prestasikir,
        R.drawable.prestasimtq,
    )
    val listdataprestasi : ArrayList<prestasi>
    get() {
        val listprestasi = arrayListOf<prestasi>()
        for ( i in namajudul.indices){
            val Prestasi = prestasi()
            Prestasi.judul = namajudul[i]
            Prestasi.desk = deskPrestasi[i]
            Prestasi.gambar = gambarprestasi[i]
            listprestasi.add(Prestasi)
        }
        return listprestasi
    }
}