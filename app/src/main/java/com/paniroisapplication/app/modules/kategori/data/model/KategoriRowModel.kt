package com.paniroisapplication.app.modules.kategori.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class KategoriRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSayuran: String? = MyApp.getInstance().resources.getString(R.string.lbl_sayuran)

)
