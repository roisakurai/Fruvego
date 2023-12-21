package com.paniroisapplication.app.modules.kategorione.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class KategoriOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSearch: String? = MyApp.getInstance().resources.getString(R.string.lbl_cari_di_fruvego)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLokasiTerdekat: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_lokasi_terdekat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBerdasarkanTok: String? =
      MyApp.getInstance().resources.getString(R.string.msg_berdasarkan_tok)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProdukPaketan: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_produk_paketan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPromoDiskon: String? = MyApp.getInstance().resources.getString(R.string.lbl_promo_diskon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBeliLagi: String? = MyApp.getInstance().resources.getString(R.string.lbl_beli_lagi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPenjualanTerba: String? =
      MyApp.getInstance().resources.getString(R.string.msg_penjualan_terba)

)
