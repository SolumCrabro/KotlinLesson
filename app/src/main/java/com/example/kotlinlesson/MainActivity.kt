package com.example.kotlinlesson

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlinlesson.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.imageView.setImageResource(R.drawable.avatar_300)
        binding.imageView.tag = R.drawable.avatar_300


        binding.button.setOnClickListener {

            if (binding.imageView.tag == R.drawable.avatar_300) {

                binding.imageView.setImageResource(R.drawable.avatar2_300)
                binding.imageView.tag = R.drawable.avatar2_300
            } else {

                binding.imageView.setImageResource(R.drawable.avatar_300)
                binding.imageView.tag = R.drawable.avatar_300
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

          /* binding.cardView1.setOnClickListener {
               binding.imageView.setImageResource(R.drawable.avatar2_300)*/

              /*if (imageView2.tag == R.drawable.avatar_300)
                  imageView2.setImageResource(R.drawable.avatar2_300)
               else
                   imageView2.setImageResource(R.drawable.avatar_300)*/
           }






    }
