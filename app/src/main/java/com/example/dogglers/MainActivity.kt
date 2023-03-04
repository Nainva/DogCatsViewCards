/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dogglers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Setup view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Launch the VerticalListActivity on verticalBtn click
        binding.verticalBtn.setOnClickListener { launchDog() }

        // Launch the HorizontalListActivity on horizontalBtn click
        binding.horizontalBtn.setOnClickListener { launchCat() }


    }



    private fun launchDog() {
        listIntent = Intent(this, MainActivity2::class.java)
        startActivity(listIntent)
    }

    private fun launchCat() {
        listIntent = Intent(this, MainActivity3::class.java)
        startActivity(listIntent)
    }



}
