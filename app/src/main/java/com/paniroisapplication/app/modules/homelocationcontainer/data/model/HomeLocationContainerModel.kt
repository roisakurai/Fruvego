package com.paniroisapplication.app.modules.homelocationcontainer.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeLocationContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKategoriOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_kategori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResep: String? = MyApp.getInstance().resources.getString(R.string.lbl_resep)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBantuan: String? = MyApp.getInstance().resources.getString(R.string.lbl_bantuan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAkun: String? = MyApp.getInstance().resources.getString(R.string.lbl_akun)

)
