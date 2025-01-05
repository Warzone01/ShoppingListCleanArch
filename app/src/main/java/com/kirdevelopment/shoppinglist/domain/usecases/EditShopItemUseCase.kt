package com.kirdevelopment.shoppinglist.domain.usecases

import com.kirdevelopment.shoppinglist.domain.model.ShopItem
import com.kirdevelopment.shoppinglist.domain.repository.ShopListRepository

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}