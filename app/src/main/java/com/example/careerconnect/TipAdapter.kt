package com.example.careerconnect

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TipAdapter(private val items: List<Tip>) : RecyclerView.Adapter<TipAdapter.VH>() {
    class VH(v: View) : RecyclerView.ViewHolder(v) {
        val title: TextView = v.findViewById(R.id.tvTipTitle)
        val meta: TextView = v.findViewById(R.id.tvTipMeta)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_tip, parent, false)
        return VH(v)
    }

    override fun onBindViewHolder(h: VH, position: Int) {
        val t = items[position]
        h.title.text = t.title
        h.meta.text = t.meta
    }

    override fun getItemCount() = items.size
}
