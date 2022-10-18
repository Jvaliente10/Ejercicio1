package com.example.joseantoniovaliente.ejercicio1


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.joseantoniovaliente.ejercicio1.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_PERSON = "person"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding: ActivityDetailBinding
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater).apply {
            setContentView(root)
            val person = intent.getParcelableExtra<Person>(EXTRA_PERSON)

            if (person != null) {
                binding.personName.text = person.name
                Glide.with(binding.personImage)
                    .load(person.image).into(binding.personImage)
                message.setOnClickListener {
                    val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:${person.mail}"))
                    intent.putExtra("subjet", "my subjet")
                    intent.putExtra("body", "my message")

                    startActivity(intent)


                }

                call.setOnClickListener {
                    val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("tel:${person.phone}"))
                    startActivity(intent)
                    val intent = Intent(Intent.ACTION_DIAL)
                }
            }
        }
    }
}