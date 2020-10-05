package com.uan.movies

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri

class MovieListAdapter(
    private val moviesImages: Array<String>,
    private val moviesTitles: Array<String>,
    private val moviesYears: Array<String>,
    private val moviesGenres: Array<String>,
    private val moviesRates: Array<String>,
    private val context: Context
) : BaseAdapter() {
    private var inflter: LayoutInflater = LayoutInflater.from(this.context)

    override fun getCount(): Int {
        return moviesTitles.size
    }

    override fun getItem(p0: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getItemId(p0: Int): Long {
        TODO("Not yet implemented")
    }

    override fun getView(position: Int, view: View, parent: ViewGroup): View {
        var view = view
        view = inflter.inflate(R.layout.listview_row, null)

        val movieImg = view.findViewById<ImageView>(R.id.movieImg)
        val movieTitle = view.findViewById<TextView>(R.id.movieTitle)
        val yearMovie = view.findViewById<TextView>(R.id.yearMovie)
        val genresMovie = view.findViewById<TextView>(R.id.genresMovie)
        val rateMovie = view.findViewById<TextView>(R.id.rateMovie)

        movieImg.setImageURI(moviesImages[position].toUri())
        movieTitle.text = moviesTitles[position]
        yearMovie.text = moviesYears[position]
        genresMovie.text = moviesGenres[position]
        rateMovie.text = moviesRates[position]
        return view
    }
}
