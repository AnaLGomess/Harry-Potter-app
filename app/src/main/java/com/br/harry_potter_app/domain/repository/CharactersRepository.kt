package com.br.harry_potter_app.domain.repository

import com.br.harry_potter_app.domain.model.Characters
import kotlinx.coroutines.flow.Flow

internal interface CharactersRepository {
    suspend fun getCharacters() : Flow<List<Characters>>
}