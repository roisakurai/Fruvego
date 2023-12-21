package com.paniroisapplication.app.modules.homelocation.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.paniroisapplication.app.databinding.SlideritemHomeLocation1Binding
import com.paniroisapplication.app.modules.homelocation.`data`.model.ImageSliderSliderrectangle189Model
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class Sliderrectangle189Adapter(
  val dataList: ArrayList<ImageSliderSliderrectangle189Model>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderrectangle189Model>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemHomeLocation1Binding) {
      binding.imageSliderSliderrectangle189Model = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemHomeLocation1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
