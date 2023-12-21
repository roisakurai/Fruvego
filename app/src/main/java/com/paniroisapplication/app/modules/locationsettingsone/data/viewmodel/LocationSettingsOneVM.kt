package com.paniroisapplication.app.modules.locationsettingsone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paniroisapplication.app.modules.locationsettingsone.`data`.model.LocationSettingsOneModel
import org.koin.core.KoinComponent

class LocationSettingsOneVM : ViewModel(), KoinComponent {
  val locationSettingsOneModel: MutableLiveData<LocationSettingsOneModel> =
      MutableLiveData(LocationSettingsOneModel())

  var navArguments: Bundle? = null
}
