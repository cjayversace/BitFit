package com.example.bitfit

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.bitfit.databinding.WaterItemCellBinding

class WaterItemViewHolder(
    private val context: Context,
    private val binding: WaterItemCellBinding
): RecyclerView.ViewHolder(binding.root){

        fun bindWaterItem(waterItem: WaterItem){
            binding.date.text = waterItem.date
            binding.water.text = waterItem.gallons
        }

}