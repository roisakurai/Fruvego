package com.paniroisapplication.app.modules.halamanprodukone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.base.BaseActivity
import com.paniroisapplication.app.databinding.ActivityHalamanProdukOneBinding
import com.paniroisapplication.app.modules.halamanprodukone.`data`.viewmodel.HalamanProdukOneVM
import com.paniroisapplication.app.modules.hasilpencarian.ui.HasilPencarianActivity
import com.paniroisapplication.app.modules.keranjang.ui.KeranjangActivity
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class HalamanProdukOneActivity :
    BaseActivity<ActivityHalamanProdukOneBinding>(R.layout.activity_halaman_produk_one) {
  private val viewModel: HalamanProdukOneVM by viewModels<HalamanProdukOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.halamanProdukOneVM = viewModel
    setUpSearchViewSearchListener()
  }

  override fun setUpClicks(): Unit {
    binding.btnBeliSekarang.setOnClickListener {
      val destIntent = KeranjangActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowdown.setOnClickListener {
      val destIntent = HasilPencarianActivity.getIntent(this, null)
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
      const val TAG: String = "HALAMAN_PRODUK_ONE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, HalamanProdukOneActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
