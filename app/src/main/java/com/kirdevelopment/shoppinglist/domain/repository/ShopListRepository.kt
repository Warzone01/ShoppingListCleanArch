package com.kirdevelopment.shoppinglist.domain.repository

import com.kirdevelopment.shoppinglist.domain.model.ShopItem

interface ShopListRepository {

    fun getShopList(): List<ShopItem>

    fun getShopItemById(shopItemId: Int): ShopItem

    fun editShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun addShopItem(shopItem: ShopItem)
}