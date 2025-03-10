package com.br.harry_potter_app.data.repository

import com.br.harry_potter_app.data.datasource.CharacterDataSource
import com.br.harry_potter_app.domain.model.Characters
import com.br.harry_potter_app.domain.repository.CharactersRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import com.br.harry_potter_app.data.mapper.mapToDomain

internal class CharactersRepositoryImpl(
    private val dataSource: CharacterDataSource
) : CharactersRepository {
    override suspend fun getCharacters(): Flow<List<Characters>> {
        return dataSource.invoke().map { it.mapToDomain() }
    }
}