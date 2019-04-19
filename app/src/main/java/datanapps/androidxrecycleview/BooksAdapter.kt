package datanapps.androidxrecycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

import androidx.recyclerview.widget.RecyclerView

class BooksAdapter(private val context: Context, private val moviesList: List<Book>) : RecyclerView.Adapter<BooksAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_book_list, parent, false)

        return UserViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val book = moviesList[position]
        holder.bookName.text = book.bookTitle
        holder.bookAuthor.text = book.authorName
        holder.publishedYear.text = book.publishedYear.toString()


        Glide
                .with(context)
                .load(book.bookImage)
                .apply(RequestOptions().fitCenter())
                .into(holder.imageCover)

    }

    override fun getItemCount(): Int {
        return moviesList.size
    }

    inner class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var bookName: TextView
        var bookAuthor: TextView
        var imageCover: ImageView
        var publishedYear: TextView


        init {
            bookName = view.findViewById(R.id.layout_book_list_title)
            bookAuthor = view.findViewById(R.id.layout_book_list_author)
            imageCover = view.findViewById(R.id.layout_book_list_book_cover)
            publishedYear = view.findViewById(R.id.layout_book_list_year)

        }
    }

}