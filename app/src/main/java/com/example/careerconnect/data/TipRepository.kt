package com.example.careerconnect.data

import com.example.careerconnect.Tip

interface TipRepository { fun getTips(): List<Tip> }