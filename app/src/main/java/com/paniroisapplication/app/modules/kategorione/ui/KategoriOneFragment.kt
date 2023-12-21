package com.paniroisapplication.app.modules.kategorione.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.base.BaseFragment
import com.paniroisapplication.app.databinding.FragmentKategoriOneBinding
import com.paniroisapplication.app.modules.halamanproduk.ui.HalamanProdukActivity
import com.paniroisapplication.app.modules.kategorione.`data`.model.KategoriOneRowModel
import com.paniroisapplication.app.modules.kategorione.`data`.viewmodel.KategoriOneVM
import com.paniroisapplication.app.modules.pencarian.ui.PencarianActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class KategoriOneFragment : BaseFragment<FragmentKategoriOneBinding>(R.layout.fragment_kategori_one)
    {
  private val viewModel: KategoriOneVM by viewModels<KategoriOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val kategoriOneAdapter =
    KategoriOneAdapter(viewModel.kategoriOneList.value?:mutableListOf())
    binding.recyclerKategoriOne.adapter = kategoriOneAdapter
    kategoriOneAdapter.setOnItemClickListener(
    object : KategoriOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : KategoriOneRowModel) {
        onClickRecyclerKategoriOne(view, position, item)
      }
    }
    )
    viewModel.kategoriOneList.observe(requireActivity()) {
      kategoriOneAdapter.updateData(it)
    }
    binding.kategoriOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageSearchOne.setOnClickListener {
      val destIntent = PencarianActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerKategoriOne(
    view: View,
    position: Int,
    item: KategoriOneRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnmedia ->  {
        val destIntent = HalamanProdukActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
    }
  }

  companion object {
    const val TAG: String = "KATEGORI_ONE_FRAGMENT"


    fun getInstance(bundle: Bundle?): KategoriOneFragment {
      val fragment = KategoriOneFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
