package com.paniroisapplication.app.modules.pencarian.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PencarianRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup36707: String? = MyApp.getInstance().resources.getString(R.string.lbl_pepaya)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup36708: String? = MyApp.getInstance().resources.getString(R.string.lbl_tomat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup36709: String? = MyApp.getInstance().resources.getString(R.string.lbl_bayam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup36710: String? = MyApp.getInstance().resources.getString(R.string.lbl_wortel)

)
