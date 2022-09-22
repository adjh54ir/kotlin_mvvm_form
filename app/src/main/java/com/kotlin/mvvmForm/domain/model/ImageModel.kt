package com.kotlin.mvvmForm.domain.model

import com.google.gson.annotations.SerializedName

/**
 * 이미지 데이터를 관리하는 Model
 */
data class ImageModel(
    private val imageBase64: String = "",
    private val imageName: String = "",
)
/**
 * 사용자 업데이트 Response 클래스
 *
 * @property status 응답 코드
 */
data class ImageResponse(
    @SerializedName("status") val status: Int
)