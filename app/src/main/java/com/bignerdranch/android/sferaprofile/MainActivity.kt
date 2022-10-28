package com.bignerdranch.android.sferaprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.bignerdranch.android.sferaprofile.adapter.AdapterChrono
import com.bignerdranch.android.sferaprofile.adapter.AdapterMom
import com.bignerdranch.android.sferaprofile.adapter.UserAdapter
import com.bignerdranch.android.sferaprofile.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
        private var profileAdapter = UserAdapter()
        private var chronoAdapter = AdapterChrono()
        private var adapterMom = AdapterMom()
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initAdapters()


    }
    private fun initAdapters() {
        val layoutManager = GridLayoutManager(this, 3)
        binding.recyclerView3.layoutManager = layoutManager
        binding.apply {
            recyclerView.adapter = profileAdapter
            recyclerView2.adapter = adapterMom
            recyclerView3.adapter = chronoAdapter


        }



    }
}