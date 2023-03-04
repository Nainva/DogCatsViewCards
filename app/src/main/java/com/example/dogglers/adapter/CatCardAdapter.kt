package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.const.Layout.GRID
import com.example.dogglers.data.DataSource


class CatCardAdapter(
    private val context: Context?,
    private val layout: Int
): RecyclerView.Adapter<CatCardAdapter.CatCardViewHolder>() {

    // Initialize the data using the List found in data/DataSource
    private val catList = DataSource.cats

    class CatCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val catImageView: ImageView? = view!!.findViewById(R.id.cat_image)
        val catNameTextView: TextView? = view!!.findViewById(R.id.cat_name)
        val catAgeTextView: TextView? = view!!.findViewById(R.id.cat_age)
        val catHobbyTextView: TextView? = view!!.findViewById(R.id.cat_hobby)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatCardViewHolder {
        val adapterLayout = when (layout) {
            // Inflate the layout
            GRID -> LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item2, parent, false)
            else -> LayoutInflater.from(parent.context).inflate(R.layout.vertical_horizontal_list_item2, parent, false)
        }
        return CatCardViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return catList.size
    } // return the size of the data set

    override fun onBindViewHolder(holder: CatCardViewHolder, position: Int) {
        // Get the data at the current position
        val catData = catList[position]
        // Set the image resource for the current dog
        holder.catImageView?.setImageResource(catData.imageResourceId)
        // Set the text for the current dog's name
        holder.catNameTextView?.text = catData.name
        // Set the text for the current dog's age
        val resources = context?.resources
        holder.catAgeTextView?.text = resources?.getString(R.string.dog_age, catData.age)
        holder.catHobbyTextView?.text = resources?.getString(R.string.dog_hobbies, catData.hobbies)
    }
}

