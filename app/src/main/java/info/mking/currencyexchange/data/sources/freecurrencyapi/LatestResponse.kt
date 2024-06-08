package info.mking.currencyexchange.data.sources.freecurrencyapi

import kotlinx.serialization.Serializable

@Serializable
data class LatestResponse(
    val data: Map<String, Double>
)
