package com.paniroisapplication.app.modules.landingpagetwo.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LandingPageTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSegarcepat: String? = MyApp.getInstance().resources.getString(R.string.lbl_segar_cepat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_produk_segar_ya)

)
