package com.paniroisapplication.app.modules.pencarian.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.paniroisapplication.app.R
import com.paniroisapplication.app.databinding.RowPencarianBinding
import com.paniroisapplication.app.modules.pencarian.`data`.model.PencarianRowModel
import kotlin.Int
import kotlin.collections.List

class PencarianAdapter(
  var list: List<PencarianRowModel>
) : RecyclerView.Adapter<PencarianAdapter.RowPencarianVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPencarianVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_pencarian,parent,false)
    return RowPencarianVH(view)
  }

  override fun onBindViewHolder(holder: RowPencarianVH, position: Int) {
    val pencarianRowModel = PencarianRowModel()
    // TODO uncomment following line after integration with data source
    // val pencarianRowModel = list[position]
    holder.binding.pencarianRowModel = pencarianRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PencarianRowModel>) {
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
      item: PencarianRowModel
    ) {
    }
  }

  inner class RowPencarianVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPencarianBinding = RowPencarianBinding.bind(itemView)
  }
}
