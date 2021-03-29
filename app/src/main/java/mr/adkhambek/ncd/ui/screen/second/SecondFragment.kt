package mr.adkhambek.ncd.ui.screen.second

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import mr.adkhambek.ncd.R
import mr.adkhambek.ncd.databinding.FragmentSecondBinding


@AndroidEntryPoint
class SecondFragment : Fragment(R.layout.fragment_second) {

    private val viewModel: SecondViewModel by viewModels()
    private val viewBinding by viewBinding(FragmentSecondBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupBinding()
    }

    private fun setupBinding() = with(viewBinding) {
        actionBack.setOnClickListener {
            viewModel.onBackClicked()
        }
    }
}