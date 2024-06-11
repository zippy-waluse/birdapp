package com.akirachix.birdsapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.birdsapplication.databinding.ActivityFourthbirddrawBinding
import com.squareup.picasso.Picasso

class fourthbirddraw : AppCompatActivity() {
    lateinit var binding: ActivityFourthbirddrawBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthbirddrawBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.leftarrow4.setOnClickListener {
            finish()
        }


        binding.rightarrow4.setOnClickListener {
            val intent=Intent(this,fifthbirddraw::class.java)
        startActivity(intent)
        }
        Picasso
            .get()
            .load("https://media.istockphoto.com/id/522317098/photo/chaffinch.jpg?s=612x612&w=0&k=20&c=9PLPhj-HLgVSTRQ_umEeNReFrF372O9P0KZE9Cfd9z8=")
            .into(binding.imageView4)
    }
}