package com.example.bitfit

import android.app.Activity
import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.bitfit.databinding.FragmentNewdaysheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class NewWaterSheet (var waterItem: WaterItem?): BottomSheetDialogFragment(){

    private lateinit var binding: FragmentNewdaysheetBinding
    private lateinit var waterItemViewModel: WaterItemViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val activity = requireActivity()

        if (waterItem != null) {
            binding.newDay.text = "Edit Day"
            val editable = Editable.Factory.getInstance()
            binding.theDate.text = editable.newEditable(waterItem!!.date)
            binding.theGallons.text = editable.newEditable(waterItem!!.gallons)
        } else {
            binding.newDay.text = "New Day"
        }

        waterItemViewModel = ViewModelProvider(activity).get(WaterItemViewModel::class.java)
        binding.saveButton.setOnClickListener {
            saveAction()
        }
    }

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            binding = FragmentNewdaysheetBinding.inflate(inflater, container, false)
            return binding.root
        }

        private fun saveAction(){
            var day = binding.theDate.text.toString()
            var gals = binding.theGallons.text.toString()

            if(waterItem == null){
                val newWaterItem = WaterItem(day, gals)
                waterItemViewModel.addWaterItem(newWaterItem)
            }else{
                waterItemViewModel.updateWaterItem(waterItem!!.id, day, gals)
            }

            binding.theDate.setText("")
            binding.theGallons.setText("")

            dismiss()
        }
    }
