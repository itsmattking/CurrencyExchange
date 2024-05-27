package info.mking.currencyexchange

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.ui.Modifier
import dagger.hilt.android.AndroidEntryPoint
import info.mking.currencyexchange.ui.home.HomeScreen
import info.mking.currencyexchange.ui.theme.CurrencyExchangeTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CurrencyExchangeTheme {
                Box(
                    modifier = Modifier.statusBarsPadding()
                ) {
                    HomeScreen()
                }
            }
        }
    }
}
