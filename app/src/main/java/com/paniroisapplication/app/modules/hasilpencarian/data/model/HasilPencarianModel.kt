package com.paniroisapplication.app.modules.hasilpencarian.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HasilPencarianModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSearch: String? = MyApp.getInstance().resources.getString(R.string.lbl_jeruk_orange)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHABIS: String? = MyApp.getInstance().resources.getString(R.string.lbl_habis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJerukOrange: String? = MyApp.getInstance().resources.getString(R.string.lbl_jeruk_orange)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProdukSejenis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_produk_sejenis)

)
