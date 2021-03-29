package mr.adkhambek.ncd.ui.screen.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import mr.adkhambek.ncd.R
import mr.adkhambek.ncd.databinding.FragmentMainBinding


@AndroidEntryPoint
class MainFragment : Fragment(R.layout.fragment_main) {

    private val viewModel: MainViewModel by viewModels()
    private val viewBinding by viewBinding(FragmentMainBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupBinding()
    }

    private fun setupBinding() = with(viewBinding) {
        actionSecond.setOnClickListener {
            viewModel.onSecondClicked()
        }
    }
}