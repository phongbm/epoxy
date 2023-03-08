package com.airbnb.epoxy

import android.content.Context
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.FrameLayout

/**
 * Created by PhongBM on 08/03/2023
 */

class AsyncItemView(context: Context) : FrameLayout(context) {
    init {
        layoutParams = LayoutParams(MATCH_PARENT, WRAP_CONTENT)
    }
}