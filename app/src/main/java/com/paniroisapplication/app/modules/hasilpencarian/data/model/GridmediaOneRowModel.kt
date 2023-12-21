package com.paniroisapplication.app.modules.hasilpencarian.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GridmediaOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtJerukPurut: String? = MyApp.getInstance().resources.getString(R.string.lbl_jeruk_purut)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeightOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRpCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp_9_400)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1kterjual: String? = MyApp.getInstance().resources.getString(R.string.lbl_1k_terjual)

)
