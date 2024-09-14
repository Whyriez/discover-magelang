package com.andri.discovermagelang.ui.main.search

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.andri.discovermagelang.data.model.Tour
import com.andri.discovermagelang.databinding.ItemRowTourHorzBinding

class TourSearchAdapter (private val tourList: List<Tour>): RecyclerView.Adapter<TourSearchAdapter.ViewHolder>() {
    class ViewHolder (val binding: ItemRowTourHorzBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding = ItemRowTourHorzBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(tourList[position]) {
                binding.apply {
                    labelName.text = "$name, $address"
                    ivTour.setImageResource(image)
                }
            }
        }
    }

    override fun getItemCount(): Int = tourList.size
}