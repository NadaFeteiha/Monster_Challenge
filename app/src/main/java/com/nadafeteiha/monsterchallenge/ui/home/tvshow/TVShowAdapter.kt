package com.nadafeteiha.monsterchallenge.ui.home.tvshow

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nadafeteiha.monsterchallenge.R
import com.nadafeteiha.monsterchallenge.data.domain.TVShow
import com.nadafeteiha.monsterchallenge.databinding.ItemTvShowBinding

class TVShowAdapter(private var tvShows: List<TVShow>) :
    RecyclerView.Adapter<TVShowAdapter.ConverterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConverterViewHolder {
        return ConverterViewHolder(ItemTvShowBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ConverterViewHolder, position: Int) {
        val tvShow = tvShows[position]
        holder.binding.apply {
            textTvShowTitle.text = tvShow.title
            textRate.text = tvShow.rate
            textNumberSeasons.text =
                this.root.context.resources.getString(R.string.season, tvShow.numSeason.toString())
            Glide.with(this.root.context).load(tvShow.posterImage).into(posterImage)
        }
    }

    override fun getItemCount(): Int = tvShows.size

    inner class ConverterViewHolder(val binding: ItemTvShowBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }
}