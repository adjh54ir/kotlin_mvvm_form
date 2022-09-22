package com.kotlin.mvvmForm.data.network;

import kotlin.jvm.Throws;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificatel;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

class SslOkHttpClient {
    fun getUnsafeOkHttpClient():OkHttpClient.Builder

    {
        return try {
        val trustAllCerts = Arrof <TrustManager> (
                object :X509TrustManager {
            @Throws(CertificateException::class)
            override fun checkClientTrusted(chain:Array<X509Certificate>,authType:
            String){
            }

            @Throws(CertificateException::class)
            override fun checkServerTrusted(chain:Array<X509Certificate>,authType:
            String){
            }

            override fun getAcceptedIssuers():Array<X509Certificate> {
                return arrayOf()
            }
        }
            )
        val sslContext = SSLContext.getInstance("TLS")
        sslContext.init(null, trustAllCerts, SecureRandom())
        val sslSocketFactory = sslContext.socketFactory
        val builder = OkHttpClient.Builder()
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        if (BuildConfig.DEBUG) {
            builder.addInterceptor(interceptor)
        }
        builder.sslSocketFactory(sslSocketFactory, trustAllCerts[0]as X509TrustManager)
        builder.hostnameVerifier {
            _, _ -> true
        }
        builder
    } catch (e:Exception){
        throw RuntimeException(e)
    }
    }
}