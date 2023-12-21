package com.paniroisapplication.app.modules.resep.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import com.paniroisapplication.app.R
import com.paniroisapplication.app.appcomponents.base.BaseFragment
import com.paniroisapplication.app.databinding.FragmentResepBinding
import com.paniroisapplication.app.modules.detailresep.ui.DetailResepActivity
import com.paniroisapplication.app.modules.resep.`data`.model.ResepRowModel
import com.paniroisapplication.app.modules.resep.`data`.viewmodel.ResepVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ResepFragment : BaseFragment<FragmentResepBinding>(R.layout.fragment_resep) {
  private val viewModel: ResepVM by viewModels<ResepVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val resepAdapter = ResepAdapter(viewModel.resepList.value?:mutableListOf())
    binding.recyclerResep.adapter = resepAdapter
    resepAdapter.setOnItemClickListener(
    object : ResepAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ResepRowModel) {
        onClickRecyclerResep(view, position, item)
      }
    }
    )
    viewModel.resepList.observe(requireActivity()) {
      resepAdapter.updateData(it)
    }
    binding.resepVM = viewModel
    setUpSearchViewSearchListener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerResep(
    view: View,
    position: Int,
    item: ResepRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnresepbalinese -> {
        val destIntent = DetailResepActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
    }
  }

  private fun setUpSearchViewSearchListener(): Unit {
    binding.searchViewSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "RESEP_FRAGMENT"


      fun getInstance(bundle: Bundle?): ResepFragment {
        val fragment = ResepFragment()
        fragment.arguments = bundle
        return fragment
      }
    }
  }
