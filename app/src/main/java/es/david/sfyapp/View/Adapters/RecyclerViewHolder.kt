package es.david.sfyapp.View.Adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_list.view.*

class RecyclerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val value = itemView.list_tv
}