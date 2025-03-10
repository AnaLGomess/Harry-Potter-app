package com.br.harry_potter_app.data.mapper

import com.br.harry_potter_app.data.model.CharactersResponse
import com.br.harry_potter_app.domain.model.Characters
internal fun List<CharactersResponse>.mapToDomain() : List<Characters> {
    return map{ characters ->
        Characters(
            fullName = characters.fullName,
            nickName = characters.nickName,
            hogwartsHouse = characters.hogwartsHouse,
            interpretedBy = characters.interpretedBy,
            children = characters.children,
            image = characters.image,
            birthdate = characters.birthdate
        )
    }
}