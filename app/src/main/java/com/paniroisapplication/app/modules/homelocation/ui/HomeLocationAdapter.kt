package com.paniroisapplication.app.modules.homelocation.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.paniroisapplication.app.R
import com.paniroisapplication.app.databinding.RowHomeLocationBinding
import com.paniroisapplication.app.modules.homelocation.`data`.model.HomeLocationRowModel
import kotlin.Int
import kotlin.collections.List

class HomeLocationAdapter(
  var list: List<HomeLocationRowModel>
) : RecyclerView.Adapter<HomeLocationAdapter.RowHomeLocationVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHomeLocationVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_location,parent,false)
    return RowHomeLocationVH(view)
  }

  override fun onBindViewHolder(holder: RowHomeLocationVH, position: Int) {
    val homeLocationRowModel = HomeLocationRowModel()
    // TODO uncomment following line after integration with data source
    // val homeLocationRowModel = list[position]
    holder.binding.homeLocationRowModel = homeLocationRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HomeLocationRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: HomeLocationRowModel
    ) {
    }
  }

  inner class RowHomeLocationVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowHomeLocationBinding = RowHomeLocationBinding.bind(itemView)
  }
}
