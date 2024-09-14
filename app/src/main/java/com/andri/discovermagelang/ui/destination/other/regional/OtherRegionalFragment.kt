package com.andri.discovermagelang.ui.destination.other.regional

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.andri.discovermagelang.R
import com.andri.discovermagelang.data.model.SubDistrict
import com.andri.discovermagelang.databinding.FragmentOtherRegionalBinding
import com.andri.discovermagelang.ui.destination.regional.SubDistrictAdapter

class OtherRegionalFragment : Fragment() {
    private var _binding: FragmentOtherRegionalBinding? = null

    private val binding get() = _binding!!

    private lateinit var adapter: OtherSubDistinctAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentOtherRegionalBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setListSubDistrict()
    }

    private fun setListSubDistrict() {
        val itemList = listOf(
            SubDistrict( "Bandongan", R.drawable.img_holder),
            SubDistrict( "Borobudur", R.drawable.img_holder),
            SubDistrict( "Lorem ipsum", R.drawable.img_holder),
            SubDistrict( "Lorem ipsum", R.drawable.img_holder),
            SubDistrict( "Lorem ipsum", R.drawable.img_holder),
            SubDistrict( "Lorem ipsum", R.drawable.img_holder),
        )

        adapter = OtherSubDistinctAdapter(itemList)
        binding.rvSubDistrict.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.rvSubDistrict.adapter = adapter
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}