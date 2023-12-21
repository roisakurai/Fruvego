package com.paniroisapplication.app.modules.pesananselesai.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paniroisapplication.app.modules.pesananselesai.`data`.model.GridmediaRowModel
import com.paniroisapplication.app.modules.pesananselesai.`data`.model.PesananSelesaiModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PesananSelesaiVM : ViewModel(), KoinComponent {
  val pesananSelesaiModel: MutableLiveData<PesananSelesaiModel> =
      MutableLiveData(PesananSelesaiModel())

  var navArguments: Bundle? = null

  val gridmediaList: MutableLiveData<MutableList<GridmediaRowModel>> =
      MutableLiveData(mutableListOf())
}
