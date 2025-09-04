package com.example.careerconnect

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.careerconnect.databinding.ActivityProfileBinding
import com.google.android.material.chip.Chip

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up Toolbar with back button
        setSupportActionBar(binding.toolbarProfile)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val p = DataProvider.profile
        binding.tvName.text = p.name
        binding.tvHeadline.text = p.headline
        binding.tvAbout.text = p.about
        binding.tvMission.text = p.mission
        binding.tvPrefs.text = p.preferences

        p.skills.forEach { skill ->
            val chip = Chip(this)
            chip.text = skill
            binding.chipsSkills.addView(chip)
        }

        binding.rvExperience.layoutManager = LinearLayoutManager(this)
        binding.rvExperience.adapter = ExperienceAdapter(p.experience)

        p.achievements.forEach { achievement ->
            val tv = TextView(this)
            tv.text = "• $achievement"
            binding.llAchievements.addView(tv)
        }
    }

    // Handle back arrow press
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}
