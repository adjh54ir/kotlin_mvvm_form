package com.kotlin.mvvmForm.domain.usecase

import com.kotlin.mvvmForm.domain.model.ImageModel
import com.kotlin.mvvmForm.domain.model.ResponseCodeModel
import com.kotlin.mvvmForm.domain.repository.ImageRepository
import okhttp3.MultipartBody
import retrofit2.http.Body
import retrofit2.http.Part

/**
 * 실제 서비스의 구현체 - 비즈니스 로직을 구현함
 */
class ImageUseCase(private val repository: ImageRepository) {

    /**
     * GET 방식을 이용한 이미지 전송 (BASE64)
     */
    suspend fun getBase64(imageBase64: String): ResponseCodeModel {
        return repository.getBase64(imageBase64)
    }

    /**
     * POST 방식을 이용한 이미지 전송 (BASE64)
     */
    suspend fun postBase64(@Body images: ImageModel): ResponseCodeModel {
        return repository.postBase64(images)
    }

    /**
     * POST 방식을 이용한 이미지 전송(Multi-Part)
     */
    suspend fun postImage(@Part images: List<MultipartBody.Part>): ResponseCodeModel {
        return repository.postImage(images);
    }
}