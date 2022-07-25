package com.nadafeteiha.monsterchallenge.ui.home.actor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nadafeteiha.monsterchallenge.R
import com.nadafeteiha.monsterchallenge.data.domain.Actor
import com.nadafeteiha.monsterchallenge.databinding.ItemActorBinding

class ActorAdapter(private var actors: List<Actor>) :
    RecyclerView.Adapter<ActorAdapter.ConverterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConverterViewHolder {
        return ConverterViewHolder(ItemActorBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ConverterViewHolder, position: Int) {
        val actor = actors[position]
        holder.binding.apply {
            Glide.with(this.root.context)
                .load(actor.pictureURL)
                .placeholder(R.mipmap.ic_launcher_round)
                .into(imageActor)
            textName.text = actor.name
        }
    }

    override fun getItemCount(): Int = actors.size

    inner class ConverterViewHolder(val binding: ItemActorBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }
}