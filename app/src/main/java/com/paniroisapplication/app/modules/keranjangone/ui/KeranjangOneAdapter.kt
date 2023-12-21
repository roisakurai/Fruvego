package com.paniroisapplication.app.modules.keranjangone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.paniroisapplication.app.R
import com.paniroisapplication.app.databinding.RowKeranjangOneBinding
import com.paniroisapplication.app.modules.keranjangone.`data`.model.KeranjangOneRowModel
import kotlin.Int
import kotlin.collections.List

class KeranjangOneAdapter(
  var list: List<KeranjangOneRowModel>
) : RecyclerView.Adapter<KeranjangOneAdapter.RowKeranjangOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowKeranjangOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_keranjang_one,parent,false)
    return RowKeranjangOneVH(view)
  }

  override fun onBindViewHolder(holder: RowKeranjangOneVH, position: Int) {
    val keranjangOneRowModel = KeranjangOneRowModel()
    // TODO uncomment following line after integration with data source
    // val keranjangOneRowModel = list[position]
    holder.binding.keranjangOneRowModel = keranjangOneRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<KeranjangOneRowModel>) {
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
      item: KeranjangOneRowModel
    ) {
    }
  }

  inner class RowKeranjangOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowKeranjangOneBinding = RowKeranjangOneBinding.bind(itemView)
  }
}
