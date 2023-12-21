package com.paniroisapplication.app.modules.keranjangone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paniroisapplication.app.modules.keranjangone.`data`.model.KeranjangOneModel
import com.paniroisapplication.app.modules.keranjangone.`data`.model.KeranjangOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class KeranjangOneVM : ViewModel(), KoinComponent {
  val keranjangOneModel: MutableLiveData<KeranjangOneModel> = MutableLiveData(KeranjangOneModel())

  var navArguments: Bundle? = null

  val keranjangOneList: MutableLiveData<MutableList<KeranjangOneRowModel>> =
      MutableLiveData(mutableListOf())
}
