package com.paniroisapplication.app.modules.halamanprodukone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paniroisapplication.app.modules.halamanprodukone.`data`.model.HalamanProdukOneModel
import org.koin.core.KoinComponent

class HalamanProdukOneVM : ViewModel(), KoinComponent {
  val halamanProdukOneModel: MutableLiveData<HalamanProdukOneModel> =
      MutableLiveData(HalamanProdukOneModel())

  var navArguments: Bundle? = null
}
