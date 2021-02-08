package no.nav.arbeid.pam.pamcvbrukergenerator.model

import java.time.ZonedDateTime

data class WorkExperience(
    val employer: String,
    val jobTitle: String,
    val fromDate: ZonedDateTime,
    val toDate: ZonedDateTime,
    val ongoing: Boolean
    )