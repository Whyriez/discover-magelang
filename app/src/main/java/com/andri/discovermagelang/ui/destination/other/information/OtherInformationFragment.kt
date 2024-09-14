package com.andri.discovermagelang.ui.destination.other.information

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.andri.discovermagelang.R
import com.andri.discovermagelang.data.model.Facility
import com.andri.discovermagelang.data.model.Other
import com.andri.discovermagelang.databinding.FragmentInformationBinding
import com.andri.discovermagelang.databinding.FragmentOtherInformationBinding
import com.andri.discovermagelang.ui.destination.information.FacilityAdapter
import com.andri.discovermagelang.ui.destination.information.OtherAdapter

class OtherInformationFragment : Fragment() {
    private var _binding: FragmentOtherInformationBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOtherInformationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setListFacility()
        setListOther()
    }

    private fun setListFacility() {
        val itemList = listOf(
            Facility( "Lorem", R.drawable.ic_mug),
            Facility( "Lorem", R.drawable.ic_mug),
            Facility( "Lorem", R.drawable.ic_mug),
            Facility( "Lorem", R.drawable.ic_mug),
            Facility( "Lorem", R.drawable.ic_mug),
            Facility( "Lorem", R.drawable.ic_mug),
            Facility( "Lorem", R.drawable.ic_mug),
            Facility( "Lorem", R.drawable.ic_mug),
            Facility( "Lorem", R.drawable.ic_mug),
        )

        val adapter = FacilityAdapter(itemList)
        binding.rvFacility.layoutManager = GridLayoutManager(requireContext(), 4)
        binding.rvFacility.adapter = adapter
    }

    private fun setListOther() {
        val itemList = listOf(
            Other( "Lorem Ipsum", 10000),
            Other( "Lorem Ipsum", 10000),
            Other( "Lorem Ipsum", 10000),
            Other( "Lorem Ipsum", 10000),
        )

        val adapter = OtherAdapter(itemList)
        binding.rvOther.adapter = adapter
    }
}