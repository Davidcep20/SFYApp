package es.david.sfyapp.View.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.david.sfyapp.Model.Data.Movie
import es.david.sfyapp.R

class RecyclerAdapter(val movies: List<Movie>):
    RecyclerView.Adapter<RecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.layout_list, parent, false)
        return RecyclerViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        //holder.value.text = movies.get(position).value
    }
}