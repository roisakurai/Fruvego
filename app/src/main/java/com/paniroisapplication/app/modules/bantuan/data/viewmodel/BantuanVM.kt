package com.paniroisapplication.app.modules.bantuan.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paniroisapplication.app.modules.bantuan.`data`.model.BantuanModel
import com.paniroisapplication.app.modules.bantuan.`data`.model.SpinnerGroup36813FourModel
import com.paniroisapplication.app.modules.bantuan.`data`.model.SpinnerGroup36813Model
import com.paniroisapplication.app.modules.bantuan.`data`.model.SpinnerGroup36813OneModel
import com.paniroisapplication.app.modules.bantuan.`data`.model.SpinnerGroup36813ThreeModel
import com.paniroisapplication.app.modules.bantuan.`data`.model.SpinnerGroup36813TwoModel
import com.paniroisapplication.app.modules.bantuan.`data`.model.SpinnerGroup36814Model
import com.paniroisapplication.app.modules.bantuan.`data`.model.SpinnerGroup36816Model
import com.paniroisapplication.app.modules.bantuan.`data`.model.SpinnerGroup36821Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BantuanVM : ViewModel(), KoinComponent {
  val bantuanModel: MutableLiveData<BantuanModel> = MutableLiveData(BantuanModel())

  var navArguments: Bundle? = null

  val spinnerGroup36814List: MutableLiveData<MutableList<SpinnerGroup36814Model>> =
      MutableLiveData()

  val spinnerGroup36813List: MutableLiveData<MutableList<SpinnerGroup36813Model>> =
      MutableLiveData()

  val spinnerGroup36816List: MutableLiveData<MutableList<SpinnerGroup36816Model>> =
      MutableLiveData()

  val spinnerGroup36813OneList: MutableLiveData<MutableList<SpinnerGroup36813OneModel>> =
      MutableLiveData()

  val spinnerGroup36813TwoList: MutableLiveData<MutableList<SpinnerGroup36813TwoModel>> =
      MutableLiveData()

  val spinnerGroup36813ThreeList: MutableLiveData<MutableList<SpinnerGroup36813ThreeModel>> =
      MutableLiveData()

  val spinnerGroup36813FourList: MutableLiveData<MutableList<SpinnerGroup36813FourModel>> =
      MutableLiveData()

  val spinnerGroup36821List: MutableLiveData<MutableList<SpinnerGroup36821Model>> =
      MutableLiveData()
}
