package com.br.harry_potter_app.utils

import com.br.harry_potter_app.data.api.Service
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkUtils {
    companion object {
        fun getRetrofitInstance(path: String): Retrofit {
            return Retrofit.Builder()
                .baseUrl(path)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        fun getService(retrofit: Retrofit): Service {
            return retrofit.create(Service::class.java)
        }
    }
}