package com.example.imgg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var currentImg = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next = findViewById<ImageButton>(R.id.random)
        val img = findViewById<ImageView>(R.id.img1)
        val txt = findViewById<TextView>(R.id.txt)

        next.setOnClickListener {
            // Random number between 1 and 6
            currentImg = (1..6).random()

            // Set the image resource to the random number
            img.setImageResource(resources.getIdentifier("p$currentImg", "drawable", packageName))
            txt.setText("Image name is : p$currentImg")
        }

    }
}