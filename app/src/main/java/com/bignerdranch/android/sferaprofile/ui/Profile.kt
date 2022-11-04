package com.bignerdranch.android.sferaprofile.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources.getColorStateList
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bignerdranch.android.sferaprofile.R
import com.bignerdranch.android.sferaprofile.adapter.AdapterChrono
import com.bignerdranch.android.sferaprofile.adapter.AdapterMom
import com.bignerdranch.android.sferaprofile.adapter.UserAdapter
import com.bignerdranch.android.sferaprofile.data.ImageModel
import com.bignerdranch.android.sferaprofile.databinding.ProfileFragmentBinding

class Profile : Fragment() {
    private var profileAdapter = UserAdapter()
    private var chronoAdapter = AdapterChrono()
    private var adapterMom = AdapterMom(
        mutableListOf(
            ImageModel(""),
            ImageModel(""),
            ImageModel(""),
            ImageModel(""),
            ImageModel(""),
            ImageModel("")
        )
    )

    private lateinit var binding: ProfileFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ProfileFragmentBinding.inflate(layoutInflater)
        initAdapters()
        initButtons()
        return binding.root
    }

    private fun initButtons() {
        binding.textView2.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_peopleFragment)
        }
        binding.aboutMe.setOnFocusChangeListener { v, hasFocus ->
            binding.textInputLayout.counterTextColor =
                getColorStateList(requireContext(), R.color.purple_200)
        }
    }

    private fun initAdapters() {
        binding.apply {
            recyclerViewProfile.adapter = profileAdapter
            recyclerViewMoment.adapter = adapterMom
            recyclerView3.adapter = chronoAdapter
        }
    }
}
