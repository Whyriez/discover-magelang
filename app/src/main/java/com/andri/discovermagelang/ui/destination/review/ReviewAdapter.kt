package com.andri.discovermagelang.ui.destination.review

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.andri.discovermagelang.data.model.Review
import com.andri.discovermagelang.databinding.ItemRowReviewBinding
import com.andri.discovermagelang.ui.destination.review.QaAdapter.ViewHolder

class ReviewAdapter(private val reviewList: List<Review>): RecyclerView.Adapter<ReviewAdapter.ViewHolder>() {

    class ViewHolder (val binding: ItemRowReviewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemRowReviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = reviewList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(reviewList[position]) {
                binding.apply {
                    textName.text = name
                    ivProfile.setImageResource(profile)
                    textDate.text = date
                    textTitle.text = title
                    textDesc.text = desc
                    textCountry.text = country
                }
            }
        }
    }

}