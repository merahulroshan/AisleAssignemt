package com.assignment.aisle.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.assignment.aisle.R
import com.assignment.aisle.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel: DashboardViewModel = ViewModelProvider(this)[DashboardViewModel::class.java]
        val binding: FragmentDashboardBinding =
            DataBindingUtil.setContentView(requireActivity(), R.layout.fragment_dashboard)
        binding.viewModel = viewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
        //return DataBindingUtil.inflate<FragmentDashboardBinding>(inflater, R.layout.fragment_dashboard, container, false).root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}