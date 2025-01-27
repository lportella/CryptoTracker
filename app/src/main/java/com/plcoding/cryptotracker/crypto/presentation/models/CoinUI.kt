package com.plcoding.cryptotracker.crypto.presentation.models

import androidx.annotation.DrawableRes

data class CoinUI(
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCapUsd: DisplayableNumber,
    val priceUsd: DisplayableNumber,
    val changePercentage24Hr: DisplayableNumber,
    @DrawableRes val icon: Int
)

data class DisplayableNumber(
    val value: Double,
    val formatted: String
)