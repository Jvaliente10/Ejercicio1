package com.example.joseantoniovaliente.ejercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.joseantoniovaliente.ejercicio1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler.adapter = PersonAdapter(
            listOf(
                Person("name1","mail1","phone1", "image1"),
                Person("name2","mail2","phone2", "image2"),
                Person("name3","mail3","phone3", "image3"),
                Person("name4","mail4","phone4", "image4")
            )
        )
    }
}