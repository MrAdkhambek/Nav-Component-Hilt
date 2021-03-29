package mr.adkhambek.ncd.ui

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import mr.adkhambek.ncd.di.NavigationCommand
import mr.adkhambek.ncd.di.NavigationDispatcher
import javax.inject.Inject


@HiltViewModel
class AppViewModel @Inject constructor(
    private val navigationDispatcher: NavigationDispatcher
) : ViewModel() {

    val navigationCommands: Flow<NavigationCommand>
        get() = navigationDispatcher.navigationCommands
}