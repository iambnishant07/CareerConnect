package com.example.careerconnect

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.careerconnect.data.RepositoryProvider
import com.example.careerconnect.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Top App Bar
        setSupportActionBar(binding.toolbar)

        // Job list
        binding.rvJobs.layoutManager = LinearLayoutManager(this)
        binding.rvJobs.adapter = JobAdapter(RepositoryProvider.jobs.getJobs())

        // Search button
        binding.btnSearch.setOnClickListener {
            Toast.makeText(this, "Search clicked", Toast.LENGTH_SHORT).show()
        }

        // Tips list
        binding.rvTips.layoutManager = LinearLayoutManager(this)
        binding.rvTips.adapter = TipAdapter(RepositoryProvider.tips.getTips())
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_home, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        R.id.action_profile -> {
            startActivity(Intent(this, ProfileActivity::class.java))
            true
        }
        R.id.action_logout -> {
            val intent = Intent(this, LoginActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
            startActivity(intent)
            true
        }
        else -> super.onOptionsItemSelected(item)
    }
}
