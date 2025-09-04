package com.example.careerconnect.data

import com.example.careerconnect.Job

interface JobRepository {
    fun getJobs(): List<Job>
}