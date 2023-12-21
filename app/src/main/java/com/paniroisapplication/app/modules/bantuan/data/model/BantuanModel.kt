package com.paniroisapplication.app.modules.bantuan.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BantuanModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBantuan: String? = MyApp.getInstance().resources.getString(R.string.lbl_bantuan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatsAppCustom: String? =
      MyApp.getInstance().resources.getString(R.string.msg_whatsapp_custom)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt082261806805: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_0822_6180_6805)

)
