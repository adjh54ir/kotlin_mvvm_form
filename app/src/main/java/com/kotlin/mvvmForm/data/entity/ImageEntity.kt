package com.kotlin.mvvmForm.data.entity

import com.google.gson.annotations.SerializedName

/**
 * Data Layer에서 사용하는 엔티티
 */
data class ImageEntity(
    @SerializedName("imageBase64") private val imageBase64: String = "",

    @SerializedName("imageName") private val imageName: String = "",
)
