package com.example.instagram

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter2(private val data: ArrayList<MyDataClass2>):RecyclerView.Adapter<MyAdapter2.MyViewHolder2>() {
    class MyViewHolder2(itemView: View): RecyclerView.ViewHolder(itemView) {
        val profile = itemView.findViewById<CircleImageView>(R.id.ProfilePicOnTopPost)
        val name = itemView.findViewById<TextView>(R.id.Name)
        val time = itemView.findViewById<TextView>(R.id.Time)
        val post = itemView.findViewById<ImageView>(R.id.PostImage)
        val name2 = itemView.findViewById<TextView>(R.id.Name2)
        val post2 = itemView.findViewById<TextView>(R.id.PostWritten)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder2 {
        val myItem = LayoutInflater.from(parent.context).inflate(R.layout.post,parent,false)
        return MyViewHolder2(myItem)
    }

    override fun getItemCount(): Int {
        return  data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder2, position: Int) {
        val singleData = data[position]
        holder.profile.setImageResource(singleData.profile)
        holder.name.text = singleData.name
        holder.time.text = singleData.time
        holder.post.setImageResource(singleData.picture)
        holder.name2.text = singleData.name2
        holder.post2.text = singleData.post
    }
}