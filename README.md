# AndroidXRecycleView
AndroidX Recycleview Example


**AndroidX is the Android Extension library which is very new and exited Support in android library.
All Android Developer using AndroidX supports for newer OS features. 
This should help you to integrate recycle view.**

To Integrate androidX Recycle view have to follow some steps.


**1. Need to add below line in gradle.properties**


    android.useAndroidX=true

    android.enableJetifier=true


**2. Implement dependencies in app gradle file**

    // app compact
    implementation "androidx.appcompat:appcompat:1.1.0-alpha04"

    // constraint layout
    implementation 'androidx.constraintlayout:constraintlayout:1.1.3'

    // recycle view
    implementation 'androidx.recyclerview:recyclerview:1.1.0-alpha04'


    // glide

    implementation 'com.github.bumptech.glide:glide:4.9.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.9.0'

**3. Use androidxRecycleview in view layout activity_main.xml **


 `<androidx.recyclerview.widget.RecyclerView
 
        android:id="@+id/recycle_view_book"
        
        android:layout_width="match_parent"
        
        android:layout_height="match_parent"
        
        android:clipToPadding="false"
        
        android:layout_marginTop="?android:attr/actionBarSize"
        
        app:layout_constraintTop_toBottomOf="@+id/appbar"
        
        app:layout_constraintBottom_toBottomOf="parent"
        
        app:layout_constraintTop_toTopOf="@+id/appbar"
        
        app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager" />
        
        
        
        
**4. Set Adapter in MainActivity.class **


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
     return bookList;
    }
    
    
    
    For more detail please download project.
    
    Thanks you, Have a great day !






