package com.example.careerconnect.data.impl

import com.example.careerconnect.Tip
import com.example.careerconnect.data.TipRepository

class InMemoryTipRepository : TipRepository {
    override fun getTips(): List<Tip> = listOf(
        Tip("How to Ace Your Next Technical Interview","5 min read • 127 likes"),
        Tip("Building Your Personal Brand on LinkedIn","3 min read • 89 likes")
    )
}