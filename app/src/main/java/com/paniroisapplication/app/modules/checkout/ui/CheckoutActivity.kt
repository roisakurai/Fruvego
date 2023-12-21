package com.paniroisapplication.app.modules.checkout.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.base.BaseActivity
import com.paniroisapplication.app.databinding.ActivityCheckoutBinding
import com.paniroisapplication.app.modules.checkout.`data`.model.CheckoutRowModel
import com.paniroisapplication.app.modules.checkout.`data`.viewmodel.CheckoutVM
import com.paniroisapplication.app.modules.keranjang.ui.KeranjangActivity
import com.paniroisapplication.app.modules.pesananselesai.ui.PesananSelesaiActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CheckoutActivity : BaseActivity<ActivityCheckoutBinding>(R.layout.activity_checkout) {
  private val viewModel: CheckoutVM by viewModels<CheckoutVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val checkoutAdapter = CheckoutAdapter(viewModel.checkoutList.value?:mutableListOf())
    binding.recyclerCheckout.adapter = checkoutAdapter
    checkoutAdapter.setOnItemClickListener(
    object : CheckoutAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CheckoutRowModel) {
        onClickRecyclerCheckout(view, position, item)
      }
    }
    )
    viewModel.checkoutList.observe(this) {
      checkoutAdapter.updateData(it)
    }
    binding.checkoutVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBayar.setOnClickListener {
      val destIntent = PesananSelesaiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowdown.setOnClickListener {
      val destIntent = KeranjangActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerCheckout(
    view: View,
    position: Int,
    item: CheckoutRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHECKOUT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CheckoutActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
