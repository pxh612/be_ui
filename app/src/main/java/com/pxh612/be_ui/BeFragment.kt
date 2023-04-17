package com.pxh612.be_ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager

import com.pxh612.be_ui.databinding.BeFragmentBinding

class BeFragment : Fragment(){
    private lateinit var binding : BeFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.be_fragment, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.locationRecyclerView.run{
            LocationRecyclerViewAdapter().also { adapter = it }
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        }

        binding.foodOptionRecyclerView.run{
            adapter = FoodOptionRecyclerViewAdapter()
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        }

        binding.couponRecyclerView.run{
            adapter = CouponsRecyclerViewAdapter()
            layoutManager = GridLayoutManager(context, 2)
        }
    }
}