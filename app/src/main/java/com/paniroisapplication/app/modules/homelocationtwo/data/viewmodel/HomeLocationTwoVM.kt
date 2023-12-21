package com.paniroisapplication.app.modules.homelocationtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paniroisapplication.app.modules.homelocationtwo.`data`.model.GridjeruklolRowModel
import com.paniroisapplication.app.modules.homelocationtwo.`data`.model.HomeLocationTwoModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeLocationTwoVM : ViewModel(), KoinComponent {
  val homeLocationTwoModel: MutableLiveData<HomeLocationTwoModel> =
      MutableLiveData(HomeLocationTwoModel())

  var navArguments: Bundle? = null

  val gridjeruklolList: MutableLiveData<MutableList<GridjeruklolRowModel>> =
      MutableLiveData(mutableListOf())
}
