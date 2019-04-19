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
        book.setBookTitle("History-books-for-Kids");
        book.setAuthorName("unknown");
        book.setBookImage("https://tessajwooldridge.files.wordpress.com/2016/11/history-books-for-kids_tea-and-christmas-sugar_5.jpg");
        book.setPublishedYear(2000);
        bookList.add(book);

        book = new Book();
        book.setBookTitle("The Girl without a name");
        book.setAuthorName("aaa");
        book.setBookImage("https://static1.squarespace.com/static/5746d6f1b654f905c35b5158/t/574f92014c2f85c0e9423612/1466204180094/");
        book.setPublishedYear(1995);
        bookList.add(book);

        book = new Book();
        book.setBookTitle("Classic-Childrens-Books");
        book.setAuthorName("unknown");
        book.setBookImage("https://dygtyjqp7pi0m.cloudfront.net/i/5736/8633103_1.jpg?v=8CE71410914F540");
        book.setPublishedYear(1995);
        bookList.add(book);

        book = new Book();
        book.setBookTitle("4 Haunted Man");
        book.setAuthorName("unknown");
        book.setBookImage("https://www.tfwalsh.com/wp-content/uploads/2018/05/Banner-3.jpg");
        book.setPublishedYear(2005);
        bookList.add(book);

        book = new Book();
        book.setBookTitle("The Girl without a name");
        book.setAuthorName("aaa");
        book.setBookImage("https://static1.squarespace.com/static/5746d6f1b654f905c35b5158/t/574f92014c2f85c0e9423612/1466204180094/");
        book.setPublishedYear(1995);
        bookList.add(book);

        book = new Book();
        book.setBookTitle("My Story");
        book.setAuthorName("John Deo");
        book.setBookImage("https://0.s3.envato.com/files/183895378/preview%20image_590x300.jpg");
        book.setPublishedYear(1997);
        bookList.add(book);

       //---------------------------------------//

        book = new Book();
        book.setBookTitle("Dark Movie");
        book.setAuthorName("John Deo");
        book.setBookImage("https://bluefx.net/wp-content/uploads/2014/06/dark-movie-titles-after-effects-template.jpg");
        book.setPublishedYear(1999);
        bookList.add(book);

        book = new Book();
        book.setBookTitle("Latinx-Must");
        book.setAuthorName("unknown");
        book.setBookImage("https://d4804za1f1gw.cloudfront.net/wp-content/uploads/sites/22/2018/08/21114706/Latinx-Must-Reads-Banner.png");
        book.setPublishedYear(2000);
        bookList.add(book);

        book = new Book();
        book.setBookTitle("White Dragon");
        book.setAuthorName("unknown");
        book.setBookImage("https://arthive.com/res/media/img/oy800/work/e58/183471.jpg");
        book.setPublishedYear(2005);
        bookList.add(book);


        book = new Book();
        book.setBookTitle("XuGkeTK");
        book.setAuthorName("unknown");
        book.setBookImage("http://i.imgur.com/XuGkeTK.jpg");
        book.setPublishedYear(2009);
        bookList.add(book);


        book = new Book();
        book.setBookTitle("XuGkeTK");
        book.setAuthorName("unknown");
        book.setBookImage("https://ksr-ugc.imgix.net/assets/014/535/121/fb5e7a5dcdd5fbc02a27290508feb0ee_original.jpg?ixlib=rb-1.1.0&crop=faces&w=1552&h=873&fit=crop&v=1479972288&auto=format&frame=1&q=92&s=ffaab00f1731b16ba4626b066ac5177e");
        book.setPublishedYear(2009);
        bookList.add(book);


        book = new Book();
        book.setBookTitle("My Story");
        book.setAuthorName("John Deo");
        book.setBookImage("https://0.s3.envato.com/files/183895378/preview%20image_590x300.jpg");
        book.setPublishedYear(1996);
        bookList.add(book);

        return bookList;
    }

}
