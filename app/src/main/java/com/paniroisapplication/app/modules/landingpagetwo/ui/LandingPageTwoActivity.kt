package com.paniroisapplication.app.modules.landingpagetwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.base.BaseActivity
import com.paniroisapplication.app.databinding.ActivityLandingPageTwoBinding
import com.paniroisapplication.app.modules.landingpageone.ui.LandingPageOneActivity
import com.paniroisapplication.app.modules.landingpagetwo.`data`.viewmodel.LandingPageTwoVM
import com.paniroisapplication.app.modules.registerone.ui.RegisterOneActivity
import kotlin.String
import kotlin.Unit

class LandingPageTwoActivity :
    BaseActivity<ActivityLandingPageTwoBinding>(R.layout.activity_landing_page_two) {
  private val viewModel: LandingPageTwoVM by viewModels<LandingPageTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.landingPageTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnDaftar.setOnClickListener {
      val destIntent = RegisterOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLandingPageTw.setOnClickListener {
      val destIntent = LandingPageOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LANDING_PAGE_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LandingPageTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
