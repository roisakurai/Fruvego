package com.paniroisapplication.app.modules.keranjangone.ui

import android.view.View
import androidx.activity.viewModels
import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.base.BaseActivity
import com.paniroisapplication.app.databinding.ActivityKeranjangOneBinding
import com.paniroisapplication.app.modules.checkout.ui.CheckoutActivity
import com.paniroisapplication.app.modules.homelocationcontainer.ui.HomeLocationContainerActivity
import com.paniroisapplication.app.modules.keranjangone.`data`.model.KeranjangOneRowModel
import com.paniroisapplication.app.modules.keranjangone.`data`.viewmodel.KeranjangOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class KeranjangOneActivity :
    BaseActivity<ActivityKeranjangOneBinding>(R.layout.activity_keranjang_one) {
  private val viewModel: KeranjangOneVM by viewModels<KeranjangOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val keranjangOneAdapter =
    KeranjangOneAdapter(viewModel.keranjangOneList.value?:mutableListOf())
    binding.recyclerKeranjangOne.adapter = keranjangOneAdapter
    keranjangOneAdapter.setOnItemClickListener(
    object : KeranjangOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : KeranjangOneRowModel) {
        onClickRecyclerKeranjangOne(view, position, item)
      }
    }
    )
    viewModel.keranjangOneList.observe(this) {
      keranjangOneAdapter.updateData(it)
    }
    binding.keranjangOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowdown.setOnClickListener {
      val destIntent = HomeLocationContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnCheckout.setOnClickListener {
      val destIntent = CheckoutActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerKeranjangOne(
    view: View,
    position: Int,
    item: KeranjangOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "KERANJANG_ONE_ACTIVITY"

  }
}
