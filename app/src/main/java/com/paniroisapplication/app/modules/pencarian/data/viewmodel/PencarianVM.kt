package com.paniroisapplication.app.modules.pencarian.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paniroisapplication.app.modules.pencarian.`data`.model.Pencarian1RowModel
import com.paniroisapplication.app.modules.pencarian.`data`.model.PencarianModel
import com.paniroisapplication.app.modules.pencarian.`data`.model.PencarianRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PencarianVM : ViewModel(), KoinComponent {
  val pencarianModel: MutableLiveData<PencarianModel> = MutableLiveData(PencarianModel())

  var navArguments: Bundle? = null

  val pencarianList: MutableLiveData<MutableList<PencarianRowModel>> =
      MutableLiveData(mutableListOf())

  val pencarian1List: MutableLiveData<MutableList<Pencarian1RowModel>> =
      MutableLiveData(mutableListOf())
}
