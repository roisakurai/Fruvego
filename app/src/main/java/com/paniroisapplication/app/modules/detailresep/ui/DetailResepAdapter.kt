package com.paniroisapplication.app.modules.detailresep.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.paniroisapplication.app.R
import com.paniroisapplication.app.databinding.RowDetailResepBinding
import com.paniroisapplication.app.modules.detailresep.`data`.model.DetailResepRowModel
import kotlin.Int
import kotlin.collections.List

class DetailResepAdapter(
  var list: List<DetailResepRowModel>
) : RecyclerView.Adapter<DetailResepAdapter.RowDetailResepVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDetailResepVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_detail_resep,parent,false)
    return RowDetailResepVH(view)
  }

  override fun onBindViewHolder(holder: RowDetailResepVH, position: Int) {
    val detailResepRowModel = DetailResepRowModel()
    // TODO uncomment following line after integration with data source
    // val detailResepRowModel = list[position]
    holder.binding.detailResepRowModel = detailResepRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DetailResepRowModel>) {
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
      item: DetailResepRowModel
    ) {
    }
  }

  inner class RowDetailResepVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDetailResepBinding = RowDetailResepBinding.bind(itemView)
  }
}
