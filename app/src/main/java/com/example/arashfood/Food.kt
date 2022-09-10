package com.example.arashfood

import android.text.Editable
import androidx.room.Entity
import androidx.room.PrimaryKey

data class Food(

    val txtFoodName: String,
    val txtLabel: String,
    val txtPrice: String,
    val txtCity: String,
    val Point: Int,
    val Rate: Float,
    val UrlImg: String,
)
