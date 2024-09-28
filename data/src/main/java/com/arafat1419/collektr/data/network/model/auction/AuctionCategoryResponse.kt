package com.arafat1419.collektr.data.network.model.auction

import com.google.gson.annotations.SerializedName

data class AuctionCategoryResponse(
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("name")
    val name: String = ""
)