package com.example.imageview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import com.example.imageview.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val inflater = layoutInflater
        binding = ActivityMainBinding.inflate(inflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        txt_title.setOnClickListener {
            Toast.makeText(this, "Good Luck For Your New Husband Dream...", Toast.LENGTH_LONG).show()
        }

        img_dream.setOnClickListener {
            Toast.makeText(this, "Hope You Enjoy When You Got Pregnant Dream...", Toast.LENGTH_LONG).show()
        }
    }
}