package com.kirdevelopment.shoppinglist.domain.usecases

import com.kirdevelopment.shoppinglist.domain.model.ShopItem
import com.kirdevelopment.shoppinglist.domain.repository.ShopListRepository

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShopItem(shopItemId: Int) {
        shopListRepository.deleteShopItem(shopItemId)
    }
}