package com.paniroisapplication.app.modules.logindengannohp.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginDenganNoHpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_in2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMasukkannomor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_masukkan_nomor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAndaakanmener: String? =
      MyApp.getInstance().resources.getString(R.string.msg_anda_akan_mener)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAtaumasukdeng: String? =
      MyApp.getInstance().resources.getString(R.string.msg_atau_masuk_deng)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGoogleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_google)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_sudah_punya_aku3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etInputNumberValue: String? = null
)
