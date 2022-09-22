package com.kotlin.mvvmForm.data.model

import android.security.identity.ResultData


import com.google.gson.annotations.SerializedName

/**
 * API 응답 코드를 관리하는 데이터 Model
 */
data class ImageResponse(
    @SerializedName("result_code") val resultCode: Int,
    @SerializedName("result_msg") val resultMsg: String,
)
