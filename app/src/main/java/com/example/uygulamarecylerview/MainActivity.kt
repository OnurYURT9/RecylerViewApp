package com.example.uygulamarecylerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var filmArrayList: ArrayList<Filmler>
    private lateinit var adapter: FilmlerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv.setHasFixedSize(true)
        rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        val f1 = Filmler(1,"Django","django",12.99)
        val f2 = Filmler(2,"Inception","inception",10.99)
        val f3 = Filmler(3,"Interstellar","interstellar",5.99)
        val f4 = Filmler(4,"The Hateful Eight","thehatefuleight",7.99)
        val f5 = Filmler(5,"The Pianist","thepianist",8.99)
        val f6 = Filmler(6,"Anadoluda","birzamanlaranadoluda",11.55)

        filmArrayList = ArrayList<Filmler>()
        filmArrayList.add(f1)
        filmArrayList.add(f2)
        filmArrayList.add(f3)
        filmArrayList.add(f4)
        filmArrayList.add(f5)
        filmArrayList.add(f6)

        adapter = FilmlerAdapter(this,filmArrayList)

        rv.adapter = adapter


    }
}