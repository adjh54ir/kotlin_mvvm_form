package com.kotlin.mvvmForm.data.mapper

import com.kotlin.mvvmForm.domain.model.ImageResponse

/**
 * Data 계층에서 Domain 값을 불러옴
 */
fun mapperImageResponse(imageResponse: ImageResponse): ImageResponse{
    return ImageResponse(status = imageResponse.status)
}