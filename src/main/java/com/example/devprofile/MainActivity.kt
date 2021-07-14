package com.example.devprofile

import android.graphics.BitmapFactory
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var logo1: ImageView =findViewById(R.id.logo)


        val bitmap = BitmapFactory.decodeResource(resources,R.drawable.logo5)
        val rounded = RoundedBitmapDrawableFactory.create(resources,bitmap)
       rounded.cornerRadius = 15f
       // rounded.isCircular = true //logonun yuvarlak olması için
        logo1.setImageDrawable(rounded)

    }
}
