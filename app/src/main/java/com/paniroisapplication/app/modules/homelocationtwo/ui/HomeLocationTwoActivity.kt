package com.paniroisapplication.app.modules.homelocationtwo.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.base.BaseActivity
import com.paniroisapplication.app.databinding.ActivityHomeLocationTwoBinding
import com.paniroisapplication.app.modules.homelocationtwo.`data`.model.GridjeruklolRowModel
import com.paniroisapplication.app.modules.homelocationtwo.`data`.model.ImageSliderSliderrectangle189Model
import com.paniroisapplication.app.modules.homelocationtwo.`data`.viewmodel.HomeLocationTwoVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class HomeLocationTwoActivity :
    BaseActivity<ActivityHomeLocationTwoBinding>(R.layout.activity_home_location_two) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.paniroisapplication.app/drawable/img_rectangle189")


  private val imageSliderSliderrectangle189Items: ArrayList<ImageSliderSliderrectangle189Model> =
      arrayListOf(ImageSliderSliderrectangle189Model(imageRectangle189 =
  imageUri.toString()),ImageSliderSliderrectangle189Model(imageRectangle189 =
  imageUri.toString()))


  private val viewModel: HomeLocationTwoVM by viewModels<HomeLocationTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderrectangle189Adapter =
    Sliderrectangle189Adapter(imageSliderSliderrectangle189Items,true)
    binding.imageSliderSliderrectangle189.adapter = sliderrectangle189Adapter
    binding.imageSliderSliderrectangle189.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorGroup36690.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroup36690.updateIndicatorCounts(binding.imageSliderSliderrectangle189.indicatorCount)
    val gridjeruklolAdapter =
    GridjeruklolAdapter(viewModel.gridjeruklolList.value?:mutableListOf())
    binding.recyclerGridjeruklol.adapter = gridjeruklolAdapter
    gridjeruklolAdapter.setOnItemClickListener(
    object : GridjeruklolAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridjeruklolRowModel) {
        onClickRecyclerGridjeruklol(view, position, item)
      }
    }
    )
    viewModel.gridjeruklolList.observe(this) {
      gridjeruklolAdapter.updateData(it)
    }
    binding.homeLocationTwoVM = viewModel
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

  fun onClickRecyclerGridjeruklol(
    view: View,
    position: Int,
    item: GridjeruklolRowModel
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
      const val TAG: String = "HOME_LOCATION_TWO_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, HomeLocationTwoActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
