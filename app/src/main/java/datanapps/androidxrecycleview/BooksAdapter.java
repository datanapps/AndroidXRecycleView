package datanapps.androidxrecycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.UserViewHolder> {
    private List<Book> moviesList;

    private Context context;

    public BooksAdapter(Context context, List<Book> moviesList) {
        this.moviesList = moviesList;
        this.context = context;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_book_list, parent, false);

        return new UserViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        Book book = moviesList.get(position);
        holder.bookName.setText(book.getBookTitle());
        holder.bookAuthor.setText(book.getAuthorName());
        holder.publishedYear.setText(String.valueOf(book.getPublishedYear()));


        Glide
                .with(context)
                .load(book.getBookImage())
                .apply(new RequestOptions().fitCenter())
                .into(holder.imageCover);

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        public TextView bookName;
        public TextView bookAuthor;
        public ImageView imageCover;
        public TextView publishedYear;


        public UserViewHolder(View view) {
            super(view);
            bookName =  view.findViewById(R.id.layout_book_list_title);
            bookAuthor =  view.findViewById(R.id.layout_book_list_author);
            imageCover =  view.findViewById(R.id.layout_book_list_book_cover);
            publishedYear =  view.findViewById(R.id.layout_book_list_year);

        }
    }

}