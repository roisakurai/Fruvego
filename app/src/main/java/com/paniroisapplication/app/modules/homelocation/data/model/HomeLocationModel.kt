package com.paniroisapplication.app.modules.homelocation.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeLocationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPilihAlamatPe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pilih_alamat_pe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKategori: String? = MyApp.getInstance().resources.getString(R.string.lbl_kategori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLihatSemua: String? = MyApp.getInstance().resources.getString(R.string.lbl_lihat_semua)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSayuran: String? = MyApp.getInstance().resources.getString(R.string.lbl_sayuran)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBuah: String? = MyApp.getInstance().resources.getString(R.string.lbl_buah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBumbuDapur: String? = MyApp.getInstance().resources.getString(R.string.lbl_bumbu_dapur)
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
  var txtToko: String? = MyApp.getInstance().resources.getString(R.string.lbl_toko)

)
