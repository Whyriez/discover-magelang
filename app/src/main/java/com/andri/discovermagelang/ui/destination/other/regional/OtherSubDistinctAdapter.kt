package com.andri.discovermagelang.ui.destination.other.regional

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.andri.discovermagelang.data.model.SubDistrict
import com.andri.discovermagelang.databinding.ItemRowSubDistrictBinding

class OtherSubDistinctAdapter(
    private var subDistrictList: List<SubDistrict>
): RecyclerView.Adapter<OtherSubDistinctAdapter.ViewHolder>() {

    class ViewHolder (val binding: ItemRowSubDistrictBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding = ItemRowSubDistrictBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val subDistrict = subDistrictList[position]
        with(holder) {
            with(subDistrictList[position]) {
                binding.apply {
                    labelSubDistrict.text = name
                    ivSubDistrict.setImageResource(image)
                }
            }
        }
    }

    override fun getItemCount(): Int = subDistrictList.size
}