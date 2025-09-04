package com.example.careerconnect

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import com.google.android.material.chip.Chip

class JobAdapter(private val items: List<Job>) : RecyclerView.Adapter<JobAdapter.VH>() {
    class VH(v: View) : RecyclerView.ViewHolder(v) {
        val title: TextView = v.findViewById(R.id.tvTitle)
        val meta: TextView = v.findViewById(R.id.tvMeta)
        val summary: TextView = v.findViewById(R.id.tvSummary)
        val chip1: Chip = v.findViewById(R.id.chip1)
        val chip2: Chip = v.findViewById(R.id.chip2)
        val btnSave: MaterialButton = v.findViewById(R.id.btnSave)
        val btnApply: MaterialButton = v.findViewById(R.id.btnApply)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_job, parent, false)
        return VH(v)
    }

    override fun onBindViewHolder(h: VH, position: Int) {
        val item = items[position]
        h.title.text = item.title
        h.meta.text = "${item.company} • ${item.location}"
        h.summary.text = item.summary
        h.chip1.text = item.tags.getOrNull(0) ?: ""
        h.chip2.text = item.tags.getOrNull(1) ?: ""
        h.btnSave.setOnClickListener { Toast.makeText(it.context, "Saved", Toast.LENGTH_SHORT).show() }
        h.btnApply.setOnClickListener { Toast.makeText(it.context, "Apply clicked", Toast.LENGTH_SHORT).show() }
    }

    override fun getItemCount() = items.size
}
