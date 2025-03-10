package com.br.harry_potter_app.data.api

import com.br.harry_potter_app.data.model.CharactersResponse
import retrofit2.http.GET

interface Service {
    @GET("pt/characters")
    suspend fun getCharacters() : List<CharactersResponse>
}