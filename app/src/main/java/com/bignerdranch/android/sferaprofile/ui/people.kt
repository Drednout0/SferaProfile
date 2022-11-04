package com.bignerdranch.android.sferaprofile.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.recyclerview.widget.LinearLayoutManager
import com.bignerdranch.android.sferaprofile.R
import com.bignerdranch.android.sferaprofile.adapter.PeopleAdapter
import com.bignerdranch.android.sferaprofile.data.PeopleData
import com.bignerdranch.android.sferaprofile.data.PeopleImage
import com.bignerdranch.android.sferaprofile.databinding.PeopleFragmentBinding
import androidx.navigation.ui.setupWithNavController as setupWithNavController1

class people : Fragment() {

    private lateinit var binding: PeopleFragmentBinding
    private lateinit var adapter: PeopleAdapter

    private val repository = PeopleImage()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = PeopleFragmentBinding.inflate(layoutInflater)
        initRecyclerView()
        initSubscribeItem()
        initNavigation()
        return binding.root
    }

    private fun initNavigation() {
        val toolbar = binding.toolbar
        val navController = findNavController()
        val appBarConfiguration = AppBarConfiguration(navController.graph)
        toolbar.setupWithNavController1(navController, appBarConfiguration)
        toolbar.title = activity?.resources?.getText(R.string.peoples)
        toolbar.setNavigationIcon(R.drawable.back_24px)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter.peopleList = repository.getPersonList()
    }

    private fun initSubscribeItem() {
        adapter.setOnItemClickListener { position ->
            val list = adapter.peopleList.toMutableList()
            val user = list[position]
            list[position] = PeopleData(
                id = user.id,
                Name = user.Name,
                Subscribe = !user.Subscribe,
                photoUrl = user.photoUrl
            )
            adapter.peopleList = list
        }
    }

    private fun initRecyclerView() {
        val recyclerView = binding.recyclerView
        val layoutManager = LinearLayoutManager(requireContext())
        recyclerView.layoutManager = layoutManager
        adapter = PeopleAdapter(requireContext())
        recyclerView.adapter = adapter
    }
}