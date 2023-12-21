package com.paniroisapplication.app.modules.homelocationcontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.base.BaseActivity
import com.paniroisapplication.app.databinding.ActivityHomeLocationContainerBinding
import com.paniroisapplication.app.extensions.loadFragment
import com.paniroisapplication.app.modules.bantuan.ui.BantuanFragment
import com.paniroisapplication.app.modules.homelocation.ui.HomeLocationFragment
import com.paniroisapplication.app.modules.homelocationcontainer.`data`.viewmodel.HomeLocationContainerVM
import com.paniroisapplication.app.modules.kategorione.ui.KategoriOneFragment
import com.paniroisapplication.app.modules.resep.ui.ResepFragment
import kotlin.String
import kotlin.Unit

class HomeLocationContainerActivity :
    BaseActivity<ActivityHomeLocationContainerBinding>(R.layout.activity_home_location_container) {
  private val viewModel: HomeLocationContainerVM by viewModels<HomeLocationContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeLocationContainerVM = viewModel
    val destFragment = HomeLocationFragment.getInstance(null)
    this.loadFragment(
    R.id.fragmentContainer,
    destFragment,
    bundle = destFragment.arguments,
    tag = HomeLocationFragment.TAG,
    addToBackStack = false,
    add = false,
    enter = null,
    exit = null,
    )
  }

  override fun setUpClicks(): Unit {
    binding.linearAkun.setOnClickListener {
      val destFragment = KategoriOneFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = KategoriOneFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearHome.setOnClickListener {
      val destFragment = HomeLocationFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = HomeLocationFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearResep.setOnClickListener {
      val destFragment = ResepFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = ResepFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearBantuan.setOnClickListener {
      val destFragment = BantuanFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = BantuanFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
  }

  companion object {
    const val TAG: String = "HOME_LOCATION_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeLocationContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
