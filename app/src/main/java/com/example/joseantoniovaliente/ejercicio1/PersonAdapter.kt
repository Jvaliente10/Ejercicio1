package com.example.joseantoniovaliente.ejercicio1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.joseantoniovaliente.ejercicio1.databinding.ViewPersonItemBinding

interface PersonClickedListener {
    fun onPersonClicked(person:Person)
    
}

class PersonAdapter(private val person: List<Person>, private val personClicked:PersonClickedListener,
                    param: (Person) -> Unit) : RecyclerView.Adapter<PersonAdapter.ViewHolder>() {


    class ViewHolder(private val binding: ViewPersonItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(person: Person){
            binding.name.text = person.name
            binding.telfn.text = person.phone
            binding.mail.text = person.mail
            Glide.with(binding.root.context).load(person.image).into(binding.imagePerson)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ViewPersonItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val person1 = person[position]
        holder.bind(person1)
        holder.itemView.setOnClickListener{ personClicked.onPersonClicked(person1) }
    }

    override fun getItemCount(): Int {
        return person.size
    }
}