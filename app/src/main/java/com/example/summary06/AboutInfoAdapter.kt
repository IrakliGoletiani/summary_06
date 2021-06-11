package com.example.summary06

import android.util.Log.d
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.summary06.databinding.ItemFragmentLayoutBinding


class AboutInfoAdapter : RecyclerView.Adapter<AboutInfoAdapter.CountriesViewHolder>() {

    val aboutInfo = mutableListOf<AboutInfo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountriesViewHolder {
        val binding =
            ItemFragmentLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CountriesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CountriesViewHolder, position: Int) {
        holder.onBind()
    }

    override fun getItemCount() = aboutInfo.size

    inner class CountriesViewHolder(private val binding: ItemFragmentLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind() {
            val model = aboutInfo[adapterPosition]

        }
    }

    fun setDataToList(countriesList: MutableList<AboutInfo>) {
        this.aboutInfo.clear()
        this.aboutInfo.addAll(countriesList)
        notifyDataSetChanged()
    }

    fun clearData() {
        aboutInfo.clear()
        notifyDataSetChanged()
    }
}