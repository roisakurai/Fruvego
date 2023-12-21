package com.paniroisapplication.app.modules.homelocationtwo.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.paniroisapplication.app.databinding.SlideritemHomeLocationTwo1Binding
import com.paniroisapplication.app.modules.homelocationtwo.`data`.model.ImageSliderSliderrectangle189Model
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
    if (binding is SlideritemHomeLocationTwo1Binding) {
      binding.imageSliderSliderrectangle189Model = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemHomeLocationTwo1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
