package com.paniroisapplication.app.modules.kategori.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.paniroisapplication.app.R
import com.paniroisapplication.app.databinding.RowKategoriBinding
import com.paniroisapplication.app.modules.kategori.`data`.model.KategoriRowModel
import kotlin.Int
import kotlin.collections.List

class KategoriAdapter(
  var list: List<KategoriRowModel>
) : RecyclerView.Adapter<KategoriAdapter.RowKategoriVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowKategoriVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_kategori,parent,false)
    return RowKategoriVH(view)
  }

  override fun onBindViewHolder(holder: RowKategoriVH, position: Int) {
    val kategoriRowModel = KategoriRowModel()
    // TODO uncomment following line after integration with data source
    // val kategoriRowModel = list[position]
    holder.binding.kategoriRowModel = kategoriRowModel
  }

  override fun getItemCount(): Int = 12
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<KategoriRowModel>) {
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
      item: KategoriRowModel
    ) {
    }
  }

  inner class RowKategoriVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowKategoriBinding = RowKategoriBinding.bind(itemView)
  }
}
