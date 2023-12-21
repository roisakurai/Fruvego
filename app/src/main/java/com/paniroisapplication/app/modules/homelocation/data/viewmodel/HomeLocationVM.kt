package com.paniroisapplication.app.modules.homelocation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paniroisapplication.app.modules.homelocation.`data`.model.HomeLocationModel
import com.paniroisapplication.app.modules.homelocation.`data`.model.HomeLocationRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeLocationVM : ViewModel(), KoinComponent {
  val homeLocationModel: MutableLiveData<HomeLocationModel> = MutableLiveData(HomeLocationModel())

  var navArguments: Bundle? = null

  val homeLocationList: MutableLiveData<MutableList<HomeLocationRowModel>> =
      MutableLiveData(mutableListOf())
}
