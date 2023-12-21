package com.paniroisapplication.app.modules.resep.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paniroisapplication.app.modules.resep.`data`.model.ResepModel
import com.paniroisapplication.app.modules.resep.`data`.model.ResepRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ResepVM : ViewModel(), KoinComponent {
  val resepModel: MutableLiveData<ResepModel> = MutableLiveData(ResepModel())

  var navArguments: Bundle? = null

  val resepList: MutableLiveData<MutableList<ResepRowModel>> = MutableLiveData(mutableListOf())
}
