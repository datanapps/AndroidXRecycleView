# AndroidX RecycleView in KOTLIN
AndroidX Recycleview (KOTLIN) Example


**AndroidX is the Android Extension library which is very new and exited Support in android library.
All Android Developer using AndroidX supports for newer OS features. 
This should help you to integrate recycle view.**

![alt text](https://github.com/datanapps/AndroidXRecycleView/blob/master/screens/androidx_recycleview.gif)


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


 `           <androidx.recyclerview.widget.RecyclerView
 
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



        private fun setRecycleViewList() {
 
        val recyclerView = findViewById<RecyclerView>(R.id.recycle_view_book)
        
        val mAdapter = BooksAdapter(this@MainActivity, bookList)
        
        val mLayoutManager = LinearLayoutManager(applicationContext)
        
        recyclerView.layoutManager = mLayoutManager
        
        recyclerView.itemAnimator = DefaultItemAnimator()
        
        recyclerView.adapter = mAdapter
        
    }
    
   
    val bookList: List<Book>
        get() {

            val bookList = ArrayList<Book>()
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

     return bookList
    }
    
    
    
    For more detail please download project.
    
    Thanks you, Have a great day !



[![See](https://datanapps.com/public/dnarestapi/buy/buy_coffee4.png)](https://www.paypal.me/datanappspaynow)

  ### License

Copyright [2021] [datanapps]

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
   http://www.apache.org/licenses/LICENSE-2.0


