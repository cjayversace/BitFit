package com.example.bitfit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bitfit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var waterItemViewModel: WaterItemViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        waterItemViewModel = ViewModelProvider(this).get(WaterItemViewModel::class.java)
        binding.button.setOnClickListener{
            NewWaterSheet(null).show(supportFragmentManager, "newWaterTag")
        }

        setRecyclerView()
    }

    private fun setRecyclerView(){
        val mainActivity = this
        waterItemViewModel.waterItems.observe(this){
            binding.waterItemRecyclerView.apply{
                layoutManager = LinearLayoutManager(applicationContext)
                adapter = WaterItemAdapter(it)
            }
        }
    }
}