package com.br.harry_potter_app.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class CharactersResponse(
    @SerializedName("fullName")
    val fullName: String,
    @SerializedName("nickname")
    val nickName: String,
    @SerializedName("hogwartsHouse")
    val hogwartsHouse: String,
    @SerializedName("interpretedBy")
    val interpretedBy: String,
    @SerializedName("children")
    val children: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("birthdate")
    val birthdate: String,
) : Parcelable
