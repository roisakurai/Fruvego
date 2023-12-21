package com.paniroisapplication.app.modules.detailresep.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paniroisapplication.app.modules.detailresep.`data`.model.DetailResepModel
import com.paniroisapplication.app.modules.detailresep.`data`.model.DetailResepRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DetailResepVM : ViewModel(), KoinComponent {
  val detailResepModel: MutableLiveData<DetailResepModel> = MutableLiveData(DetailResepModel())

  var navArguments: Bundle? = null

  val detailResepList: MutableLiveData<MutableList<DetailResepRowModel>> =
      MutableLiveData(mutableListOf())
}
