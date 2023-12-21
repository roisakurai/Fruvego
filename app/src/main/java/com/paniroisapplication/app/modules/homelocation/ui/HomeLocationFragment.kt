package com.paniroisapplication.app.modules.homelocation.ui

import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.base.BaseFragment
import com.paniroisapplication.app.databinding.FragmentHomeLocationBinding
import com.paniroisapplication.app.modules.homelocation.`data`.model.HomeLocationRowModel
import com.paniroisapplication.app.modules.homelocation.`data`.model.ImageSliderSliderrectangle189Model
import com.paniroisapplication.app.modules.homelocation.`data`.viewmodel.HomeLocationVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class HomeLocationFragment :
    BaseFragment<FragmentHomeLocationBinding>(R.layout.fragment_home_location) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.paniroisapplication.app/drawable/img_rectangle189")


  private val imageSliderSliderrectangle189Items: ArrayList<ImageSliderSliderrectangle189Model> =
      arrayListOf(ImageSliderSliderrectangle189Model(imageRectangle189 =
  imageUri.toString()),ImageSliderSliderrectangle189Model(imageRectangle189 =
  imageUri.toString()))


  private val viewModel: HomeLocationVM by viewModels<HomeLocationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val sliderrectangle189Adapter =
    Sliderrectangle189Adapter(imageSliderSliderrectangle189Items,true)
    binding.imageSliderSliderrectangle189.adapter = sliderrectangle189Adapter
    binding.imageSliderSliderrectangle189.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorGroup36690.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroup36690.updateIndicatorCounts(binding.imageSliderSliderrectangle189.indicatorCount)
    val homeLocationAdapter =
    HomeLocationAdapter(viewModel.homeLocationList.value?:mutableListOf())
    binding.recyclerHomeLocation.adapter = homeLocationAdapter
    homeLocationAdapter.setOnItemClickListener(
    object : HomeLocationAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeLocationRowModel) {
        onClickRecyclerHomeLocation(view, position, item)
      }
    }
    )
    viewModel.homeLocationList.observe(requireActivity()) {
      homeLocationAdapter.updateData(it)
    }
    binding.homeLocationVM = viewModel
    setUpSearchViewSearchListener()
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderrectangle189.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderrectangle189.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerHomeLocation(
    view: View,
    position: Int,
    item: HomeLocationRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewSearchListener(): Unit {
    binding.searchViewSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "HOME_LOCATION_FRAGMENT"


      fun getInstance(bundle: Bundle?): HomeLocationFragment {
        val fragment = HomeLocationFragment()
        fragment.arguments = bundle
        return fragment
      }
    }
  }
