package com.decode.aequizzer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.Toast
import com.decode.aequizzer.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import meow.bottomnavigation.MeowBottomNavigation

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)

        

//        binding.bottomNavigation.add(MeowBottomNavigation.Model(id =  0, R.drawable.home))
//        binding.bottomNavigation.add(MeowBottomNavigation.Model(id =  1, R.drawable.brain))
//        binding.bottomNavigation.add(MeowBottomNavigation.Model(id =  2, R.drawable.notice))
//        binding.bottomNavigation.add(MeowBottomNavigation.Model(id =  3, R.drawable.profile))
        binding.bottomNavigation.setOnClickMenuListener {
            when (it.id) {
                0 -> {
                    Toast.makeText(this@MainActivity, "Home fragment", Toast.LENGTH_SHORT).show()
                }1 -> {
                    Toast.makeText(this@MainActivity, "Test fragment", Toast.LENGTH_SHORT).show()
                }2 -> {
                    Toast.makeText(this@MainActivity, "Notice fragment", Toast.LENGTH_SHORT).show()
                }3 -> {
                    Toast.makeText(this@MainActivity, "Profile fragment", Toast.LENGTH_SHORT).show()
                }else -> {
                Toast.makeText(this@MainActivity, "Home Fragment", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}