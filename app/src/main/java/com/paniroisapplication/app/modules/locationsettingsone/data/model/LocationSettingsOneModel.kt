package com.paniroisapplication.app.modules.locationsettingsone.`data`.model

import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LocationSettingsOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPilihAlamatPe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pilih_alamat_pe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGunakanLokasi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_gunakan_lokasi)

)
