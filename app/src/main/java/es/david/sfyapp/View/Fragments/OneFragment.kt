package es.david.sfyapp.View.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import es.david.sfyapp.Model.Data.Movie
import es.david.sfyapp.R
import es.david.sfyapp.View.Adapters.RecyclerAdapter
import kotlinx.android.synthetic.main.fragment_one.*

class OneFragment: Fragment() {

    var jokes = mutableListOf<Movie>()

    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*
        movies.add(Movie("hola1"))
        movies.add(Movie("hola2"))
        movies.add(Movie("hola3"))
        movies.add(Movie("hola4"))
        movies.add(Movie("hola5"))
        movies.add(Movie("hola6"))
        */

        viewAdapter = RecyclerAdapter(jokes)
        viewManager = LinearLayoutManager(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragment_one_recycler.setHasFixedSize(true)
        fragment_one_recycler.layoutManager = viewManager
        fragment_one_recycler.adapter = viewAdapter
    }
}