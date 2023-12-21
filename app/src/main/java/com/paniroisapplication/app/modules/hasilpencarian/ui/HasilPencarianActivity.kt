package com.paniroisapplication.app.modules.hasilpencarian.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.base.BaseActivity
import com.paniroisapplication.app.databinding.ActivityHasilPencarianBinding
import com.paniroisapplication.app.modules.halamanprodukone.ui.HalamanProdukOneActivity
import com.paniroisapplication.app.modules.hasilpencarian.`data`.model.GridmediaOneRowModel
import com.paniroisapplication.app.modules.hasilpencarian.`data`.viewmodel.HasilPencarianVM
import com.paniroisapplication.app.modules.pencarian.ui.PencarianActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HasilPencarianActivity :
    BaseActivity<ActivityHasilPencarianBinding>(R.layout.activity_hasil_pencarian) {
  private val viewModel: HasilPencarianVM by viewModels<HasilPencarianVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridmediaOneAdapter =
    GridmediaOneAdapter(viewModel.gridmediaOneList.value?:mutableListOf())
    binding.recyclerGridmediaOne.adapter = gridmediaOneAdapter
    gridmediaOneAdapter.setOnItemClickListener(
    object : GridmediaOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridmediaOneRowModel) {
        onClickRecyclerGridmediaOne(view, position, item)
      }
    }
    )
    viewModel.gridmediaOneList.observe(this) {
      gridmediaOneAdapter.updateData(it)
    }
    binding.hasilPencarianVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowdown.setOnClickListener {
      val destIntent = PencarianActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerGridmediaOne(
    view: View,
    position: Int,
    item: GridmediaOneRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnmedia -> {
        val destIntent = HalamanProdukOneActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "HASIL_PENCARIAN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HasilPencarianActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
