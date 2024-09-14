package com.andri.discovermagelang.ui.main.search

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.andri.discovermagelang.data.model.Tour
import com.andri.discovermagelang.databinding.ItemRowTourVertBinding

class TourSearchVerticalAdapter(private val tourList: List<Tour>): RecyclerView.Adapter<TourSearchVerticalAdapter.ViewHolder>() {

    class ViewHolder (val binding: ItemRowTourVertBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding = ItemRowTourVertBinding.inflate(LayoutInflater.from(parent.context), parent, false)
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