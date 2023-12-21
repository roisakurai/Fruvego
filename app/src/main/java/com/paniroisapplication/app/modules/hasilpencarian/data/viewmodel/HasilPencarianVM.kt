package com.paniroisapplication.app.modules.hasilpencarian.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paniroisapplication.app.modules.hasilpencarian.`data`.model.GridmediaOneRowModel
import com.paniroisapplication.app.modules.hasilpencarian.`data`.model.HasilPencarianModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HasilPencarianVM : ViewModel(), KoinComponent {
  val hasilPencarianModel: MutableLiveData<HasilPencarianModel> =
      MutableLiveData(HasilPencarianModel())

  var navArguments: Bundle? = null

  val gridmediaOneList: MutableLiveData<MutableList<GridmediaOneRowModel>> =
      MutableLiveData(mutableListOf())
}
