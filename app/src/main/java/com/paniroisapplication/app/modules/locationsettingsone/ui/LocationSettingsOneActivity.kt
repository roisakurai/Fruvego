package com.paniroisapplication.app.modules.locationsettingsone.ui

import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.base.BaseActivity
import com.paniroisapplication.app.databinding.ActivityLocationSettingsOneBinding
import com.paniroisapplication.app.modules.homelocationcontainer.ui.HomeLocationContainerActivity
import com.paniroisapplication.app.modules.locationsettingsone.`data`.viewmodel.LocationSettingsOneVM
import com.paniroisapplication.app.modules.locationsettingstwo.ui.LocationSettingsTwoActivity
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class LocationSettingsOneActivity :
    BaseActivity<ActivityLocationSettingsOneBinding>(R.layout.activity_location_settings_one) {
  private val viewModel: LocationSettingsOneVM by viewModels<LocationSettingsOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.locationSettingsOneVM = viewModel
    setUpSearchViewSearchListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowdown.setOnClickListener {
      val destIntent = HomeLocationContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowmylocation.setOnClickListener {
      val destIntent = LocationSettingsTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  private fun setUpSearchViewSearchListener(): Unit {
    binding.searchViewSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "LOCATION_SETTINGS_ONE_ACTIVITY"

    }
  }
