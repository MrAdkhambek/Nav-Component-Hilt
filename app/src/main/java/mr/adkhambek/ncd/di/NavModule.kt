package mr.adkhambek.ncd.di

import android.content.Context
import androidx.annotation.IdRes
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.runBlocking
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class NavigationDispatcher @Inject constructor() {

    private val navigationEmitter: MutableSharedFlow<NavigationCommand> = MutableSharedFlow()
    val navigationCommands: Flow<NavigationCommand> = navigationEmitter.asSharedFlow()

    fun emit(navigationCommand: NavigationCommand) = runBlocking {
        navigationEmitter.emit(navigationCommand)
    }

    fun emit(direction: NavDirections) = emit {
        navigate(direction)
    }

    fun back() = emit {
        popBackStack()
    }

    fun back(@IdRes destinationId: Int, inclusive: Boolean) = emit {
        popBackStack(destinationId, inclusive)
    }
}

typealias NavigationCommand = NavController.(Context) -> Unit