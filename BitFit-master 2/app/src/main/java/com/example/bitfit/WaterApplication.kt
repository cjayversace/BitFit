//package com.example.bitfit
//
//import android.app.Application
//import com.example.bitfit.data.DaysRoomDatabase
//import kotlin.reflect.KProperty
//
//class WaterApplication : Application() {
//    // Using by lazy so the database and the repository are only created when they're needed
//    // rather than when the application starts
//    val database: DaysRoomDatabase by lazy { DaysRoomDatabase.getDatabase(this) }
//}
//
//
//
