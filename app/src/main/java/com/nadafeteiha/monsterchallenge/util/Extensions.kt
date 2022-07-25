package com.nadafeteiha.monsterchallenge.util

import com.nadafeteiha.monsterchallenge.data.domain.HomeItem
import com.nadafeteiha.monsterchallenge.data.domain.Movie
import com.nadafeteiha.monsterchallenge.data.domain.enums.HomeItemType


fun Movie.toHomeItem():HomeItem<Any>{
    return HomeItem(this,HomeItemType.TYPE_RECOMMENDED_MOVIE)
}