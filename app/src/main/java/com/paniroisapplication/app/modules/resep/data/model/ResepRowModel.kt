package com.paniroisapplication.app.modules.resep.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ResepRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtResepBalinese: String? =
      MyApp.getInstance().resources.getString(R.string.msg_resep_balinese)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOlehFruvego: String? = MyApp.getInstance().resources.getString(R.string.lbl_oleh_fruvego)

)
