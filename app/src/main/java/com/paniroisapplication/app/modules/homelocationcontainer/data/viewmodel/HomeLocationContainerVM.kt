package com.paniroisapplication.app.modules.homelocationcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paniroisapplication.app.modules.homelocationcontainer.`data`.model.HomeLocationContainerModel
import org.koin.core.KoinComponent

class HomeLocationContainerVM : ViewModel(), KoinComponent {
  val homeLocationContainerModel: MutableLiveData<HomeLocationContainerModel> =
      MutableLiveData(HomeLocationContainerModel())

  var navArguments: Bundle? = null
}
