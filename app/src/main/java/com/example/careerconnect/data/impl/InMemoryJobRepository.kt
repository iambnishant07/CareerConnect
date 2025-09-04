package com.example.careerconnect.data.impl

import com.example.careerconnect.Job
import com.example.careerconnect.data.JobRepository

class InMemoryJobRepository : JobRepository {
    override fun getJobs(): List<Job> = listOf(
        Job(
            title = "Senior Frontend Developer",
            company = "TechCorp",
            location = "San Francisco, CA",
            summary = "Looking for an experienced React developer…",
            tags = listOf("React", "TypeScript"),
            posted = "2h ago",
            salary = "\$120k - \$160k",
            applicants = "24 applicants",
            urgent = true
        ),
        Job(
            title = "Product Manager",
            company = "StartupXYZ",
            location = "Remote",
            summary = "Drive innovation and UX across teams…",
            tags = listOf("Strategy", "Agile"),
            posted = "1d ago",
            salary = "\$100k - \$130k",
            applicants = "50 applicants"
        )
    )
}
