package com.paniroisapplication.app.modules.registerone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.paniroisapplication.app.modules.registerone.`data`.model.RegisterOneModel
import org.koin.core.KoinComponent

class RegisterOneVM : ViewModel(), KoinComponent {
  val registerOneModel: MutableLiveData<RegisterOneModel> = MutableLiveData(RegisterOneModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount
}
