package com.paniroisapplication.app.modules.halamanprodukone.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HalamanProdukOneModel(
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
  var txtJerukPurut: String? = MyApp.getInstance().resources.getString(R.string.lbl_jeruk_purut)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAsalCirebonSeven: String? =
      MyApp.getInstance().resources.getString(R.string.msg_asal_cirebon_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRpCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp_30_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeskripsi: String? = MyApp.getInstance().resources.getString(R.string.lbl_deskripsi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jeruk_merupakan)
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
  var txtResepMakanan: String? = MyApp.getInstance().resources.getString(R.string.lbl_resep_makanan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJusJeruk: String? = MyApp.getInstance().resources.getString(R.string.lbl_jus_jeruk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSaladbuah: String? = MyApp.getInstance().resources.getString(R.string.lbl_salad_buah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtManisan: String? = MyApp.getInstance().resources.getString(R.string.lbl_manisan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl)

)
