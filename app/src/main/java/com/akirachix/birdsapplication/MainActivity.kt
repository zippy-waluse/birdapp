package com.akirachix.birdsapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.birdsapplication.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rightArrow.setOnClickListener {
            val intent = Intent(this,secondbirddraw::class.java)
            startActivity(intent)

        }


        Picasso

            .get()
            .load("https://images.unsplash.com/photo-1548960095-770e3e6364de?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzB8fGJpcmR8ZW58MHx8MHx8fDA%3D")
            .into(binding.yellowBirds)

    }
}