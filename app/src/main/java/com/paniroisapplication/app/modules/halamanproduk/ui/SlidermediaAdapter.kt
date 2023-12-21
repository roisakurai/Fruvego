package com.paniroisapplication.app.modules.halamanproduk.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.paniroisapplication.app.databinding.SlideritemHalamanProduk1Binding
import com.paniroisapplication.app.modules.halamanproduk.`data`.model.ImageSliderSlidermediaModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SlidermediaAdapter(
  val dataList: ArrayList<ImageSliderSlidermediaModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSlidermediaModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemHalamanProduk1Binding) {
      binding.imageSliderSlidermediaModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemHalamanProduk1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
