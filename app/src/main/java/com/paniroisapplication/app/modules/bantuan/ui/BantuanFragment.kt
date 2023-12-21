package com.paniroisapplication.app.modules.bantuan.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.base.BaseFragment
import com.paniroisapplication.app.databinding.FragmentBantuanBinding
import com.paniroisapplication.app.modules.bantuan.`data`.model.SpinnerGroup36813FourModel
import com.paniroisapplication.app.modules.bantuan.`data`.model.SpinnerGroup36813Model
import com.paniroisapplication.app.modules.bantuan.`data`.model.SpinnerGroup36813OneModel
import com.paniroisapplication.app.modules.bantuan.`data`.model.SpinnerGroup36813ThreeModel
import com.paniroisapplication.app.modules.bantuan.`data`.model.SpinnerGroup36813TwoModel
import com.paniroisapplication.app.modules.bantuan.`data`.model.SpinnerGroup36814Model
import com.paniroisapplication.app.modules.bantuan.`data`.model.SpinnerGroup36816Model
import com.paniroisapplication.app.modules.bantuan.`data`.model.SpinnerGroup36821Model
import com.paniroisapplication.app.modules.bantuan.`data`.viewmodel.BantuanVM
import com.paniroisapplication.app.modules.halamanprodukone.ui.HalamanProdukOneActivity
import kotlin.String
import kotlin.Unit

class BantuanFragment : BaseFragment<FragmentBantuanBinding>(R.layout.fragment_bantuan) {
  private val viewModel: BantuanVM by viewModels<BantuanVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerGroup36814List.value = mutableListOf(
    SpinnerGroup36814Model("Item1"),
    SpinnerGroup36814Model("Item2"),
    SpinnerGroup36814Model("Item3"),
    SpinnerGroup36814Model("Item4"),
    SpinnerGroup36814Model("Item5")
    )
    val spinnerGroup36814Adapter =
    SpinnerGroup36814Adapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroup36814List.value?:
    mutableListOf())
    binding.spinnerGroup36814.adapter = spinnerGroup36814Adapter
    viewModel.spinnerGroup36813List.value = mutableListOf(
    SpinnerGroup36813Model("Item1"),
    SpinnerGroup36813Model("Item2"),
    SpinnerGroup36813Model("Item3"),
    SpinnerGroup36813Model("Item4"),
    SpinnerGroup36813Model("Item5")
    )
    val spinnerGroup36813Adapter =
    SpinnerGroup36813Adapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroup36813List.value?:
    mutableListOf())
    binding.spinnerGroup36813.adapter = spinnerGroup36813Adapter
    viewModel.spinnerGroup36816List.value = mutableListOf(
    SpinnerGroup36816Model("Item1"),
    SpinnerGroup36816Model("Item2"),
    SpinnerGroup36816Model("Item3"),
    SpinnerGroup36816Model("Item4"),
    SpinnerGroup36816Model("Item5")
    )
    val spinnerGroup36816Adapter =
    SpinnerGroup36816Adapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroup36816List.value?:
    mutableListOf())
    binding.spinnerGroup36816.adapter = spinnerGroup36816Adapter
    viewModel.spinnerGroup36813OneList.value = mutableListOf(
    SpinnerGroup36813OneModel("Item1"),
    SpinnerGroup36813OneModel("Item2"),
    SpinnerGroup36813OneModel("Item3"),
    SpinnerGroup36813OneModel("Item4"),
    SpinnerGroup36813OneModel("Item5")
    )
    val spinnerGroup36813OneAdapter =
    SpinnerGroup36813OneAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroup36813OneList.value?:
    mutableListOf())
    binding.spinnerGroup36813One.adapter = spinnerGroup36813OneAdapter
    viewModel.spinnerGroup36813TwoList.value = mutableListOf(
    SpinnerGroup36813TwoModel("Item1"),
    SpinnerGroup36813TwoModel("Item2"),
    SpinnerGroup36813TwoModel("Item3"),
    SpinnerGroup36813TwoModel("Item4"),
    SpinnerGroup36813TwoModel("Item5")
    )
    val spinnerGroup36813TwoAdapter =
    SpinnerGroup36813TwoAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroup36813TwoList.value?:
    mutableListOf())
    binding.spinnerGroup36813Two.adapter = spinnerGroup36813TwoAdapter
    viewModel.spinnerGroup36813ThreeList.value = mutableListOf(
    SpinnerGroup36813ThreeModel("Item1"),
    SpinnerGroup36813ThreeModel("Item2"),
    SpinnerGroup36813ThreeModel("Item3"),
    SpinnerGroup36813ThreeModel("Item4"),
    SpinnerGroup36813ThreeModel("Item5")
    )
    val spinnerGroup36813ThreeAdapter =
    SpinnerGroup36813ThreeAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroup36813ThreeList.value?:
    mutableListOf())
    binding.spinnerGroup36813Three.adapter = spinnerGroup36813ThreeAdapter
    viewModel.spinnerGroup36813FourList.value = mutableListOf(
    SpinnerGroup36813FourModel("Item1"),
    SpinnerGroup36813FourModel("Item2"),
    SpinnerGroup36813FourModel("Item3"),
    SpinnerGroup36813FourModel("Item4"),
    SpinnerGroup36813FourModel("Item5")
    )
    val spinnerGroup36813FourAdapter =
    SpinnerGroup36813FourAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroup36813FourList.value?:
    mutableListOf())
    binding.spinnerGroup36813Four.adapter = spinnerGroup36813FourAdapter
    viewModel.spinnerGroup36821List.value = mutableListOf(
    SpinnerGroup36821Model("Item1"),
    SpinnerGroup36821Model("Item2"),
    SpinnerGroup36821Model("Item3"),
    SpinnerGroup36821Model("Item4"),
    SpinnerGroup36821Model("Item5")
    )
    val spinnerGroup36821Adapter =
    SpinnerGroup36821Adapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroup36821List.value?:
    mutableListOf())
    binding.spinnerGroup36821.adapter = spinnerGroup36821Adapter
    binding.bantuanVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowdown.setOnClickListener {
      val destIntent = HalamanProdukOneActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "BANTUAN_FRAGMENT"


    fun getInstance(bundle: Bundle?): BantuanFragment {
      val fragment = BantuanFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
