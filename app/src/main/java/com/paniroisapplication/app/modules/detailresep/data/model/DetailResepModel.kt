package com.paniroisapplication.app.modules.detailresep.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DetailResepModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDetailResep: String? = MyApp.getInstance().resources.getString(R.string.lbl_detail_resep)
  ,
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBahanMasak: String? = MyApp.getInstance().resources.getString(R.string.lbl_bahan_masak)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBahanSelemMar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bahan_selem_mar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_2_sendok_makan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBahanSteak: String? = MyApp.getInstance().resources.getString(R.string.lbl_bahan_steak)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeight: String? = MyApp.getInstance().resources.getString(R.string.msg_200_250_gram_ri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLihatselengkap: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lihat_selengkap)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRekomendasiBah: String? =
      MyApp.getInstance().resources.getString(R.string.msg_rekomendasi_bah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalBelanjaThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_total_belanja_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRpCounterThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp_52_000)
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
