package com.kirdevelopment.shoppinglist.domain.usecases

import com.kirdevelopment.shoppinglist.domain.model.ShopItem
import com.kirdevelopment.shoppinglist.domain.repository.ShopListRepository

class GetShopItemByIdUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItemById(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItemById(shopItemId)
    }
}