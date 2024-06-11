package com.akirachix.birdsapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.birdsapplication.databinding.ActivityFifthbirddrawBinding
import com.akirachix.birdsapplication.databinding.ActivityThirdbirddrawBinding
import com.squareup.picasso.Picasso

class fifthbirddraw : AppCompatActivity() {
    lateinit var binding: ActivityFifthbirddrawBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFifthbirddrawBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.leftarrow5.setOnClickListener {
            finish()
        }
        Picasso
            .get()
            .load("https://media.istockphoto.com/id/1492554083/photo/common-chaffinch-fringilla-coelebs-a-bird-in-the-forest-sits-on-a-branch-on-a-beautiful.jpg?s=612x612&w=0&k=20&c=-4VgT-GfF8yLKGtFLhcVZ3M0OHA6jgTaRhE77hCu3VI")
            .into(binding.imageView5)

    }
}