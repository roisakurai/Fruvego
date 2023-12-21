package com.paniroisapplication.app.modules.resep.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.paniroisapplication.app.R
import com.paniroisapplication.app.databinding.RowResepBinding
import com.paniroisapplication.app.modules.resep.`data`.model.ResepRowModel
import kotlin.Int
import kotlin.collections.List

class ResepAdapter(
  var list: List<ResepRowModel>
) : RecyclerView.Adapter<ResepAdapter.RowResepVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowResepVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_resep,parent,false)
    return RowResepVH(view)
  }

  override fun onBindViewHolder(holder: RowResepVH, position: Int) {
    val resepRowModel = ResepRowModel()
    // TODO uncomment following line after integration with data source
    // val resepRowModel = list[position]
    holder.binding.resepRowModel = resepRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ResepRowModel>) {
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
      item: ResepRowModel
    ) {
    }
  }

  inner class RowResepVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowResepBinding = RowResepBinding.bind(itemView)
    init {
      binding.linearColumnresepbalinese.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ResepRowModel())
      }
    }
  }
}
