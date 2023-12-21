package com.paniroisapplication.app.modules.pesananselesai.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PesananSelesaiModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPesananDikonfi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pesanan_dikonfi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pesanan_kamu_se)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProdukLainnya: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_produk_lainnya)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKategori: String? = MyApp.getInstance().resources.getString(R.string.lbl_kategori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResep: String? = MyApp.getInstance().resources.getString(R.string.lbl_resep)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBantuan: String? = MyApp.getInstance().resources.getString(R.string.lbl_bantuan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAkun: String? = MyApp.getInstance().resources.getString(R.string.lbl_akun)

)
