package com.example.joseantoniovaliente.ejercicio1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.joseantoniovaliente.ejercicio1.databinding.ViewPersonItemBinding

class PersonAdapter(private val person: List<Person>) : RecyclerView.Adapter<PersonAdapter.ViewHolder>() {


    class ViewHolder(private val binding: ViewPersonItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(person: Person){
            binding.name.text = person.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ViewPersonItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(person[position])
    }

    override fun getItemCount(): Int {
        return person.size
    }
}