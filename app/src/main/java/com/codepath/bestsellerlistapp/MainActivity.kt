package com.codepath.bestsellerlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.codepath.bestsellerlistapp.R.id

/**
 * The MainActivity for the BestSellerList app.
 * Creates a [MovieFragment].
 */
class MainActivity : AppCompatActivity() {
private val movies= mutableListOf<Movie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //TODO - Come back
//        MovieRecyclerViewAdapter.adapter = movieAdapter
//        articlesRecyclerView.layoutManager = LinearLayoutManager(this).also {
//            val dividerItemDecoration = DividerItemDecoration(this, it.orientation)
//            articlesRecyclerView.addItemDecoration(dividerItemDecoration)
//        }

        setContentView(R.layout.activity_main)
        val supportFragmentManager = supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(id.content, MovieFragment(), null).commit()
    }
}