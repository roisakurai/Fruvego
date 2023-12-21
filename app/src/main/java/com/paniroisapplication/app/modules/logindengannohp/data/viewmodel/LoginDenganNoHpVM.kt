package com.paniroisapplication.app.modules.logindengannohp.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.paniroisapplication.app.modules.logindengannohp.`data`.model.LoginDenganNoHpModel
import org.koin.core.KoinComponent

class LoginDenganNoHpVM : ViewModel(), KoinComponent {
  val loginDenganNoHpModel: MutableLiveData<LoginDenganNoHpModel> =
      MutableLiveData(LoginDenganNoHpModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount
}
