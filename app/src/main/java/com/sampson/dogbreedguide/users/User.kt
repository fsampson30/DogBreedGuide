package com.sampson.dogbreedguide.users

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("display_name") val name : String,
    @SerializedName("profile_image") val imageUrl : String

)
