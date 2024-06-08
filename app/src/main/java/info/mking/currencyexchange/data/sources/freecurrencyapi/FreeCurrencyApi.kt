package info.mking.currencyexchange.data.sources.freecurrencyapi

import retrofit2.http.GET
import retrofit2.http.Query

interface FreeCurrencyApi {
    @GET("v1/latest")
    suspend fun latest(@Query("apikey") apiKey: String = "fca_live_WW4D2p1bgD0r6o91ftYNB4Zr1pGBsYclAHxWRYao"): LatestResponse
}