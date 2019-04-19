# AndroidXRecycleView
AndroidX Recycleview Example


**AndroidX is the Android Extension library which is very new and exited Support in android library.
All Android Developer using AndroidX supports for newer OS features. 
This should help you to integrate recycle view.**

To Integrate androidX Recycle view have to follow some steps.


**1. Need to add below line in gradle.properties

android.useAndroidX=true
android.enableJetifier=true

**2. Implement dependencies in app gradle file

// app compact
    implementation "androidx.appcompat:appcompat:1.1.0-alpha04"

    // constraint layout
    implementation 'androidx.constraintlayout:constraintlayout:1.1.3'

    // recycle view
    implementation 'androidx.recyclerview:recyclerview:1.1.0-alpha04'


    // glide

    implementation 'com.github.bumptech.glide:glide:4.9.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.9.0'


