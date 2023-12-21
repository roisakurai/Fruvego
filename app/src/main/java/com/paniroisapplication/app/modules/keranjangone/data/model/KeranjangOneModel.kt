package com.paniroisapplication.app.modules.keranjangone.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class KeranjangOneModel(
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
  var txtCengkeh: String? = MyApp.getInstance().resources.getString(R.string.lbl_cengkeh2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeightOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_gram_pack)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRpCounterFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp_6_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalRp152: String? = MyApp.getInstance().resources.getString(R.string.msg_total_rp_152)

)
