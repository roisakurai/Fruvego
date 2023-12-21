package com.paniroisapplication.app.modules.halamanproduk.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paniroisapplication.app.modules.halamanproduk.`data`.model.HalamanProdukModel
import com.paniroisapplication.app.modules.halamanproduk.`data`.model.SpinnerGroup36822Model
import com.paniroisapplication.app.modules.halamanproduk.`data`.model.SpinnerGroup36823Model
import com.paniroisapplication.app.modules.halamanproduk.`data`.model.SpinnerGroup36824Model
import com.paniroisapplication.app.modules.halamanproduk.`data`.model.SpinnerGroup36825Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HalamanProdukVM : ViewModel(), KoinComponent {
  val halamanProdukModel: MutableLiveData<HalamanProdukModel> =
      MutableLiveData(HalamanProdukModel())

  var navArguments: Bundle? = null

  val spinnerGroup36822List: MutableLiveData<MutableList<SpinnerGroup36822Model>> =
      MutableLiveData()

  val spinnerGroup36823List: MutableLiveData<MutableList<SpinnerGroup36823Model>> =
      MutableLiveData()

  val spinnerGroup36824List: MutableLiveData<MutableList<SpinnerGroup36824Model>> =
      MutableLiveData()

  val spinnerGroup36825List: MutableLiveData<MutableList<SpinnerGroup36825Model>> =
      MutableLiveData()
}
