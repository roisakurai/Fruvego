package com.paniroisapplication.app.modules.kategori.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.base.BaseActivity
import com.paniroisapplication.app.databinding.ActivityKategoriBinding
import com.paniroisapplication.app.modules.kategori.`data`.model.KategoriRowModel
import com.paniroisapplication.app.modules.kategori.`data`.viewmodel.KategoriVM
import com.paniroisapplication.app.modules.pencarian.ui.PencarianActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class KategoriActivity : BaseActivity<ActivityKategoriBinding>(R.layout.activity_kategori) {
  private val viewModel: KategoriVM by viewModels<KategoriVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val kategoriAdapter = KategoriAdapter(viewModel.kategoriList.value?:mutableListOf())
    binding.recyclerKategori.adapter = kategoriAdapter
    kategoriAdapter.setOnItemClickListener(
    object : KategoriAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : KategoriRowModel) {
        onClickRecyclerKategori(view, position, item)
      }
    }
    )
    viewModel.kategoriList.observe(this) {
      kategoriAdapter.updateData(it)
    }
    binding.kategoriVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageSearchOne.setOnClickListener {
      val destIntent = PencarianActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerKategori(
    view: View,
    position: Int,
    item: KategoriRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "KATEGORI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, KategoriActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
