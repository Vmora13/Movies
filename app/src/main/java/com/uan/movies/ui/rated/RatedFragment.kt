package com.uan.movies.ui.rated

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.uan.movies.MovieListAdapter
import com.uan.movies.R

class RatedFragment : Fragment() {

    private lateinit var ratedViewModel: RatedViewModel

    private val moviesImages = arrayOf(
        "drawable/theshawshankredemption",
        "drawable/thegodfather",
        "@drawable/thedarkknight",
        "@drawable/schindlerslist",
        "@drawable/fightclub",
        "@drawable/forrestgump",
        "@drawable/inception",
        "@drawable/logan",
        "@drawable/geminiman",
    )

    private val moviesTitles = arrayOf(
        "The Shawshank Redemption", "The Godfather", "The Dark Knight",
        "Schindler's List", "Fight Club", "Forrest Gump", "Inception", "Logan", "Gemini Man"
    )
    private val moviesYears = arrayOf(
        "1994", "1972", "2008", "1993", "1999", "1994", "2010", "2017", "2019"
    )
    private val moviesGenres = arrayOf(
        "Drama", "Crime", "Action", "Biography", "Drama", "Drama", "Sci-Fi", "Action", "Sci-Fi"
    )
    private val moviesRates = arrayOf(
        "9,3", "9,2", "9,0", "8,9", "8,8", "8,8", "8,8", "8,1", "-,-"
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        ratedViewModel =
            ViewModelProviders.of(this).get(RatedViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_rated, container, false)

        val listView = root.findViewById<ListView>(R.id.listView_app_rated)

        val movieListAdapter = MovieListAdapter(
            moviesImages, moviesTitles, moviesYears, moviesGenres, moviesRates, root.context
        )
        listView.adapter = movieListAdapter
        return root
    }
}