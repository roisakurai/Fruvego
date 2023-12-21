package com.paniroisapplication.app.modules.locationsettingstwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.base.BaseActivity
import com.paniroisapplication.app.databinding.ActivityLocationSettingsTwoBinding
import com.paniroisapplication.app.modules.homelocationtwo.ui.HomeLocationTwoActivity
import com.paniroisapplication.app.modules.locationsettingstwo.`data`.viewmodel.LocationSettingsTwoVM
import kotlin.String
import kotlin.Unit

class LocationSettingsTwoActivity :
    BaseActivity<ActivityLocationSettingsTwoBinding>(R.layout.activity_location_settings_two) {
  private val viewModel: LocationSettingsTwoVM by viewModels<LocationSettingsTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.locationSettingsTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGunakanLokasi.setOnClickListener {
      val destIntent = HomeLocationTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOCATION_SETTINGS_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LocationSettingsTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
