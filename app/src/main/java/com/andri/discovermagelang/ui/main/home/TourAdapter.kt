package com.andri.discovermagelang.ui.main.home

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.andri.discovermagelang.data.model.Tour
import com.andri.discovermagelang.databinding.ItemRowTourBinding

class TourAdapter (private val tourList: List<Tour>): RecyclerView.Adapter<TourAdapter.ViewHolder>() {

    class ViewHolder (val binding: ItemRowTourBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding = ItemRowTourBinding.inflate(LayoutInflater.from(parent.context), parent, false)
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