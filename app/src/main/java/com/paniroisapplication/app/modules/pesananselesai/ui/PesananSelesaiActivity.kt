package com.paniroisapplication.app.modules.pesananselesai.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.base.BaseActivity
import com.paniroisapplication.app.databinding.ActivityPesananSelesaiBinding
import com.paniroisapplication.app.modules.pesananselesai.`data`.model.GridmediaRowModel
import com.paniroisapplication.app.modules.pesananselesai.`data`.viewmodel.PesananSelesaiVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PesananSelesaiActivity :
    BaseActivity<ActivityPesananSelesaiBinding>(R.layout.activity_pesanan_selesai) {
  private val viewModel: PesananSelesaiVM by viewModels<PesananSelesaiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridmediaAdapter = GridmediaAdapter(viewModel.gridmediaList.value?:mutableListOf())
    binding.recyclerGridmedia.adapter = gridmediaAdapter
    gridmediaAdapter.setOnItemClickListener(
    object : GridmediaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridmediaRowModel) {
        onClickRecyclerGridmedia(view, position, item)
      }
    }
    )
    viewModel.gridmediaList.observe(this) {
      gridmediaAdapter.updateData(it)
    }
    binding.pesananSelesaiVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridmedia(
    view: View,
    position: Int,
    item: GridmediaRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PESANAN_SELESAI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PesananSelesaiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
