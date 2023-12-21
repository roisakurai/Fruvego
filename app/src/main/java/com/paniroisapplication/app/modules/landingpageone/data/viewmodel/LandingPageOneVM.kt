package com.paniroisapplication.app.modules.landingpageone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paniroisapplication.app.modules.landingpageone.`data`.model.LandingPageOneModel
import org.koin.core.KoinComponent

class LandingPageOneVM : ViewModel(), KoinComponent {
  val landingPageOneModel: MutableLiveData<LandingPageOneModel> =
      MutableLiveData(LandingPageOneModel())

  var navArguments: Bundle? = null
}
