package com.nadafeteiha.monsterchallenge.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nadafeteiha.monsterchallenge.R
import com.nadafeteiha.monsterchallenge.data.domain.Actor
import com.nadafeteiha.monsterchallenge.data.domain.HomeItem
import com.nadafeteiha.monsterchallenge.data.domain.Movie
import com.nadafeteiha.monsterchallenge.data.domain.TVShow
import com.nadafeteiha.monsterchallenge.data.domain.enums.HomeItemType
import com.nadafeteiha.monsterchallenge.databinding.ItemActorListBinding
import com.nadafeteiha.monsterchallenge.databinding.ItemCategoryBinding
import com.nadafeteiha.monsterchallenge.databinding.ItemRecommendedMovieBinding
import com.nadafeteiha.monsterchallenge.databinding.ItemTvshowListBinding
import com.nadafeteiha.monsterchallenge.ui.home.actor.ActorAdapter
import com.nadafeteiha.monsterchallenge.ui.home.tvshow.TVShowAdapter
import com.nadafeteiha.monsterchallenge.util.Constants

class HomeAdapter(private val items: List<HomeItem<Any>>) :
    RecyclerView.Adapter<HomeAdapter.BaseHomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseHomeViewHolder {
        return when (viewType) {
            Constants.VIEW_TV_SHOW -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_tvshow_list, parent, false)
                TVShowViewHolder(view)
            }
            Constants.VIEW_RECOMANDED_MOVIE -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_recommended_movie, parent, false)
                RecommendedMovieViewHolder(view)
            }
            Constants.VIEW_TYPE_ACTORS -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_actor_list, parent, false)
                ActorViewHolder(view)
            }
            Constants.VIEW_CATEGORY -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_category, parent, false)
                CategoryViewHolder(view)
            }
            else -> throw Exception("UnKnown View Type")
        }
    }

    override fun onBindViewHolder(holder: BaseHomeViewHolder, position: Int) {
        when (holder) {
            is TVShowViewHolder -> bindTVShow(holder, position)
            is RecommendedMovieViewHolder -> bindRecommendedMovie(holder, position)
            is ActorViewHolder -> bindActor(holder, position)
            is CategoryViewHolder -> bindCategory(holder, position)
        }
    }

    private fun bindTVShow(holder: TVShowViewHolder, position: Int) {
        val tvShows = items[position].item as List<TVShow>
        val adapter = TVShowAdapter(tvShows)
        holder.binding.apply {
            recyclerTvShow.adapter = adapter
        }
    }

    private fun bindRecommendedMovie(holder: RecommendedMovieViewHolder, position: Int) {
        val movies = items[position].item as Movie
        holder.binding.apply {
            textMovieTitle.text = movies.title
            textRateMovie.text = movies.rate
            textTypeMovie.text = movies.type
            textYearMovie.text = movies.year
            Glide.with(this.root.context)
                .load(movies.imagePoster)
                .into(imagePoster)
        }
    }

    private fun bindActor(holder: ActorViewHolder, position: Int) {
        val actors = items[position].item as List<Actor>
        val adapter = ActorAdapter(actors)
        holder.binding.apply {
            recyclerviewActors.adapter = adapter
        }
    }

    private fun bindCategory(holder: CategoryViewHolder, position: Int) {
        val category = items[position].item as String
        holder.binding.apply {
            textCategory.text= category
        }
    }

    override fun getItemCount(): Int = items.size

    override fun getItemViewType(position: Int): Int {
        return when (items[position].type) {
            HomeItemType.TYPE_RECOMMENDED_MOVIE -> Constants.VIEW_RECOMANDED_MOVIE
            HomeItemType.TYPE_TV_SHOW -> Constants.VIEW_TV_SHOW
            HomeItemType.TYPE_ACTOR_OF_THE_MONTH -> Constants.VIEW_TYPE_ACTORS
            HomeItemType.TYPE_CATEGORY -> Constants.VIEW_CATEGORY
        }
    }

    abstract class BaseHomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView.rootView)

    class TVShowViewHolder(itemView: View) : BaseHomeViewHolder(itemView) {
        val binding = ItemTvshowListBinding.bind(itemView)
    }

    class RecommendedMovieViewHolder(itemView: View) : BaseHomeViewHolder(itemView) {
        val binding = ItemRecommendedMovieBinding.bind(itemView)
    }

    class ActorViewHolder(itemView: View) : BaseHomeViewHolder(itemView) {
        val binding = ItemActorListBinding.bind(itemView)
    }

    class CategoryViewHolder(itemView: View) : BaseHomeViewHolder(itemView) {
        val binding = ItemCategoryBinding.bind(itemView)
    }

}