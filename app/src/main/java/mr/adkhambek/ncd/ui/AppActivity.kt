package mr.adkhambek.ncd.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.NavHostFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import mr.adkhambek.ncd.R


@AndroidEntryPoint
class AppActivity : AppCompatActivity(R.layout.activity_main) {

    private val viewModel: AppViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val navHostFragment = supportFragmentManager.findFragmentById(
            R.id.nav_host
        ) as NavHostFragment

        val navController = navHostFragment.navController

        viewModel
            .navigationCommands
            .onEach { command ->
                command(navController, this)
            }.launchIn(lifecycleScope)
    }
}