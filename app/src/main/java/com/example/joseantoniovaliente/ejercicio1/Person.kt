package com.example.joseantoniovaliente.ejercicio1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
 data class Person(val name: String, val mail: String, val phone: String, val image: String):Parcelable
