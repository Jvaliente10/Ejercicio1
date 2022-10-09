package com.example.joseantoniovaliente.ejercicio1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.bumptech.glide.Glide
import com.example.joseantoniovaliente.ejercicio1.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_PERSON = "person"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val person = intent.getParcelableExtra<Person>(EXTRA_PERSON)

        if (person!=null){
            binding.personName.text = person.name;
            Glide.with(binding.personImage)
                .load(person.image).into(binding.personImage)
        }
    }
}