package info.mking.currencyexchange.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import info.mking.currencyexchange.data.rates.DefaultRatesRepository
import info.mking.currencyexchange.data.rates.RatesRepository

@Module
@InstallIn(SingletonComponent::class)
object RepositoriesModule {
    @Provides
    fun provideRatesRepository(defaultRatesRepository: DefaultRatesRepository): RatesRepository =
        defaultRatesRepository
}