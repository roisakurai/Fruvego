package com.paniroisapplication.app.modules.kategorione.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.paniroisapplication.app.R
import com.paniroisapplication.app.databinding.RowKategoriOneBinding
import com.paniroisapplication.app.modules.kategorione.`data`.model.KategoriOneRowModel
import kotlin.Int
import kotlin.collections.List

class KategoriOneAdapter(
  var list: List<KategoriOneRowModel>
) : RecyclerView.Adapter<KategoriOneAdapter.RowKategoriOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowKategoriOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_kategori_one,parent,false)
    return RowKategoriOneVH(view)
  }

  override fun onBindViewHolder(holder: RowKategoriOneVH, position: Int) {
    val kategoriOneRowModel = KategoriOneRowModel()
    // TODO uncomment following line after integration with data source
    // val kategoriOneRowModel = list[position]
    holder.binding.kategoriOneRowModel = kategoriOneRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<KategoriOneRowModel>) {
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
      item: KategoriOneRowModel
    ) {
    }
  }

  inner class RowKategoriOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowKategoriOneBinding = RowKategoriOneBinding.bind(itemView)
    init {
      binding.linearColumnmedia.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, KategoriOneRowModel())
      }
    }
  }
}
