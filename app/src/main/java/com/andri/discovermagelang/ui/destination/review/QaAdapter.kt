package com.andri.discovermagelang.ui.destination.review

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.andri.discovermagelang.data.model.Qa
import com.andri.discovermagelang.databinding.ItemRowQaBinding

class QaAdapter(private val qAList: List<Qa>): RecyclerView.Adapter<QaAdapter.ViewHolder>() {

    class ViewHolder (val binding: ItemRowQaBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemRowQaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = qAList.size

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(qAList[position]) {
                binding.apply {
                    labelDate.text = date
                    labelQuestion.text = question
                    labelCountAnswer.text = "$answer Answers"
                    ivPeople.setImageResource(img)
                }
            }
        }
    }
}