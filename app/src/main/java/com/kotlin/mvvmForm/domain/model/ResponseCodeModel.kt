package com.kotlin.mvvmForm.domain.model

/**
 * 응답 코드를 관리하는 데이터 Model
 */
data class ResponseCodeModel(
    val resultCode: Int = 0,
    val resultMsg: String = ""
)
