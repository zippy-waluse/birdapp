package com.akirachix.birdsapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.birdsapplication.databinding.ActivityMainBinding
import com.akirachix.birdsapplication.databinding.ActivityThirdbirddrawBinding
import com.squareup.picasso.Picasso

class thirdbirddraw : AppCompatActivity() {
    lateinit var binding: ActivityThirdbirddrawBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityThirdbirddrawBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.leftArrow3.setOnClickListener {
            finish()
        }
        binding.rightarrow3.setOnClickListener {
            val intent=Intent(this,fourthbirddraw::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://www.istockphoto.com/photo/close-up-portrait-of-common-eurasian-chaffinch-outdoors-gm1592365407-529538384?utm_campaign=adp_photos_sponsored&utm_content=https%3A%2F%2Funsplash.com%2Fphotos%2Fbrown-and-black-bird-in-selective-focus-photography-iq96SvUkuxQ&utm_medium=affiliate&utm_source=unsplash&utm_term=ireland%3A%3A%3A")
            .into(binding.imageView3)


    }

}