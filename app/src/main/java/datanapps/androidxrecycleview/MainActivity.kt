package datanapps.androidxrecycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // set tool bar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        // set floating action
        val fab = findViewById<FloatingActionButton>(R.id.fab_bar)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        // set recycle view
        setRecycleViewList()
    }


    private fun setRecycleViewList() {
        val recyclerView = findViewById<RecyclerView>(R.id.recycle_view_book)
        val mAdapter = BooksAdapter(this@MainActivity, bookList)
        val mLayoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = mLayoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = mAdapter
    }


    private//---------------------------------------//
    val bookList: List<Book>
        get() {

            val bookList = ArrayList<Book>()

            var book = Book()
            book.bookTitle = "History-books-for-Kids"
            book.authorName = "unknown"
            book.bookImage = "https://tessajwooldridge.files.wordpress.com/2016/11/history-books-for-kids_tea-and-christmas-sugar_5.jpg"
            book.publishedYear = 2000
            bookList.add(book)

            book = Book()
            book.bookTitle = "The Girl without a name"
            book.authorName = "aaa"
            book.bookImage = "https://static1.squarespace.com/static/5746d6f1b654f905c35b5158/t/574f92014c2f85c0e9423612/1466204180094/"
            book.publishedYear = 1995
            bookList.add(book)

            book = Book()
            book.bookTitle = "Classic-Childrens-Books"
            book.authorName = "unknown"
            book.bookImage = "https://dygtyjqp7pi0m.cloudfront.net/i/5736/8633103_1.jpg?v=8CE71410914F540"
            book.publishedYear = 1995
            bookList.add(book)

            book = Book()
            book.bookTitle = "4 Haunted Man"
            book.authorName = "unknown"
            book.bookImage = "https://www.tfwalsh.com/wp-content/uploads/2018/05/Banner-3.jpg"
            book.publishedYear = 2005
            bookList.add(book)

            book = Book()
            book.bookTitle = "The Girl without a name"
            book.authorName = "aaa"
            book.bookImage = "https://static1.squarespace.com/static/5746d6f1b654f905c35b5158/t/574f92014c2f85c0e9423612/1466204180094/"
            book.publishedYear = 1995
            bookList.add(book)



            book = Book()
            book.bookTitle = "Dark Movie"
            book.authorName = "John Deo"
            book.bookImage = "https://bluefx.net/wp-content/uploads/2014/06/dark-movie-titles-after-effects-template.jpg"
            book.publishedYear = 1999
            bookList.add(book)

            book = Book()
            book.bookTitle = "Latinx-Must"
            book.authorName = "unknown"
            book.bookImage = "https://d4804za1f1gw.cloudfront.net/wp-content/uploads/sites/22/2018/08/21114706/Latinx-Must-Reads-Banner.png"
            book.publishedYear = 2000
            bookList.add(book)

            book = Book()
            book.bookTitle = "My Story"
            book.authorName = "John Deo"
            book.bookImage = "https://0.s3.envato.com/files/183895378/preview%20image_590x300.jpg"
            book.publishedYear = 1997
            bookList.add(book)

            book = Book()
            book.bookTitle = "White Dragon"
            book.authorName = "unknown"
            book.bookImage = "https://arthive.com/res/media/img/oy800/work/e58/183471.jpg"
            book.publishedYear = 2005
            bookList.add(book)


            book = Book()
            book.bookTitle = "XuGkeTK"
            book.authorName = "unknown"
            book.bookImage = "http://i.imgur.com/XuGkeTK.jpg"
            book.publishedYear = 2009
            bookList.add(book)


            book = Book()
            book.bookTitle = "XuGkeTK"
            book.authorName = "unknown"
            book.bookImage = "https://ksr-ugc.imgix.net/assets/014/535/121/fb5e7a5dcdd5fbc02a27290508feb0ee_original.jpg?ixlib=rb-1.1.0&crop=faces&w=1552&h=873&fit=crop&v=1479972288&auto=format&frame=1&q=92&s=ffaab00f1731b16ba4626b066ac5177e"
            book.publishedYear = 2009
            bookList.add(book)


            book = Book()
            book.bookTitle = "My Story"
            book.authorName = "John Deo"
            book.bookImage = "https://0.s3.envato.com/files/183895378/preview%20image_590x300.jpg"
            book.publishedYear = 1996
            bookList.add(book)

            return bookList
        }

}
