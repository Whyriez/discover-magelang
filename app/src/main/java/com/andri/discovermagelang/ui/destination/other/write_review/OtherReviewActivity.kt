package com.andri.discovermagelang.ui.destination.other.write_review

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.andri.discovermagelang.R
import com.andri.discovermagelang.data.model.Upload
import com.andri.discovermagelang.databinding.ActivityOtherReviewBinding
import com.andri.discovermagelang.databinding.ActivityReviewBinding
import com.andri.discovermagelang.ui.destination.write_review.UploadAdapter

class OtherReviewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOtherReviewBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityOtherReviewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setListUpload()
        setListener()
    }

    private fun setListener() {
        binding.ivBack.setOnClickListener {
            onBackPressed()
        }
    }

    private fun setListUpload() {
        val itemList = listOf(
            Upload( "Lorem ipsum", R.drawable.img_holder),
            Upload( "Lorem ipsum", R.drawable.img_holder),
            Upload( "Lorem ipsum", R.drawable.img_holder),
            Upload( "Lorem ipsum", R.drawable.img_holder),
            Upload( "Lorem ipsum", R.drawable.img_holder),
        )

        val adapter = UploadAdapter(itemList)
        binding.rvUpload.adapter = adapter
    }
}