package com.paniroisapplication.app.modules.pencarian.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Pencarian1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtJeruk: String? = MyApp.getInstance().resources.getString(R.string.lbl_jeruk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRpCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp_15_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt500terjual: String? = MyApp.getInstance().resources.getString(R.string.lbl_500_terjual)

)
