package com.paniroisapplication.app.modules.pencarian.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.paniroisapplication.app.R
import com.paniroisapplication.app.databinding.RowPencarian1Binding
import com.paniroisapplication.app.modules.pencarian.`data`.model.Pencarian1RowModel
import kotlin.Int
import kotlin.collections.List

class Pencarian1Adapter(
  var list: List<Pencarian1RowModel>
) : RecyclerView.Adapter<Pencarian1Adapter.RowPencarian1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPencarian1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_pencarian1,parent,false)
    return RowPencarian1VH(view)
  }

  override fun onBindViewHolder(holder: RowPencarian1VH, position: Int) {
    val pencarian1RowModel = Pencarian1RowModel()
    // TODO uncomment following line after integration with data source
    // val pencarian1RowModel = list[position]
    holder.binding.pencarian1RowModel = pencarian1RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Pencarian1RowModel>) {
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
      item: Pencarian1RowModel
    ) {
    }
  }

  inner class RowPencarian1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPencarian1Binding = RowPencarian1Binding.bind(itemView)
  }
}
