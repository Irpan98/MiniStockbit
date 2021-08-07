package id.itborneo.ministockbit.core.domain.model


data class Crypto(
    val name: String,
    val fullname: String,
    val volume: Long,
    val volumePast24Hours: Long
)
