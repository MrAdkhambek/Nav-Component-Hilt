package mr.adkhambek.ncd.ui.screen.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import mr.adkhambek.ncd.di.NavigationDispatcher
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val navigationDispatcher: NavigationDispatcher
) : ViewModel() {

    fun onSecondClicked() = viewModelScope.launch {
        navigationDispatcher.emit(MainFragmentDirections.toSecondFragment())
    }
}