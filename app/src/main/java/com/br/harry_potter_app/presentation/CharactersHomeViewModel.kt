package com.br.harry_potter_app.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.br.harry_potter_app.domain.model.Characters
import com.br.harry_potter_app.domain.usecases.GetCharactersListUseCase
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

internal class CharactersHomeViewModel(
    private val getCharactersListUseCase: GetCharactersListUseCase
) : ViewModel() {

    private var _charactersList = MutableLiveData<List<Characters>>()
    val charactersList get() = _charactersList

    fun getCharactersList() {
        viewModelScope.launch {
            getCharactersListUseCase.invoke().collect() { charactersList ->
                _charactersList.value = charactersList
            }
        }
    }
}