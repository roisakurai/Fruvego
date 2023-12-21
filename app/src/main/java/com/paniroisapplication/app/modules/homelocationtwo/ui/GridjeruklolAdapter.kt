package com.paniroisapplication.app.modules.homelocationtwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.paniroisapplication.app.R
import com.paniroisapplication.app.databinding.RowGridjeruklolBinding
import com.paniroisapplication.app.modules.homelocationtwo.`data`.model.GridjeruklolRowModel
import kotlin.Int
import kotlin.collections.List

class GridjeruklolAdapter(
  var list: List<GridjeruklolRowModel>
) : RecyclerView.Adapter<GridjeruklolAdapter.RowGridjeruklolVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridjeruklolVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridjeruklol,parent,false)
    return RowGridjeruklolVH(view)
  }

  override fun onBindViewHolder(holder: RowGridjeruklolVH, position: Int) {
    val gridjeruklolRowModel = GridjeruklolRowModel()
    // TODO uncomment following line after integration with data source
    // val gridjeruklolRowModel = list[position]
    holder.binding.gridjeruklolRowModel = gridjeruklolRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridjeruklolRowModel>) {
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
      item: GridjeruklolRowModel
    ) {
    }
  }

  inner class RowGridjeruklolVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridjeruklolBinding = RowGridjeruklolBinding.bind(itemView)
  }
}
