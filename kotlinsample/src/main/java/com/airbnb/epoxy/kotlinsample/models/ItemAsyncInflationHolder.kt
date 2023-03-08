package com.airbnb.epoxy.kotlinsample.models

import com.airbnb.epoxy.kotlinsample.R
import com.airbnb.epoxy.kotlinsample.databinding.HolderItemAsyncInflationBinding
import com.airbnb.epoxy.kotlinsample.helpers.ViewBindingEpoxyModelWithHolder

/**
 * Created by PhongBM on 08/03/2023
 */

data class ItemAsyncInflationHolder(
    val data: Int
) : ViewBindingEpoxyModelWithHolder<HolderItemAsyncInflationBinding>() {
    override fun useAsyncInflation() = true

    override fun getDefaultLayout() = R.layout.holder_item_async_inflation

    override fun HolderItemAsyncInflationBinding.bind() {
    }
}