package com.example.homework0.fragments

import android.os.Bundle
import android.provider.SyncStateContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework0.Constants
import com.example.homework0.R
import com.example.homework0.adapters.userAdapter


class userFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewFirstFragment = inflater.inflate(R.layout.fragment_user, container, false)
        val recyclerView = viewFirstFragment.findViewById<RecyclerView>(R.id.recyclerUser)

        // adapter - работает с массивом что бы его отрисовать,
        recyclerView.adapter = userAdapter(Constants.usersArr, requireActivity())
        return viewFirstFragment
    }
}
