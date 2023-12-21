package com.paniroisapplication.app.modules.registerone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.base.BaseActivity
import com.paniroisapplication.app.appcomponents.googleauth.GoogleHelper
import com.paniroisapplication.app.databinding.ActivityRegisterOneBinding
import com.paniroisapplication.app.modules.landingpagetwo.ui.LandingPageTwoActivity
import com.paniroisapplication.app.modules.otp.ui.OtpActivity
import com.paniroisapplication.app.modules.registerone.`data`.viewmodel.RegisterOneVM
import kotlin.String
import kotlin.Unit

class RegisterOneActivity : BaseActivity<ActivityRegisterOneBinding>(R.layout.activity_register_one)
    {
  private val viewModel: RegisterOneVM by viewModels<RegisterOneVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registerOneVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error ->

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearRowgoogle.setOnClickListener {
        googleLogin.login()
      }
      binding.btnDaftarOne.setOnClickListener {
        val destIntent = OtpActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.imageArrowdown.setOnClickListener {
        val destIntent = LandingPageTwoActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "REGISTER_ONE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, RegisterOneActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
