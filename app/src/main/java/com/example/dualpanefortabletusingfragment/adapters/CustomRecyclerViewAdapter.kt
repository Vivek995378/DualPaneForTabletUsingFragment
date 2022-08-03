package com.example.recyclerviewinfragment.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dualpanefortabletusingfragment.databinding.ItemRecyclerViewBinding
import com.example.recyclerviewinfragment.models.Course

class CustomRecyclerViewAdapter (private val mList: List<Course> , private val listener: OnItemClickListener) :
    RecyclerView.Adapter<CustomRecyclerViewAdapter.MyViewHolder>(){

    inner class MyViewHolder(val binding : ItemRecyclerViewBinding) : RecyclerView.ViewHolder(binding.root) , View.OnClickListener {
        val tvCourse: TextView = binding.tvCourse
        val tvDescription: TextView = binding.tvDescription
        val tvFee: TextView = binding.tvFee

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val binding = ItemRecyclerViewBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)

        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val result = mList[position]

        holder.tvCourse.text = result.courseName
        holder.tvDescription.text = result.descriptiom
        holder.tvFee.text = result.fee.toString()
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}