package com.example.joseantoniovaliente.ejercicio1

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import com.example.joseantoniovaliente.ejercicio1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            recycler.adapter=PersonAdapter(persons){
                    person->
                val intent = Intent(this@MainActivity,DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_PERSON,person)
                startActivity(intent)

            }
        }
    }

    private val persons =
        listOf(
            Person("Jose","jose123@gmail.com","689741554", "https://loremflickr.com/320/240/young,boy"),
            Person("Juan","juan123@gmail.com","612356778", "https://loremflickr.com/320/240/father"),
            Person("Maria","maria123@gmail.com","691753654", "https://loremflickr.com/320/240/women,young"),
            Person("Alba","alba123@gmail.com","639714852", "https://loremflickr.com/320/240/girl,redhead")
        )

}