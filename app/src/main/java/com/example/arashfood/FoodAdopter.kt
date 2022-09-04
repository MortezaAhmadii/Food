package com.example.arashfood

import android.content.Context
import android.util.proto.ProtoOutputStream
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class FoodAdopter( private val data:ArrayList<Food>, private val context:Context ) : RecyclerView.Adapter<FoodAdopter.FoodViewHolder>() {

    inner class FoodViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){

        val img = itemView.findViewById<ImageView>(R.id.img)
        val FoodName = itemView.findViewById<TextView>(R.id.textView)
        val Label = itemView.findViewById<TextView>(R.id.textView2)
        val Price = itemView.findViewById<TextView>(R.id.textView3)
        val City = itemView.findViewById<TextView>(R.id.textView4)
        val Point = itemView.findViewById<TextView>(R.id.textView5)
        val Rate = itemView.findViewById<RatingBar>(R.id.ratingBar)
        val clear = itemView.findViewById<ImageView>(R.id.clear)

        fun bindData (position: Int){

            FoodName.text = data[position].txtFoodName
            Label.text = data[position].txtLabel
            Price.text = data[position].txtPrice.toString() + "  Toman"
            City.text = data[position].txtCity
            Rate.rating = data[position].Rate
            Point.text =  "Rank  " + data[position].Point.toString()

            Glide
                .with(context)
                .load(data[position].UrlImg)
                .circleCrop()
                .into(img)

            clear.setOnClickListener{

                data.removeAt(adapterPosition)
                notifyItemRemoved(adapterPosition)

            }

        }

    }

    fun Addfood(namefood : Food){
        data.add(0,namefood)
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_food,parent,false)
        return FoodViewHolder(view)
    }


    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.bindData(position)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}



