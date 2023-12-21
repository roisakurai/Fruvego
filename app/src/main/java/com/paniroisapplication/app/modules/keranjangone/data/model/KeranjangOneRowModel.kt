package com.paniroisapplication.app.modules.keranjangone.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class KeranjangOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtJerukManis: String? = MyApp.getInstance().resources.getString(R.string.lbl_jeruk_manis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAsalCirebonSeven: String? =
      MyApp.getInstance().resources.getString(R.string.msg_asal_cirebon_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRpCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp_30_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFourteen: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFifteen: String? = MyApp.getInstance().resources.getString(R.string.lbl)

)
