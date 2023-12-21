package com.paniroisapplication.app.modules.keranjang.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class KeranjangModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKeranjangBelan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_keranjang_belan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPilihSemua: String? = MyApp.getInstance().resources.getString(R.string.lbl_pilih_semua)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalRpNinetyFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_total_rp_95)

)
