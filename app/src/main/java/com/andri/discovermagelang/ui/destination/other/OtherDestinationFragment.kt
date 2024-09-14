package com.andri.discovermagelang.ui.destination.other

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.andri.discovermagelang.R
import com.andri.discovermagelang.ui.destination.SectionsPagerAdapter
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class OtherDestinationFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_other_destination, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        slideShow(view)
        setTabLayout(view)
    }

    private fun slideShow(view: View) {
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.img_holder))
        imageList.add(SlideModel(R.drawable.img_holder))
        imageList.add(SlideModel(R.drawable.img_holder))

        val imageSlider = view.findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }

    // TabLayout and ViewPager2
    private fun setTabLayout(view: View) {
        val sectionsPagerAdapter = OtherSectionsPagerAdapter(requireActivity())
        val viewPager: ViewPager2 = view.findViewById(R.id.viewPager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = view.findViewById(R.id.tabLayout)
        TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = resources.getString(TAB_TITLES[position])
        }.attach()
    }

    companion object {
        private val TAB_TITLES = intArrayOf(
            R.string.tab_text_1,
            R.string.tab_text_2,
            R.string.tab_text_3
        )
    }
}