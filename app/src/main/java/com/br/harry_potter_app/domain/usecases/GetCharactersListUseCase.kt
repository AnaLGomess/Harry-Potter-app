package com.br.harry_potter_app.domain.usecases

import com.br.harry_potter_app.domain.model.Characters
import com.br.harry_potter_app.domain.repository.CharactersRepository
import kotlinx.coroutines.flow.Flow

internal class GetCharactersListUseCase(
   private val charactersRepository: CharactersRepository
) {
    suspend operator fun invoke() : Flow<List<Characters>> {
        return charactersRepository.getCharacters()
    }
}