package com.paniroisapplication.app.modules.detailresep.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.base.BaseActivity
import com.paniroisapplication.app.databinding.ActivityDetailResepBinding
import com.paniroisapplication.app.modules.detailresep.`data`.model.DetailResepRowModel
import com.paniroisapplication.app.modules.detailresep.`data`.viewmodel.DetailResepVM
import com.paniroisapplication.app.modules.homelocationcontainer.ui.HomeLocationContainerActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DetailResepActivity : BaseActivity<ActivityDetailResepBinding>(R.layout.activity_detail_resep)
    {
  private val viewModel: DetailResepVM by viewModels<DetailResepVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val detailResepAdapter =
    DetailResepAdapter(viewModel.detailResepList.value?:mutableListOf())
    binding.recyclerDetailResep.adapter = detailResepAdapter
    detailResepAdapter.setOnItemClickListener(
    object : DetailResepAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DetailResepRowModel) {
        onClickRecyclerDetailResep(view, position, item)
      }
    }
    )
    viewModel.detailResepList.observe(this) {
      detailResepAdapter.updateData(it)
    }
    binding.detailResepVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowdown.setOnClickListener {
      val destIntent = HomeLocationContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerDetailResep(
    view: View,
    position: Int,
    item: DetailResepRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DETAIL_RESEP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailResepActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
