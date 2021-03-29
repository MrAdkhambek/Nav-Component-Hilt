package mr.adkhambek.ncd.ui.screen.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import mr.adkhambek.ncd.R
import mr.adkhambek.ncd.databinding.FragmentSecondBinding


@AndroidEntryPoint
class SecondFragment : Fragment(R.layout.fragment_second) {

    private val viewModel: SecondViewModel by viewModels()
    private val binding by viewBinding(FragmentSecondBinding::bind)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        viewModel.toString()
    }
}