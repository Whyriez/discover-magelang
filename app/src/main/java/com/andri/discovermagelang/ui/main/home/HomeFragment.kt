package com.andri.discovermagelang.ui.main.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.andri.discovermagelang.R
import com.andri.discovermagelang.data.model.Tour
import com.andri.discovermagelang.databinding.FragmentHomeBinding
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        slideShow()
        setListener()
        setListTour()
    }

    private fun slideShow() {
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.img_holder))
        imageList.add(SlideModel(R.drawable.img_holder))
        imageList.add(SlideModel(R.drawable.img_holder))

        binding.imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }

    private fun setListener() {
        binding.apply {
            materialCardView.setOnClickListener {
                val navController = findNavController()
                navController.navigate(R.id.destinationFragment)
            }
        }
    }

    private fun setListTour() {
        val itemList = listOf(
            Tour( "Lorem ipsum", R.drawable.img_holder,"Lorem ipsum"),
            Tour( "Lorem ipsum", R.drawable.img_holder,"Lorem ipsum"),
            Tour( "Lorem ipsum", R.drawable.img_holder,"Lorem ipsum"),
        )

        val adapter = TourAdapter(itemList)
        binding.rvTour.adapter = adapter
    }
}