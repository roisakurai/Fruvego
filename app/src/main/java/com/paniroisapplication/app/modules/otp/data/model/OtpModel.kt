package com.paniroisapplication.app.modules.otp.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OtpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVerifikasiakun: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_verifikasi_akun)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMasukkanpinFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_masukkan_pin_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBelummenerima: String? =
      MyApp.getInstance().resources.getString(R.string.msg_belum_menerima)

)
