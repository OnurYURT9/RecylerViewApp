package com.example.uygulamarecylerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class FilmlerAdapter(private val mContext:Context,private val filmlerListesi:List<Filmler>)
    :RecyclerView.Adapter<FilmlerAdapter.CardTasarimNesneleriTutucu>() {

    inner class CardTasarimNesneleriTutucu(view:View):RecyclerView.ViewHolder(view){

        var imageViewFilmResim:ImageView
        var textViewFilmBaslik:TextView
        var textViewFilmFiyat:TextView
        var buttonsepeteekle:Button

        init {
            imageViewFilmResim = view.findViewById(R.id.imageViewfilmresim)
            textViewFilmBaslik = view.findViewById(R.id.textViewfilmbaslik)
            textViewFilmFiyat = view.findViewById(R.id.textViewfilmfiyat)
            buttonsepeteekle = view.findViewById(R.id.buttonsepeteekle)
        }
    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimNesneleriTutucu {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.card_film,parent,false)
        return CardTasarimNesneleriTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimNesneleriTutucu, position: Int) {
        val film =  filmlerListesi[position]

        holder.textViewFilmBaslik.text = film.film_ad
        holder.textViewFilmFiyat.text = "${film.film_fiyat} $"

        holder.imageViewFilmResim.setImageResource(mContext.resources.getIdentifier(film.film_resim_ad,"drawable",mContext.packageName))
        holder.buttonsepeteekle.setOnClickListener{
            Toast.makeText(mContext,"${film.film_ad} sepete eklendi",Toast.LENGTH_SHORT).show()
        }
    }


}