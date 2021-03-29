package mr.adkhambek.ncd.ui.screen.second

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import mr.adkhambek.ncd.di.NavigationDispatcher
import javax.inject.Inject


@HiltViewModel
class SecondViewModel @Inject constructor(
    private val navigationDispatcher: NavigationDispatcher
) : ViewModel() {

    fun onBackClicked() {
        navigationDispatcher.back()
    }
}