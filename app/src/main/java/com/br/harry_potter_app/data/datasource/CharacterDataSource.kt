package com.br.harry_potter_app.data.datasource

import com.br.harry_potter_app.data.api.Service
import com.br.harry_potter_app.data.model.CharactersResponse
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

internal class CharacterDataSource(
    private val service: Service,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO,
) {
    operator fun invoke() : Flow<List<CharactersResponse>> = flow {
        emit(service.getCharacters())
    }.flowOn(dispatcher)
}