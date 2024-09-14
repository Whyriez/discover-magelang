package com.andri.discovermagelang.ui.destination.write_review

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.andri.discovermagelang.data.model.Upload
import com.andri.discovermagelang.databinding.ItemRowUploadBinding

class UploadAdapter(private val uploadList: List<Upload>) : RecyclerView.Adapter<UploadAdapter.ViewHolder>() {

    class ViewHolder (val binding: ItemRowUploadBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding = ItemRowUploadBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(uploadList[position]) {
                binding.apply {
                    imageViewPhoto.setImageResource(image)
                }
            }
        }
    }

    override fun getItemCount(): Int = uploadList.size
}