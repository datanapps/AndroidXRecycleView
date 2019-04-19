package datanapps.androidxrecycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.UserViewHolder> {
    private List<Book> moviesList;

    public BooksAdapter(List<Book> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_book_list, parent, false);

        return new UserViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        Book movie = moviesList.get(position);
        holder.title.setText(movie.getBookTitle());
       // holder.genre.setText(movie.getGenre());
       // holder.year.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public UserViewHolder(View view) {
            super(view);
            title =  view.findViewById(R.id.title);
            //genre =  view.findViewById(R.id.genre);
            //year =  view.findViewById(R.id.year);
        }
    }

}