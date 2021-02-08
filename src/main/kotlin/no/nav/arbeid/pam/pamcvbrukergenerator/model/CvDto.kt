package no.nav.arbeid.pam.pamcvbrukergenerator.model

data class CvDto(
        val workExperience: List<WorkExperience>,
        val education: List<Education>,
        val summary: String,
        val skills: List<Skill>,
        val jobWishes: JobWishesDto
        ){
}