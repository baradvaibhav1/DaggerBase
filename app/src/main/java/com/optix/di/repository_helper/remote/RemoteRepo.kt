package com.optix.di.repository_helper.remote

import okhttp3.MediaType
import okhttp3.RequestBody
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RemoteRepo @Inject
constructor(private val mRetrofitApi: RetrofitApi, private val retrofit: Retrofit) : RemoteHelper {


    private fun getRequestBody(value: String): RequestBody {
        return RequestBody.create(MediaType.parse("text/plain"), value)
    }
}
