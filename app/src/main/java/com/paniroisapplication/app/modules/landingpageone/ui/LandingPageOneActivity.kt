package com.paniroisapplication.app.modules.landingpageone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.base.BaseActivity
import com.paniroisapplication.app.databinding.ActivityLandingPageOneBinding
import com.paniroisapplication.app.modules.landingpageone.`data`.viewmodel.LandingPageOneVM
import com.paniroisapplication.app.modules.landingpagetwo.ui.LandingPageTwoActivity
import kotlin.String
import kotlin.Unit

class LandingPageOneActivity :
    BaseActivity<ActivityLandingPageOneBinding>(R.layout.activity_landing_page_one) {
  private val viewModel: LandingPageOneVM by viewModels<LandingPageOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.landingPageOneVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = LandingPageTwoActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.linearLandingPageOn.setOnClickListener {
        val destIntent = LandingPageTwoActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "LANDING_PAGE_ONE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, LandingPageOneActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
