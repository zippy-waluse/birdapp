package com.akirachix.birdsapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.birdsapplication.databinding.ActivityMainBinding
import com.akirachix.birdsapplication.databinding.ActivitySecondbirddrawBinding
import com.squareup.picasso.Picasso

class secondbirddraw : AppCompatActivity() {
    lateinit var binding: ActivitySecondbirddrawBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivitySecondbirddrawBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.leftarrow2.setOnClickListener {
            finish()
        }

        binding.rightarrow2.setOnClickListener {
            val intent = Intent(this,thirdbirddraw::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://www.pinterest.com/pin/311100286773190518/")
            .into(binding.imageView2)
    }
}