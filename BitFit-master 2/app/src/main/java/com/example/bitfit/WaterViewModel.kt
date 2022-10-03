//package com.example.bitfit
//
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import androidx.lifecycle.ViewModelProvider
//import kotlinx.coroutines.launch
//import com.example.bitfit.data.Days
//import com.example.bitfit.data.DaysDao
//
//class WaterViewModel (private val daysDao: DaysDao) : ViewModel() {
//    fun addNewItem(days: String, gallons: String) {
//        val newDay = getNewItemEntry(days, gallons)
//        insertItem(newDay)
//    }
//
//    private fun insertItem(days: Days) {
//        viewModelScope.launch {
//            daysDao.insert(days)
//        }
//    }
//
//    fun isEntryValid(days: String, gallons: String): Boolean {
//        if (days.isBlank() || days.isBlank()) {
//            return false
//        }
//        return true
//    }
//
//
//    private fun getNewItemEntry(days: String, gallons: String): Days {
//        return Days(
//            date = days,
//            gallons = gallons
//        )
//    }
//}
//
//class WaterViewModelFactory(private val daysDao: DaysDao) : ViewModelProvider.Factory {
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        if (modelClass.isAssignableFrom(WaterViewModel::class.java)) {
//            @Suppress("UNCHECKED_CAST")
//            return WaterViewModel(daysDao) as T
//        }
//        throw IllegalArgumentException("Unknown ViewModel class")
//    }
//}