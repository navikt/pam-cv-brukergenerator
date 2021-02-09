package no.nav.arbeid.pam.pamcvbrukergenerator.model

import java.time.ZonedDateTime

data class Education(
        val institution: String,
        val field: String,
        val startDate: ZonedDateTime,
        val endDate: ZonedDateTime?,
        val ongoing: Boolean
        ){

}