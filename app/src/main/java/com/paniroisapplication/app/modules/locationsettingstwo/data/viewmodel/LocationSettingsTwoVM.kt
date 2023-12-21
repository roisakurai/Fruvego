package com.paniroisapplication.app.modules.locationsettingstwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paniroisapplication.app.modules.locationsettingstwo.`data`.model.LocationSettingsTwoModel
import org.koin.core.KoinComponent

class LocationSettingsTwoVM : ViewModel(), KoinComponent {
  val locationSettingsTwoModel: MutableLiveData<LocationSettingsTwoModel> =
      MutableLiveData(LocationSettingsTwoModel())

  var navArguments: Bundle? = null
}
