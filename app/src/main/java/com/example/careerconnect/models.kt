package com.example.careerconnect

data class Job(
    val title: String,
    val company: String,
    val location: String,
    val summary: String,
    val tags: List<String>,
    val posted: String = "",
    val salary: String = "",
    val applicants: String = "",
    val urgent: Boolean = false
)

data class Tip(val title: String, val meta: String)

data class Experience(val role: String, val companyLine: String, val desc: String)

data class Profile(
    val name: String,
    val headline: String,
    val about: String,
    val skills: List<String>,
    val preferences: String,
    val experience: List<Experience>
)
