package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(val context: Context, val foodArray: ArrayList<Menu>): BaseAdapter() {
    class ViewHolder(row: View) {
        var textViewFoodName: TextView
        var imageViewFood: ImageView

        init {
            textViewFoodName = row.findViewById(R.id.foodName) as TextView
            imageViewFood = row.findViewById(R.id.imageViewFood) as ImageView
        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View?
        val viewHolder: ViewHolder

        if (convertView == null) {
            val layoutInflater: LayoutInflater = LayoutInflater.from(context)
            view = layoutInflater.inflate(R.layout.menu_item, null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = convertView.tag as ViewHolder
        }

        var food: Menu = getItem(position) as Menu
        viewHolder.textViewFoodName.text = food.name
        viewHolder.imageViewFood.setImageResource(food.image)

        return view as View
    }

    override fun getItem(position: Int): Any {
        return foodArray[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return foodArray.size
    }

}