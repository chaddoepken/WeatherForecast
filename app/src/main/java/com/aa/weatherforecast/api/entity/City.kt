package com.aa.weatherforecast.api.entity


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class City(
    @Json(name = "id")
    val id: Int,
    @Json(name = "name")
    val name: String,
    @Json(name = "coord")
    val coord: Coord,
    @Json(name = "country")
    val country: String,
    @Json(name = "population")
    val population: Int,
    @Json(name = "timezone")
    val timezone: Int
)