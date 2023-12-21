package com.paniroisapplication.app.modules.keranjang.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paniroisapplication.app.modules.keranjang.`data`.model.KeranjangModel
import com.paniroisapplication.app.modules.keranjang.`data`.model.KeranjangRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class KeranjangVM : ViewModel(), KoinComponent {
  val keranjangModel: MutableLiveData<KeranjangModel> = MutableLiveData(KeranjangModel())

  var navArguments: Bundle? = null

  val keranjangList: MutableLiveData<MutableList<KeranjangRowModel>> =
      MutableLiveData(mutableListOf())
}
