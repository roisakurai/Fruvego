package com.paniroisapplication.app.modules.kategorione.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class KategoriOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProdukLokal: String? = MyApp.getInstance().resources.getString(R.string.lbl_produk_lokal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSayurSop: String? = MyApp.getInstance().resources.getString(R.string.lbl_sayur_sop)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRp14000Pack: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp_14_000_pack)

)
