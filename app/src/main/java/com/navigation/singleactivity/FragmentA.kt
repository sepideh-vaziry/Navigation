package com.navigation.singleactivity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.navigation.singleactivity.databinding.FragmentABinding
import kotlinx.android.synthetic.main.fragment_a.*

class FragmentA : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentABinding.inflate(inflater, null, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonGoToFragmentB.setOnClickListener {
            view.findNavController().navigate(R.id.actionShowPageB)
        }

    }

}