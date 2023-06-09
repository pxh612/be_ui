package com.pxh612.be_ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pxh612.be_ui.databinding.CouponRecyclerviewAdapterBinding


class CouponsRecyclerViewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(
            CouponRecyclerviewAdapterBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return 10
    }

    class MyViewHolder(
        private val binding: CouponRecyclerviewAdapterBinding
    ): RecyclerView.ViewHolder(binding.root){

    }
}

