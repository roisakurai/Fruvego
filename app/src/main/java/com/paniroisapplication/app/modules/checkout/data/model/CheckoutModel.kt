package com.paniroisapplication.app.modules.checkout.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CheckoutModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckout: String? = MyApp.getInstance().resources.getString(R.string.lbl_checkout)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlamatPengirim: String? =
      MyApp.getInstance().resources.getString(R.string.msg_alamat_pengirim)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGantiAlamat: String? = MyApp.getInstance().resources.getString(R.string.lbl_ganti_alamat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKemiriMuka: String? = MyApp.getInstance().resources.getString(R.string.lbl_kemiri_muka)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_jl_margonda_k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPilihWaktuPen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pilih_waktu_pen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBesok4Desem: String? = MyApp.getInstance().resources.getString(R.string.msg_besok_4_desem)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEstimasiWaktu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_estimasi_waktu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRincianPesanan: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_rincian_pesanan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLihatSemua: String? = MyApp.getInstance().resources.getString(R.string.lbl_lihat_semua)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMetodePembayar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_metode_pembayar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLihatSemuaOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_lihat_semua)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBayarCOD: String? = MyApp.getInstance().resources.getString(R.string.lbl_bayar_cod)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransferkerek: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transfer_ke_rek)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransferkerekOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transfer_ke_rek2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransferkerekTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transfer_ke_rek3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalRp100: String? = MyApp.getInstance().resources.getString(R.string.msg_total_rp_100)

)
