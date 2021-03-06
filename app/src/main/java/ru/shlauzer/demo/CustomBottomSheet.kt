package ru.shlauzer.demo

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout

class CustomBottomSheet @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    init {
        inflate(context, R.layout.custom_bottom_sheet_layout, this)
    }
}