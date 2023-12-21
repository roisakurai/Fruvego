package com.paniroisapplication.app.modules.kategorione.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paniroisapplication.app.modules.kategorione.`data`.model.KategoriOneModel
import com.paniroisapplication.app.modules.kategorione.`data`.model.KategoriOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class KategoriOneVM : ViewModel(), KoinComponent {
  val kategoriOneModel: MutableLiveData<KategoriOneModel> = MutableLiveData(KategoriOneModel())

  var navArguments: Bundle? = null

  val kategoriOneList: MutableLiveData<MutableList<KategoriOneRowModel>> =
      MutableLiveData(mutableListOf())
}
