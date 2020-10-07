package ucb.edu.bo.exam2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_book.view.*

class BookListAdapter(var list: ArrayList<Book>, applicationContext: Context?) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_book, parent, false)
        return BookListViewHolder(view)
    }

    class BookListViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
         val book = list.get(position)
        holder.itemView.textViewbooks.text = book.title
        holder.itemView.textViewbooks.text = book.year
    }

}
