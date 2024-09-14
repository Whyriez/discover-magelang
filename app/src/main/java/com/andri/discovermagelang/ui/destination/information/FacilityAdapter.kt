package com.andri.discovermagelang.ui.destination.information

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.andri.discovermagelang.data.model.Facility
import com.andri.discovermagelang.databinding.ItemRowFacilityBinding

class FacilityAdapter(private val facilityList: List<Facility>): RecyclerView.Adapter<FacilityAdapter.ViewHolder>() {

    class ViewHolder (val binding: ItemRowFacilityBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding = ItemRowFacilityBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(facilityList[position]) {
                binding.apply {
                    labelFacility.text = name
                    ivFacility.setImageResource(image)
                }
            }
        }
    }

    override fun getItemCount(): Int = facilityList.size
}
