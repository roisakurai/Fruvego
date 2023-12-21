package com.paniroisapplication.app.modules.landingpagetwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paniroisapplication.app.modules.landingpagetwo.`data`.model.LandingPageTwoModel
import org.koin.core.KoinComponent

class LandingPageTwoVM : ViewModel(), KoinComponent {
  val landingPageTwoModel: MutableLiveData<LandingPageTwoModel> =
      MutableLiveData(LandingPageTwoModel())

  var navArguments: Bundle? = null
}
