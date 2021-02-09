package no.nav.arbeid.pam.pamcvbrukergenerator.generator

import no.nav.arbeid.pam.pamcvbrukergenerator.model.CvDto
import no.nav.arbeid.pam.pamcvbrukergenerator.model.Skill
import no.nav.arbeid.pam.pamcvbrukergenerator.model.WorkExperience
import java.time.ZonedDateTime

class Generator {
    fun generate(): Skill{
        return Skill("testTittel", 123L)
    }

    fun generateCv() {
        val workExperience = WorkExperience(
                employer = "NAV",
                jobTitle = "Utvikler",
                fromDate = ZonedDateTime.now().minusYears(1),
                toDate = null,
                ongoing = true)
       // val cvDto = CvDto()

    }
}