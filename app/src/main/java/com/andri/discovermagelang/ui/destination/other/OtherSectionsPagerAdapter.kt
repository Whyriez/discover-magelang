package com.andri.discovermagelang.ui.destination.other

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.andri.discovermagelang.ui.destination.information.InformationFragment
import com.andri.discovermagelang.ui.destination.other.information.OtherInformationFragment
import com.andri.discovermagelang.ui.destination.other.regional.OtherRegionalFragment
import com.andri.discovermagelang.ui.destination.other.review.OtherReviewFragment
import com.andri.discovermagelang.ui.destination.regional.RegionalFragment
import com.andri.discovermagelang.ui.destination.review.ReviewFragment

class OtherSectionsPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = OtherRegionalFragment()
            1 -> fragment = OtherReviewFragment()
            2 -> fragment = OtherInformationFragment()
        }
        return fragment as Fragment
    }

}