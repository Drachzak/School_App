package com.dzak.myapplication.Fragment.Data

import com.dzak.myapplication.Fragment.Model.Home
import com.dzak.myapplication.R

object DataHome {

    private val judulhome = arrayOf(
        "Gedung Asrama Putri",
        "Pembelajaran Tatap Muka Terbatas",
        "Cooking Class",
        "Ekstrakulikuler Basket",
        "Ekstrakulikuler Basket",
    )
    private val deskripsihome = arrayOf(
        "Gedung ini adalah gedung khusus akhwat yang dimana tempat akhwat belajar,tidur dan lain lain\n gedung ini juga biasa di gunakan untuk upacara pagi",
        "Pembelajaran tatap muka sudah mulai di terapkan semenjak pemerintah sudah memberikan vaksin\n kepada anak - anak SMPIT ABY",
        "Cooking Class adalah program di SMPIT ABY Full Day School,yang di mana murid - murid akan di beri pembelajaran tentang memasak oleh Mister Naseer",
        "Ekstrakulikuler rutin setiap jumat dan minggu untuk kelas 7 dan 8 \ndan di dampingi pelatih profesional dari UNY",
        "Ekstrakulikuler rutin setiap jumat dan minggu untuk kelas 7 dan 8 \ndan di dampingi pelatih profesional dari UNY",
    )
    private val gambarHome = arrayOf(
        R.drawable.gedungasput,
        R.drawable.facetoface,
        R.drawable.cookingclass,
        R.drawable.ekstrakulikulerbasket,
        R.drawable.ekstrakulikulerbasket,
    )
    val list: ArrayList<Home>
        get() {
            val listdatahome = arrayListOf<Home>()
            for (i in judulhome.indices) {
                val home = Home()
                home.namahome = judulhome[i]
                home.deskhome = deskripsihome[i]
                home.imagehome = gambarHome[i]
                listdatahome.add(home)
            }
            return listdatahome

        }
}