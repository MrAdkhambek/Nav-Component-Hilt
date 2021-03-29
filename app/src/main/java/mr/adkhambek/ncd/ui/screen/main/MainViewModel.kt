package mr.adkhambek.ncd.ui.screen.main

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import mr.adkhambek.ncd.di.NavigationDispatcher
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val navigationDispatcher: NavigationDispatcher
) : ViewModel() {

    fun onSecondClicked() {
        navigationDispatcher.emit(MainFragmentDirections.toSecondFragment())
    }
}