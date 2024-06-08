package info.mking.currencyexchange.data.sources.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import info.mking.currencyexchange.data.sources.freecurrencyapi.FreeCurrencyApi
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SourcesModule {
    @Provides
    @Singleton
    fun provideFreeCurrencyApiService(retrofitBuilder: Retrofit.Builder) = retrofitBuilder
        .baseUrl("https://api.freecurrencyapi.com/")
        .build()
        .create(FreeCurrencyApi::class.java)
}