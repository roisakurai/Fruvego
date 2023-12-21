package com.paniroisapplication.app.modules.checkout.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CheckoutRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRpCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp_30_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJumlahCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_jumlah_1)

)
