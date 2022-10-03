//package com.example.bitfit.data
//
//import android.content.Context
//import androidx.room.Database
//import androidx.room.Room
//import androidx.room.RoomDatabase
//
//
//@Database(entities = [Days::class], version = 1, exportSchema = false)
//abstract class DaysRoomDatabase : RoomDatabase() {
//    abstract fun daysDao(): DaysDao
//
//    companion object {
//        @Volatile
//        private var INSTANCE: DaysRoomDatabase? = null
//
//        fun getDatabase(context: Context): DaysRoomDatabase {
//            return INSTANCE ?: synchronized(this) {
//                val instance = Room.databaseBuilder(context.applicationContext,
//                    DaysRoomDatabase::class.java,
//                    "days_database")
//
//                    .fallbackToDestructiveMigration()
//                    .build()
//                INSTANCE = instance
//                return instance
//            }
//        }
//    }
//
//
//}
