package com.navigation.singleactivity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.navigation.singleactivity.databinding.FragmentBBinding
import kotlinx.android.synthetic.main.fragment_b.*

class FragmentB : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentBBinding.inflate(inflater, null, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonGoToFragmentC.setOnClickListener {
            val action = FragmentBDirections.actionShowPageC(
                "Test title",
                SampleDataModel("Sepideh", "Vaziry")
            )

            view.findNavController().navigate(action)
        }

    }

}