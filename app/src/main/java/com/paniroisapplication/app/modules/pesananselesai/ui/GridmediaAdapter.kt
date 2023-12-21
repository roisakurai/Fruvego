package com.paniroisapplication.app.modules.pesananselesai.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.paniroisapplication.app.R
import com.paniroisapplication.app.databinding.RowGridmediaBinding
import com.paniroisapplication.app.modules.pesananselesai.`data`.model.GridmediaRowModel
import kotlin.Int
import kotlin.collections.List

class GridmediaAdapter(
  var list: List<GridmediaRowModel>
) : RecyclerView.Adapter<GridmediaAdapter.RowGridmediaVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridmediaVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridmedia,parent,false)
    return RowGridmediaVH(view)
  }

  override fun onBindViewHolder(holder: RowGridmediaVH, position: Int) {
    val gridmediaRowModel = GridmediaRowModel()
    // TODO uncomment following line after integration with data source
    // val gridmediaRowModel = list[position]
    holder.binding.gridmediaRowModel = gridmediaRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridmediaRowModel>) {
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
      item: GridmediaRowModel
    ) {
    }
  }

  inner class RowGridmediaVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridmediaBinding = RowGridmediaBinding.bind(itemView)
  }
}
