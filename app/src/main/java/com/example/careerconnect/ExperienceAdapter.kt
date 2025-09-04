package com.example.careerconnect

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExperienceAdapter(private val items: List<Experience>) : RecyclerView.Adapter<ExperienceAdapter.VH>() {
    class VH(v: View) : RecyclerView.ViewHolder(v) {
        val role: TextView = v.findViewById(R.id.tvRole)
        val company: TextView = v.findViewById(R.id.tvCompany)
        val desc: TextView = v.findViewById(R.id.tvDesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_experience, parent, false)
        return VH(v)
    }

    override fun onBindViewHolder(h: VH, position: Int) {
        val x = items[position]
        h.role.text = x.role
        h.company.text = x.companyLine
        h.desc.text = x.desc
    }

    override fun getItemCount() = items.size
}
