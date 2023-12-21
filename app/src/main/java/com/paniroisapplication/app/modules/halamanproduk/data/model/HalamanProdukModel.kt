package com.paniroisapplication.app.modules.halamanproduk.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HalamanProdukModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPcsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_pcs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPcsCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_pcs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSayurSop: String? = MyApp.getInstance().resources.getString(R.string.lbl_sayur_sop)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKategoriPake: String? = MyApp.getInstance().resources.getString(R.string.msg_kategori_pake)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRp14000Pack: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp_14_000_pack)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeskripsi: String? = MyApp.getInstance().resources.getString(R.string.lbl_deskripsi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_isi_paket_tom)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentySix: String? = MyApp.getInstance().resources.getString(R.string.lbl)

)
