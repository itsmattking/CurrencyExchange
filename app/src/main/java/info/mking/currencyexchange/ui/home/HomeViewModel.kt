package info.mking.currencyexchange.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import info.mking.currencyexchange.data.rates.RatesRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val ratesRepository: RatesRepository
) : ViewModel() {
    data class UiState(val title: String = "Hello Android")

    private val _uiState: MutableStateFlow<UiState> = MutableStateFlow(UiState())
    val uiState get() = _uiState.asStateFlow()

    fun initialise() = viewModelScope.launch {
        _uiState.update {
            it.copy(title = ratesRepository.latestRates()["GBP"].toString())
        }
    }

}