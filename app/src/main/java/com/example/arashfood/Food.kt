package com.example.arashfood

import android.text.Editable
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "table_food")

data class Food(
    @PrimaryKey (autoGenerate = true)
    val id : Int?=null,

    val txtFoodName: String,
    val txtLabel: String,
    val txtPrice: String,
    val txtCity: String,
    val Point: Int,
    val Rate: Float,
    val UrlImg: String,
)
