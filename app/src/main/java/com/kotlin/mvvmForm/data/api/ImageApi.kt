package com.kotlin.mvvmForm.data.api

import com.kotlin.mvvmForm.data.entity.ImageEntity
import com.kotlin.mvvmForm.data.entity.ResponseCodeEntity
import okhttp3.MultipartBody
import retrofit2.http.*

interface ImageApi {
    /**
     * GET - 방식을 통해 서버로 base64를 전송한다.
     */
    @GET("/getBase64")
    fun getBase64(@Query("imageBase64") imageBase64: String): ResponseCodeEntity

    /**
     * POST - 서버로 base64를 전송한다.
     */
    @POST("/getBase64")
    fun postBase64(@Body images: ImageEntity): ResponseCodeEntity

    /**
     * POST - 서버로 Multi-part Image 데이터를 전송한다.
     */
    @Multipart
    @POST("/postImage")
    fun postImage(@Part image: List<MultipartBody.Part>): ResponseCodeEntity

}