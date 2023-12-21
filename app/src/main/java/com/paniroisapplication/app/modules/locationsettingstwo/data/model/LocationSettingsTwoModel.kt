package com.paniroisapplication.app.modules.locationsettingstwo.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LocationSettingsTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKemiriMuka: String? = MyApp.getInstance().resources.getString(R.string.lbl_kemiri_muka)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_jl_margonda_k)

)
