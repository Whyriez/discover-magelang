package com.andri.discoverin.ui.main.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.andri.discovermagelang.R
import com.andri.discovermagelang.data.model.Tour
import com.andri.discovermagelang.databinding.FragmentSearchBinding
import com.andri.discovermagelang.ui.main.home.TourAdapter
import com.andri.discovermagelang.ui.main.search.TourSearchAdapter
import com.andri.discovermagelang.ui.main.search.TourSearchVerticalAdapter


class SearchFragment : Fragment() {
    private var _binding: FragmentSearchBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setListTour()
    }

    private fun setListTour() {
        val horizontalList = listOf(
            Tour("Tour 1", R.drawable.img_holder, "Description 1"),
            Tour("Tour 2", R.drawable.img_holder, "Description 2"),
            Tour("Tour 3", R.drawable.img_holder, "Description 3")
        )

        val adapterHorizontal = TourSearchAdapter(horizontalList)
        binding.rvHorizontal.adapter = adapterHorizontal

        val itemList = listOf(
            Tour( "Lorem ipsum", R.drawable.img_holder,"Lorem ipsum"),
            Tour( "Lorem ipsum", R.drawable.img_holder,"Lorem ipsum"),
            Tour( "Lorem ipsum", R.drawable.img_holder,"Lorem ipsum"),
        )

        val adapter = TourSearchVerticalAdapter(itemList)
        binding.rvTour.adapter = adapter
    }

    companion object {
    }
}