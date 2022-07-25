package com.nadafeteiha.monsterchallenge.ui.home

import android.view.LayoutInflater
import androidx.recyclerview.widget.GridLayoutManager
import com.nadafeteiha.monsterchallenge.R
import com.nadafeteiha.monsterchallenge.data.DataSource
import com.nadafeteiha.monsterchallenge.data.domain.HomeItem
import com.nadafeteiha.monsterchallenge.data.domain.enums.HomeItemType
import com.nadafeteiha.monsterchallenge.databinding.ActivityMainBinding
import com.nadafeteiha.monsterchallenge.ui.base.BaseActivity
import com.nadafeteiha.monsterchallenge.util.toHomeItem

class HomeActivity : BaseActivity<ActivityMainBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding =
        ActivityMainBinding::inflate
    private lateinit var adapter: HomeAdapter

    override fun setup() {
        val itemsList: MutableList<HomeItem<Any>> = mutableListOf()
        itemsList.add(HomeItem(resources.getString(R.string.category_actor),HomeItemType.TYPE_CATEGORY))
        itemsList.add(HomeItem(DataSource.getActorsOfTheMonth(), HomeItemType.TYPE_ACTOR_OF_THE_MONTH))

        itemsList.add(HomeItem(resources.getString(R.string.category_tv_show),HomeItemType.TYPE_CATEGORY))
        itemsList.add(HomeItem(DataSource.getTvShow(), HomeItemType.TYPE_TV_SHOW))

        itemsList.add(HomeItem(resources.getString(R.string.category_recommended),HomeItemType.TYPE_CATEGORY))
        itemsList.addAll(
            DataSource.getRecommendedMovies().map { it.toHomeItem() }
        )
        binding.recyclerview.layoutManager = GridLayoutManager(this, 1)
        adapter = HomeAdapter(itemsList)
        binding.recyclerview.adapter = adapter
    }

}