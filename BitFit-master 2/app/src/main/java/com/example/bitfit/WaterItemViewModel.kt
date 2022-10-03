package com.example.bitfit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class WaterItemViewModel: ViewModel() {
    var waterItems = MutableLiveData<MutableList<WaterItem>>()

    init{
        waterItems.value = mutableListOf()
    }

    fun addWaterItem(newWater: WaterItem){
        val list = waterItems.value
        list!!.add(newWater)
        waterItems.postValue(list)
    }

    fun updateWaterItem(id: UUID, date: String, gallons: String){
        val list = waterItems.value
        val water = list?.find{it.id == id}!!
        water.date = date
        water.gallons = gallons
        waterItems.postValue(list)
    }
}