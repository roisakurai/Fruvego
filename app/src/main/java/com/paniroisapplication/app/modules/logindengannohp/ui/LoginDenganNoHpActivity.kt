package com.paniroisapplication.app.modules.logindengannohp.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.base.BaseActivity
import com.paniroisapplication.app.appcomponents.googleauth.GoogleHelper
import com.paniroisapplication.app.databinding.ActivityLoginDenganNoHpBinding
import com.paniroisapplication.app.modules.homelocationcontainer.ui.HomeLocationContainerActivity
import com.paniroisapplication.app.modules.logindengannohp.`data`.viewmodel.LoginDenganNoHpVM
import kotlin.String
import kotlin.Unit

class LoginDenganNoHpActivity :
    BaseActivity<ActivityLoginDenganNoHpBinding>(R.layout.activity_login_dengan_no_hp) {
  private val viewModel: LoginDenganNoHpVM by viewModels<LoginDenganNoHpVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginDenganNoHpVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearRowgoogle.setOnClickListener {
        googleLogin.login()
      }
      binding.btnLoginOne.setOnClickListener {
        val destIntent = HomeLocationContainerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "LOGIN_DENGAN_NO_HP_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, LoginDenganNoHpActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
