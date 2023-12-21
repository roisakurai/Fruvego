package com.paniroisapplication.app.modules.hasilpencarian.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.paniroisapplication.app.R
import com.paniroisapplication.app.databinding.RowGridmediaOneBinding
import com.paniroisapplication.app.modules.hasilpencarian.`data`.model.GridmediaOneRowModel
import kotlin.Int
import kotlin.collections.List

class GridmediaOneAdapter(
  var list: List<GridmediaOneRowModel>
) : RecyclerView.Adapter<GridmediaOneAdapter.RowGridmediaOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridmediaOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridmedia_one,parent,false)
    return RowGridmediaOneVH(view)
  }

  override fun onBindViewHolder(holder: RowGridmediaOneVH, position: Int) {
    val gridmediaOneRowModel = GridmediaOneRowModel()
    // TODO uncomment following line after integration with data source
    // val gridmediaOneRowModel = list[position]
    holder.binding.gridmediaOneRowModel = gridmediaOneRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridmediaOneRowModel>) {
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
      item: GridmediaOneRowModel
    ) {
    }
  }

  inner class RowGridmediaOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridmediaOneBinding = RowGridmediaOneBinding.bind(itemView)
    init {
      binding.linearColumnmedia.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, GridmediaOneRowModel())
      }
    }
  }
}
