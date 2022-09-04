package com.example.arashfood.Room

import android.icu.text.StringSearch
import androidx.room.*
import com.example.arashfood.Food

@Dao
interface FoodDao {
    @Insert
    fun insertFood(food: Food)

    @Update
    fun updateFood(food: Food)

    @Delete
    fun daleteFood(food: Food)

    @Query("DELETE FROM table_food")
    fun deleteAll(food: Food)

    @Query("SELECT * FROM table_food")
    fun getAllFood():List<Food>

    @Query(" SELECT * FROM table_food WHERE txtFoodName LIKE '%'|| :searching || '%'")
    fun search (searching: String): List<Food>


}