package com.paniroisapplication.app.modules.pencarian.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.base.BaseActivity
import com.paniroisapplication.app.databinding.ActivityPencarianBinding
import com.paniroisapplication.app.modules.hasilpencarian.ui.HasilPencarianActivity
import com.paniroisapplication.app.modules.kategori.ui.KategoriActivity
import com.paniroisapplication.app.modules.pencarian.`data`.model.Pencarian1RowModel
import com.paniroisapplication.app.modules.pencarian.`data`.model.PencarianRowModel
import com.paniroisapplication.app.modules.pencarian.`data`.viewmodel.PencarianVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PencarianActivity : BaseActivity<ActivityPencarianBinding>(R.layout.activity_pencarian) {
  private val viewModel: PencarianVM by viewModels<PencarianVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val pencarianAdapter = PencarianAdapter(viewModel.pencarianList.value?:mutableListOf())
    binding.recyclerPencarian.adapter = pencarianAdapter
    pencarianAdapter.setOnItemClickListener(
    object : PencarianAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PencarianRowModel) {
        onClickRecyclerPencarian(view, position, item)
      }
    }
    )
    viewModel.pencarianList.observe(this) {
      pencarianAdapter.updateData(it)
    }
    val pencarian1Adapter = Pencarian1Adapter(viewModel.pencarian1List.value?:mutableListOf())
    binding.recyclerPencarian1.adapter = pencarian1Adapter
    pencarian1Adapter.setOnItemClickListener(
    object : Pencarian1Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Pencarian1RowModel) {
        onClickRecyclerPencarian1(view, position, item)
      }
    }
    )
    viewModel.pencarian1List.observe(this) {
      pencarian1Adapter.updateData(it)
    }
    binding.pencarianVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowdown.setOnClickListener {
      val destIntent = KategoriActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageSearchOne.setOnClickListener {
      val destIntent = HasilPencarianActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerPencarian(
    view: View,
    position: Int,
    item: PencarianRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerPencarian1(
    view: View,
    position: Int,
    item: Pencarian1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PENCARIAN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PencarianActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
