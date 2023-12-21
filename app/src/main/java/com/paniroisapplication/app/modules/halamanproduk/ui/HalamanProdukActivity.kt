package com.paniroisapplication.app.modules.halamanproduk.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.base.BaseActivity
import com.paniroisapplication.app.databinding.ActivityHalamanProdukBinding
import com.paniroisapplication.app.modules.halamanproduk.`data`.model.ImageSliderSlidermediaModel
import com.paniroisapplication.app.modules.halamanproduk.`data`.model.SpinnerGroup36822Model
import com.paniroisapplication.app.modules.halamanproduk.`data`.model.SpinnerGroup36823Model
import com.paniroisapplication.app.modules.halamanproduk.`data`.model.SpinnerGroup36824Model
import com.paniroisapplication.app.modules.halamanproduk.`data`.model.SpinnerGroup36825Model
import com.paniroisapplication.app.modules.halamanproduk.`data`.viewmodel.HalamanProdukVM
import com.paniroisapplication.app.modules.hasilpencarian.ui.HasilPencarianActivity
import com.paniroisapplication.app.modules.keranjang.ui.KeranjangActivity
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class HalamanProdukActivity :
    BaseActivity<ActivityHalamanProdukBinding>(R.layout.activity_halaman_produk) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.paniroisapplication.app/drawable/img_media_9")


  private val imageSliderSlidermediaItems: ArrayList<ImageSliderSlidermediaModel> =
      arrayListOf(ImageSliderSlidermediaModel(imageMedia =
  imageUri.toString()),ImageSliderSlidermediaModel(imageMedia = imageUri.toString()))


  private val viewModel: HalamanProdukVM by viewModels<HalamanProdukVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroup36822List.value = mutableListOf(
    SpinnerGroup36822Model("Item1"),
    SpinnerGroup36822Model("Item2"),
    SpinnerGroup36822Model("Item3"),
    SpinnerGroup36822Model("Item4"),
    SpinnerGroup36822Model("Item5")
    )
    val spinnerGroup36822Adapter =
    SpinnerGroup36822Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup36822List.value?:
    mutableListOf())
    binding.spinnerGroup36822.adapter = spinnerGroup36822Adapter
    viewModel.spinnerGroup36823List.value = mutableListOf(
    SpinnerGroup36823Model("Item1"),
    SpinnerGroup36823Model("Item2"),
    SpinnerGroup36823Model("Item3"),
    SpinnerGroup36823Model("Item4"),
    SpinnerGroup36823Model("Item5")
    )
    val spinnerGroup36823Adapter =
    SpinnerGroup36823Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup36823List.value?:
    mutableListOf())
    binding.spinnerGroup36823.adapter = spinnerGroup36823Adapter
    viewModel.spinnerGroup36824List.value = mutableListOf(
    SpinnerGroup36824Model("Item1"),
    SpinnerGroup36824Model("Item2"),
    SpinnerGroup36824Model("Item3"),
    SpinnerGroup36824Model("Item4"),
    SpinnerGroup36824Model("Item5")
    )
    val spinnerGroup36824Adapter =
    SpinnerGroup36824Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup36824List.value?:
    mutableListOf())
    binding.spinnerGroup36824.adapter = spinnerGroup36824Adapter
    viewModel.spinnerGroup36825List.value = mutableListOf(
    SpinnerGroup36825Model("Item1"),
    SpinnerGroup36825Model("Item2"),
    SpinnerGroup36825Model("Item3"),
    SpinnerGroup36825Model("Item4"),
    SpinnerGroup36825Model("Item5")
    )
    val spinnerGroup36825Adapter =
    SpinnerGroup36825Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup36825List.value?:
    mutableListOf())
    binding.spinnerGroup36825.adapter = spinnerGroup36825Adapter
    val slidermediaAdapter = SlidermediaAdapter(imageSliderSlidermediaItems,true)
    binding.imageSliderSlidermedia.adapter = slidermediaAdapter
    binding.imageSliderSlidermedia.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorUser.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorUser.updateIndicatorCounts(binding.imageSliderSlidermedia.indicatorCount)
    binding.halamanProdukVM = viewModel
    setUpSearchViewSearchListener()
  }

  override fun onPause(): Unit {
    binding.imageSliderSlidermedia.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSlidermedia.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowdown.setOnClickListener {
      val destIntent = HasilPencarianActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnBeliSekarang.setOnClickListener {
      val destIntent = KeranjangActivity.getIntent(this, null)
      startActivity(destIntent)
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
      const val TAG: String = "HALAMAN_PRODUK_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, HalamanProdukActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
