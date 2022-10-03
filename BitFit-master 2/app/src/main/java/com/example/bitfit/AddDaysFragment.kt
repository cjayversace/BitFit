//package com.example.bitfit
//
//import android.content.Context.INPUT_METHOD_SERVICE
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.view.inputmethod.InputMethodManager
//import androidx.fragment.app.Fragment
//import androidx.fragment.app.activityViewModels
//import androidx.navigation.fragment.findNavController
//import androidx.navigation.fragment.navArgs
//import com.example.bitfit.data.Days
//import com.example.bitfit.databinding.FragmentAddItemBinding
//
///**
// * Fragment to add or update an item in the Inventory database.
// */
//class AddItemFragment : Fragment() {
//
//    private val navigationArgs: ItemDetailFragmentArgs by navArgs()
//    lateinit var days: Days
//
//    // Use the 'by activityViewModels()' Kotlin property delegate from the fragment-ktx artifact
//    // to share the ViewModel across fragments.
//    private val viewModel: WaterViewModel by activityViewModels {
//        WaterViewModelFactory(
//            (activity?.application as WaterApplication).database.daysDao()
//        )
//    }
//
//    // Binding object instance corresponding to the fragment_add_item.xml layout
//    // This property is non-null between the onCreateView() and onDestroyView() lifecycle callbacks,
//    // when the view hierarchy is attached to the fragment
//    private var _binding: FragmentAddItemBinding? = null
//    private val binding get() = _binding!!
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        _binding = FragmentAddItemBinding.inflate(inflater, container, false)
//        return binding.root
//    }
//
//    /**
//     * Returns true if the EditTexts are not empty
//     */
//    private fun isEntryValid(): Boolean {
//        return viewModel.isEntryValid(
//            binding.day.text.toString(),
//            binding.gallon.text.toString()
//        )
//    }
//
//    /**
//     * Inserts the new Item into database and navigates up to list fragment.
//     */
//    private fun addNewItem() {
//        if (isEntryValid()) {
//            viewModel.addNewItem(
//                binding.day.text.toString(),
//                binding.gallon.text.toString()
//            )
//            val action = AddItemFragmentDirections.actionAddItemFragmentToItemListFragment()
//            findNavController().navigate(action)
//        }
//    }
//
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        binding.saveAction.setOnClickListener {
//            addNewItem()
//        }
//    }
//
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        // Hide keyboard.
//        val inputMethodManager = requireActivity().getSystemService(INPUT_METHOD_SERVICE) as
//                InputMethodManager
//        inputMethodManager.hideSoftInputFromWindow(requireActivity().currentFocus?.windowToken, 0)
//        _binding = null
//    }
//}