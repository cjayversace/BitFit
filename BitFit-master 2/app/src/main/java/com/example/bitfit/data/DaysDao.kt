//package com.example.bitfit.data
//
//import androidx.room.*
//import kotlinx.coroutines.flow.Flow
//
//@Dao
//interface DaysDao {
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    suspend fun insert(days: Days)
//
//    @Update
//    suspend fun update(days: Days)
//
//    @Delete
//    suspend fun delete(days: Days)
//
//    @Query("SELECT * from days WHERE id = :id")
//    fun getDay(id: Int): Flow<Days>
//
//    @Query("SELECT * from days ORDER BY name ASC")
//    fun getItems(): Flow<List<Days>>
//
//
//}