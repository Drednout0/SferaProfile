package com.bignerdranch.android.sferaprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.bignerdranch.android.sferaprofile.adapter.AdapterChrono
import com.bignerdranch.android.sferaprofile.adapter.AdapterMom
import com.bignerdranch.android.sferaprofile.adapter.UserAdapter
import com.bignerdranch.android.sferaprofile.databinding.ActivityMainBinding
import com.example.sferaproject.model.ImageModel


class MainActivity : AppCompatActivity() {
    private var profileAdapter = UserAdapter()
    private var chronoAdapter = AdapterChrono()
    private var adapterMom = AdapterMom(mutableListOf(ImageModel(""),ImageModel(""),ImageModel("")
        ,ImageModel(""),ImageModel(""),ImageModel("")))

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initAdapters()


    }

    private fun initAdapters() {
        val layoutManager = GridLayoutManager(this, 3)
        binding.recyclerView3.layoutManager = layoutManager
        binding.apply {
            recyclerViewProfile.adapter = profileAdapter
            recyclerViewMoment.adapter = adapterMom
            recyclerView3.adapter = chronoAdapter


        }


    }
}