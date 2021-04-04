package ru.shlauzer.demo

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class VideoFragment : Fragment() {

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_video, container, false).apply {
            val customBottomSheet = findViewById<CustomBottomSheet>(R.id.custom_bottom_sheet)
            customBottomSheet.setOnTouchListener { _, _ ->
                val pager = (activity as MainActivity).pager
                val pagerChild = pager.getChildAt(0) as ViewGroup
                pagerChild.requestDisallowInterceptTouchEvent(true)
                true
            }
        }
    }
}