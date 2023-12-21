package com.paniroisapplication.app.modules.keranjang.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.paniroisapplication.app.R
import com.paniroisapplication.app.databinding.RowKeranjangBinding
import com.paniroisapplication.app.modules.keranjang.`data`.model.KeranjangRowModel
import kotlin.Int
import kotlin.collections.List

class KeranjangAdapter(
  var list: List<KeranjangRowModel>
) : RecyclerView.Adapter<KeranjangAdapter.RowKeranjangVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowKeranjangVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_keranjang,parent,false)
    return RowKeranjangVH(view)
  }

  override fun onBindViewHolder(holder: RowKeranjangVH, position: Int) {
    val keranjangRowModel = KeranjangRowModel()
    // TODO uncomment following line after integration with data source
    // val keranjangRowModel = list[position]
    holder.binding.keranjangRowModel = keranjangRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<KeranjangRowModel>) {
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
      item: KeranjangRowModel
    ) {
    }
  }

  inner class RowKeranjangVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowKeranjangBinding = RowKeranjangBinding.bind(itemView)
  }
}
