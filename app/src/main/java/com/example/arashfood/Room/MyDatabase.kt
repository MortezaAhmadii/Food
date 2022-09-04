package com.example.arashfood.Room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.arashfood.Food

@Database(version = 1, exportSchema = false, entities = [Food::class])
abstract class MyDatabase: RoomDatabase() {

    abstract val foodDao:FoodDao

    companion object{

        private var database:MyDatabase?=null

    }

}