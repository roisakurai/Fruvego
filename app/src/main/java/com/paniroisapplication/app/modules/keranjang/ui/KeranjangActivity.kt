package com.paniroisapplication.app.modules.keranjang.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.base.BaseActivity
import com.paniroisapplication.app.databinding.ActivityKeranjangBinding
import com.paniroisapplication.app.modules.checkout.ui.CheckoutActivity
import com.paniroisapplication.app.modules.halamanprodukone.ui.HalamanProdukOneActivity
import com.paniroisapplication.app.modules.keranjang.`data`.model.KeranjangRowModel
import com.paniroisapplication.app.modules.keranjang.`data`.viewmodel.KeranjangVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class KeranjangActivity : BaseActivity<ActivityKeranjangBinding>(R.layout.activity_keranjang) {
  private val viewModel: KeranjangVM by viewModels<KeranjangVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val keranjangAdapter = KeranjangAdapter(viewModel.keranjangList.value?:mutableListOf())
    binding.recyclerKeranjang.adapter = keranjangAdapter
    keranjangAdapter.setOnItemClickListener(
    object : KeranjangAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : KeranjangRowModel) {
        onClickRecyclerKeranjang(view, position, item)
      }
    }
    )
    viewModel.keranjangList.observe(this) {
      keranjangAdapter.updateData(it)
    }
    binding.keranjangVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCheckout.setOnClickListener {
      val destIntent = CheckoutActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowdown.setOnClickListener {
      val destIntent = HalamanProdukOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerKeranjang(
    view: View,
    position: Int,
    item: KeranjangRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "KERANJANG_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, KeranjangActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
