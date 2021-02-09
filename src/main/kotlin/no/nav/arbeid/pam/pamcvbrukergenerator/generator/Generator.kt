package no.nav.arbeid.pam.pamcvbrukergenerator.generator

import no.nav.arbeid.pam.pamcvbrukergenerator.model.*
import java.time.ZonedDateTime

class Generator {
    fun generate(): Skill {
        return Skill("testTittel", 123L)
    }

    fun generateCv(): CvDto{
        val workExperiences = listOf(
                WorkExperience(
                        employer = "NAV",
                        jobTitle = "Utvikler",
                        fromDate = ZonedDateTime.now().minusYears(1),
                        toDate = null,
                        ongoing = true)
        )

        val education = listOf(
                Education(
                        institution = "OsloMet",
                        field = "Anvendt datateknologi",
                        startDate = ZonedDateTime.now().minusYears(4),
                        endDate = ZonedDateTime.now().minusYears(1),
                        ongoing = false
                )
        )

        val skills = listOf(
                Skill(
                        title = "Programmering",
                        conceptId = 321L
                )
        )

        val jobWishes = JobWishesDto(
                occupations = listOf(
                        JobWishesDto.OccupationDto(
                                title = "Kokk",
                                conceptId = 234L
                        )
                ),
                locations = listOf(
                        JobWishesDto.LocationDto(
                                location = "Oslo",
                                conceptId = 345L,
                                code = "OSL"
                        )
                ),
                occupationTypes = listOf(
                        JobWishesDto.Companion.OccupationType.FAST
                ),
                workLoadTypes = listOf(
                        JobWishesDto.Companion.WorkLoadType.HELTID
                ),
                workScheduleTypes = listOf(
                        JobWishesDto.Companion.WorkScheduleType.DAGTID
                )


        )

        val cvDto = CvDto(
                workExperience = workExperiences,
                education = education,
                skills = skills,
                summary = "Sammendrag",
                jobWishes = jobWishes
        )
        return cvDto

    }
}