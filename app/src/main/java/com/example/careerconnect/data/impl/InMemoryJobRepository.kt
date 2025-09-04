import com.example.careerconnect.Job
import com.example.careerconnect.data.JobRepository

class InMemoryJobRepository : JobRepository {
    override fun getJobs(): List<Job> = listOf(
        Job("Senior Frontend Developer","TechCorp","San Francisco, CA",
            "Looking for an experienced React developer…", listOf("React","TypeScript")),
        Job("Product Manager","StartupXYZ","Remote",
            "Drive innovation and UX across teams…", listOf("Strategy","Agile"))
    )
}