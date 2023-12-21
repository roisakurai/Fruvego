package com.paniroisapplication.app.modules.pencarian.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PencarianModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSearch: String? = MyApp.getInstance().resources.getString(R.string.lbl_cari_di_fruvego)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPencarianTerak: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pencarian_terak)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPencarianPopul: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pencarian_popul)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup36703: String? = MyApp.getInstance().resources.getString(R.string.lbl_pisang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup36704: String? = MyApp.getInstance().resources.getString(R.string.lbl_apel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup36705: String? = MyApp.getInstance().resources.getString(R.string.lbl_semangka)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRekomendasiPil: String? =
      MyApp.getInstance().resources.getString(R.string.msg_rekomendasi_pil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSeventySevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSeventyNineValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupEightyOneValue: String? = null
)
