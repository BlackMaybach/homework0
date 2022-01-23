package com.example.homework0.adapters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.homework0.R
import com.example.homework0.fragments.addUser
import com.example.homework0.models.User

class userAdapter(private var array: ArrayList<User>,
                  var context: FragmentActivity
) :
    RecyclerView.Adapter<userAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // обьекты наших элементов(для ячеек)
        val title: TextView = view.findViewById<TextView>(R.id.getName)
        val cat: TextView = view.findViewById<TextView>(R.id.getMiniDesc)
        val btn: TextView = view.findViewById(R.id.addUser)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewNameCat = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_getinfouser, parent, false )
        return ViewHolder(viewNameCat)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = array[position]

        holder.title.text = item.name
        holder.cat.text = item.miniDesc

        holder.btn.setOnClickListener() {
            val bundle = Bundle()
            context.supportFragmentManager.beginTransaction()
                .replace(R.id.container, addUser::class.java, bundle)
                .addToBackStack(null)
                .commit()
        }
    }

    override fun getItemCount(): Int {
        return array.size
    }
}