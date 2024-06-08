package info.mking.currencyexchange.data.rates

import info.mking.currencyexchange.data.sources.freecurrencyapi.FreeCurrencyApi
import javax.inject.Inject

interface RatesRepository {
    suspend fun latestRates(): Map<String, Double>
}

class DefaultRatesRepository @Inject constructor(
    private val freeCurrencyApi: FreeCurrencyApi
) : RatesRepository {
    override suspend fun latestRates(): Map<String, Double> {
        return freeCurrencyApi.latest().data
    }
}
