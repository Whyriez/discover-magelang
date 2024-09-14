package com.andri.discovermagelang.ui.destination

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.andri.discovermagelang.ui.destination.information.InformationFragment
import com.andri.discovermagelang.ui.destination.regional.RegionalFragment
import com.andri.discovermagelang.ui.destination.review.ReviewFragment

class SectionsPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = RegionalFragment()
            1 -> fragment = ReviewFragment()
            2 -> fragment = InformationFragment()
        }
        return fragment as Fragment
    }

}