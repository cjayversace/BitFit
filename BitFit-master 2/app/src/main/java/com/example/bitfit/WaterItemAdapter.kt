package com.example.bitfit


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bitfit.databinding.WaterItemCellBinding


class WaterItemAdapter
    (private val waterItems: List<WaterItem>):RecyclerView.Adapter<WaterItemViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WaterItemViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = WaterItemCellBinding.inflate(from, parent, false)
        return WaterItemViewHolder(parent.context, binding)

    }

    override fun onBindViewHolder(holder: WaterItemViewHolder, position: Int) {
        holder.bindWaterItem(waterItems [position])
    }

    override fun getItemCount(): Int = waterItems.size
    }