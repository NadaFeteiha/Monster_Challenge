package com.nadafeteiha.monsterchallenge.data.domain

import com.nadafeteiha.monsterchallenge.data.domain.enums.HomeItemType

data class HomeItem<T>(
    val item: T,
    val type: HomeItemType
)