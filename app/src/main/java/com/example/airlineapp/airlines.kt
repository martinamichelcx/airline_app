package com.example.airlineapp

import com.google.gson.annotations.SerializedName

data class Airlines (val id: String?,@SerializedName("name") val airline_name: String,
                     val country: String, val logo: String, val slogan: String,
                     val head_quarters: String, val website: String, val established: String)