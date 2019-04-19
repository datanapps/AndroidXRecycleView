package datanapps.androidxrecycleview;

import android.os.Bundle;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set tool bar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // set floating action
        FloatingActionButton fab = findViewById(R.id.fab_bar);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // set recycle view
        setRecycleViewList();
    }


    private void setRecycleViewList() {


        RecyclerView recyclerView = findViewById(R.id.recycle_view_book);

        BooksAdapter mAdapter = new BooksAdapter(MainActivity.this, getBookList());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }



    private List<Book> getBookList(){

        List<Book> bookList = new ArrayList<>();

        Book book = new Book();
        book.setBookTitle("The Girl without a name");
        book.setAuthorName("aaa");
        book.setBookImage("https://static1.squarespace.com/static/5746d6f1b654f905c35b5158/t/574f92014c2f85c0e9423612/1466204180094/");
        book.setPublishedYear(1995);
        bookList.add(book);


        book = new Book();
        book.setBookTitle("Classic-Childrens-Books");
        book.setAuthorName("unknown");
        book.setBookImage("http://cdn.quizly.co/wp-content/uploads/2016/01/25170425/Can-You-Name-These-Classic-Childrens-Books.jpg");
        book.setPublishedYear(1995);
        bookList.add(book);



        book = new Book();
        book.setBookTitle("History-books-for-Kids");
        book.setAuthorName("unknown");
        book.setBookImage("https://tessajwooldridge.files.wordpress.com/2016/11/history-books-for-kids_tea-and-christmas-sugar_5.jpg");
        book.setPublishedYear(2000);
        bookList.add(book);




        book = new Book();
        book.setBookTitle("4 Haunted Man");
        book.setAuthorName("unknown");
        book.setBookImage("https://www.tfwalsh.com/wp-content/uploads/2018/05/Banner-3.jpg");
        book.setPublishedYear(2005);
        bookList.add(book);






        book = new Book();
        book.setBookTitle("The Falconer");
        book.setAuthorName("unknown");
        book.setBookImage("https://www.elizabethmaywrites.com/wp-content/uploads/2014/05/banner.jpg");
        book.setPublishedYear(1998);
        bookList.add(book);













        return bookList;
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
