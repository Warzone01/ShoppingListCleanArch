package com.kirdevelopment.shoppinglist.domain.usecases

import com.kirdevelopment.shoppinglist.domain.model.ShopItem
import com.kirdevelopment.shoppinglist.domain.repository.ShopListRepository

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): List<ShopItem> {
        return shopListRepository.getShopList()
    }
}