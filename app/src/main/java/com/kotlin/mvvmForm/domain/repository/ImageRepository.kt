package com.kotlin.mvvmForm.domain.repository

import com.kotlin.mvvmForm.domain.model.ImageModel
import com.kotlin.mvvmForm.domain.model.ResponseCodeModel
import okhttp3.MultipartBody
import retrofit2.http.Body
import retrofit2.http.Part

/**
 * 서비스를 이용하기 위한 Interface
 */
interface ImageRepository {
    suspend fun getBase64(imageBase64: String): ResponseCodeModel
    suspend fun postBase64(@Body post: ImageModel): ResponseCodeModel
    suspend fun postImage(@Part images: List<MultipartBody.Part>): ResponseCodeModel
}