package com.assignment.aisle.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.assignment.aisle.R
import com.assignment.aisle.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel: NotificationsViewModel =
            ViewModelProvider(this)[NotificationsViewModel::class.java]
        val binding: FragmentNotificationsBinding =
            DataBindingUtil.setContentView(requireActivity(), R.layout.fragment_notifications)
        binding.viewModel = viewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this)[NotificationsViewModel::class.java]

        return DataBindingUtil.inflate<FragmentNotificationsBinding>(
            inflater, R.layout.fragment_notifications, container, false
        ).root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}