package no.nav.arbeid.pam.pamcvbrukergenerator.model

data class JobWishesDto(
        val occupations: List<OccupationDto>,
        val locations: List<LocationDto>,
        val occupationTypes: List<OccupationType>,
        val workLoadTypes: List<WorkLoadType>,
        val workScheduleTypes: List<WorkScheduleType>
) {
    data class OccupationDto(
            val title: String,
            val conceptId: Long,
    )

    data class LocationDto(
            val location: String,
            val code: String,
            val conceptId: Long
    )

    companion object {
        enum class OccupationType(val type: String) {
            FAST("FAST"),
            VIKARIAT("VIKARIAT"),
            ENGASJEMENT("ENGASJEMENT"),
            PROSJEKT("PROSJEKT"),
            SESONG("SESONG"),
            TRAINEE("TRAINEE"),
            LAERLING("LAERLING"),
            SELVSTENDIG_NAERINGSDRIVENDE("SELVSTENDIG_NAERINGSDRIVENDE"),
            FERIEJOBB("FERIEJOBB"),
            ANNET("ANNET");
        }

        enum class WorkLoadType(val type: String) {
            HELTID("HELTID"),
            DELTID("DELTID");
        }

        enum class WorkTypes {
            WORK_TIMES,
            WORK_DAYS,
            WORK_SHIFT_TYPE
        }

        enum class WorkScheduleType(val type: String) {
            DAGTID("DAGTID") {
                override fun type() = WorkTypes.WORK_TIMES
            },
            KVELD("KVELD") {
                override fun type() = WorkTypes.WORK_TIMES
            },
            NATT("NATT") {
                override fun type() = WorkTypes.WORK_TIMES
            },
            UKEDAGER("UKEDAGER") {
                override fun type() = WorkTypes.WORK_DAYS
            },
            LOERDAG("LOERDAG") {
                override fun type() = WorkTypes.WORK_DAYS
            },
            SOENDAG("SOENDAG") {
                override fun type() = WorkTypes.WORK_DAYS
            },
            SKIFT("SKIFT") {
                override fun type() = WorkTypes.WORK_SHIFT_TYPE
            },
            VAKT("VAKT") {
                override fun type() = WorkTypes.WORK_SHIFT_TYPE
            },
            TURNUS("TURNUS") {
                override fun type() = WorkTypes.WORK_SHIFT_TYPE
            };

            abstract fun type(): WorkTypes
        }
    }
}