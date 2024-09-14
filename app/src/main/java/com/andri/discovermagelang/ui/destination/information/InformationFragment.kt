package com.andri.discovermagelang.ui.destination.information

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.andri.discovermagelang.R
import com.andri.discovermagelang.data.model.Facility
import com.andri.discovermagelang.data.model.Other
import com.andri.discovermagelang.databinding.FragmentInformationBinding

class InformationFragment : Fragment() {

    private var _binding: FragmentInformationBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInformationBinding.inflate(inflater, container, false)

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