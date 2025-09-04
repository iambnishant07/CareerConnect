package com.example.careerconnect.data

import com.example.careerconnect.data.impl.InMemoryJobRepository
import com.example.careerconnect.data.impl.InMemoryTipRepository

object RepositoryProvider {
    val jobs: JobRepository by lazy { InMemoryJobRepository() }
    val tips: TipRepository by lazy { InMemoryTipRepository() }
}

