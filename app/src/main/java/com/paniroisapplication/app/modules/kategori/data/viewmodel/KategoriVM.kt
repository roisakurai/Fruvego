package com.paniroisapplication.app.modules.kategori.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paniroisapplication.app.modules.kategori.`data`.model.KategoriModel
import com.paniroisapplication.app.modules.kategori.`data`.model.KategoriRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class KategoriVM : ViewModel(), KoinComponent {
  val kategoriModel: MutableLiveData<KategoriModel> = MutableLiveData(KategoriModel())

  var navArguments: Bundle? = null

  val kategoriList: MutableLiveData<MutableList<KategoriRowModel>> =
      MutableLiveData(mutableListOf())
}
