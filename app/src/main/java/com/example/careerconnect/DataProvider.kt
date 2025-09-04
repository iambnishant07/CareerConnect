package com.example.careerconnect

object DataProvider {
    val jobs = listOf(
        Job(
            title = "Senior Frontend Developer",
            company = "TechCorp",
            location = "San Francisco, CA",
            summary = "Looking for an experienced React developer to join our growing team...",
            tags = listOf("React", "TypeScript", "Next.js"),
            posted = "2h ago",
            salary = "\$120k - \$160k",
            applicants = "24 applicants",
            urgent = true
        ),
        Job(
            title = "Product Manager",
            company = "StartupXYZ",
            location = "Remote",
            summary = "Drive innovation and user experience across cross‑functional teams...",
            tags = listOf("Strategy", "Agile", "Analytics"),
            posted = "1d ago",
            salary = "\$100k - \$130k",
            applicants = "50 applicants"
        )
    )

    val tips = listOf(
        Tip("How to Ace Your Next Technical Interview", "5 min read • 127 likes"),
        Tip("Building Your Personal Brand on LinkedIn", "3 min read • 89 likes")
    )

    val profile = Profile(
        name = "John Doe",
        headline = "Senior Software Engineer at TechCorp Inc.",
        about = "Passionate software engineer with 6+ years of experience building scalable web applications.",
        skills = listOf("JavaScript", "React", "Node.js", "TypeScript", "AWS", "Docker"),
        preferences = "Remote • $120k–$160k • Full-time",
        experience = listOf(
            Experience(
                role = "Senior Software Engineer",
                companyLine = "TechCorp Inc. • 2022–Present • San Francisco, CA",
                desc = "Leading frontend development team, implementing scalable React applications and mentoring junior developers."
            ),
            Experience(
                role = "Full Stack Developer",
                companyLine = "StartupXYZ • 2020–2022 • New York, NY",
                desc = "Built end‑to‑end web applications using modern JavaScript frameworks and cloud technologies."
            )
        )
    )
}
