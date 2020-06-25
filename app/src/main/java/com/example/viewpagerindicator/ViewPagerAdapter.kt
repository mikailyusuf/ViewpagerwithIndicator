package com.example.viewpagerindicator

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(
    private var name: List<String>,
    private var description: List<String>,
    private var image: List<Int>
) : RecyclerView.Adapter<ViewPagerAdapter.PagerViewHolder>() {

    inner class PagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txt_name: TextView = itemView.findViewById(R.id.text_1)
        val txt_description: TextView = itemView.findViewById(R.id.text_2)
        val t_image: ImageView = itemView.findViewById(R.id.image)

        init {
            t_image.setOnClickListener {

                val position = adapterPosition
                Toast.makeText(itemView.context, "Item $position was clicked", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPagerAdapter.PagerViewHolder {
        return PagerViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.view_layout, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return name.size
    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.PagerViewHolder, position: Int) {

        holder.txt_name.text = name[position]
        holder.txt_description.text = description[position]
      holder.t_image.setImageResource(image[position])

    }
}