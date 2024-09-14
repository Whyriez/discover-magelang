package com.andri.discovermagelang.ui.destination.other.review

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.andri.discovermagelang.R
import com.andri.discovermagelang.data.model.Qa
import com.andri.discovermagelang.data.model.Review
import com.andri.discovermagelang.databinding.FragmentOtherReviewBinding
import com.andri.discovermagelang.ui.destination.other.write_review.OtherReviewActivity
import com.andri.discovermagelang.ui.destination.review.QaAdapter
import com.andri.discovermagelang.ui.destination.review.ReviewAdapter

class OtherReviewFragment : Fragment() {
    private var _binding: FragmentOtherReviewBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOtherReviewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setListQa()
        setListener()
        setListReview()
    }

    private fun setListener() {
        binding.buttonWriteReview.setOnClickListener {
            val intent = Intent(context, OtherReviewActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setListQa() {
        val itemList = listOf(
            Qa("Aug 23, 2024", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.", 3, R.drawable.img_people_qa),
            Qa("Aug 25, 2024", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.", 3, R.drawable.img_people_qa),
        )

        val adapter = QaAdapter(itemList)
        binding.rvQa.adapter = adapter
    }

    private fun setListReview() {
        val itemList = listOf(
            Review( R.drawable.img_profile_review,"Abigail Beverly", "Inggris", "Aug 23, 2024", "Lorem ipsum dolor sit amet", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."),
            Review( R.drawable.img_profile_review,"Rafael Marque", "Mexico", "Dec 12, 2023", "Lorem ipsum dolor sit amet", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."),
        )

        val adapter = ReviewAdapter(itemList)
        binding.rvReview.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}