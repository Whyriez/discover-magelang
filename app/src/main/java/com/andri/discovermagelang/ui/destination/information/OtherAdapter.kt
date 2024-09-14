package com.andri.discovermagelang.ui.destination.information

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.andri.discovermagelang.data.model.Other
import com.andri.discovermagelang.databinding.ItemRowOtherBinding

class OtherAdapter (private val otherList: List<Other>): RecyclerView.Adapter<OtherAdapter.ViewHolder>() {

    class ViewHolder (val binding: ItemRowOtherBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding = ItemRowOtherBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(otherList[position]) {
                binding.apply {
                    labelName.text = name
                    labelPrice.text = "Rp.$price"
                }
            }
        }
    }

    override fun getItemCount(): Int = otherList.size
}