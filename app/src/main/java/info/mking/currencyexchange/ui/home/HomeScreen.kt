package info.mking.currencyexchange.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import info.mking.currencyexchange.ui.theme.CurrencyExchangeTheme

@Composable
fun HomeScreen(viewModel: HomeViewModel = viewModel()) {
    val uiState = viewModel.uiState.collectAsState()
    HomeScreen(uiState = uiState.value)
}

@Composable
fun HomeScreen(uiState: HomeViewModel.UiState) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(modifier = Modifier.fillMaxWidth(), text = uiState.title)
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    CurrencyExchangeTheme {
        HomeScreen(uiState = HomeViewModel.UiState(title = "Preview Title"))
    }
}