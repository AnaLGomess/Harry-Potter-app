package com.br.harry_potter_app.di

import androidx.room.Room
import com.br.harry_potter_app.data.api.Service
import com.br.harry_potter_app.data.database.AppDatabase
import com.br.harry_potter_app.data.datasource.CharacterDataSource
import com.br.harry_potter_app.data.repository.CharactersRepositoryImpl
import com.br.harry_potter_app.domain.repository.CharactersRepository
import com.br.harry_potter_app.domain.usecases.GetCharactersListUseCase
import com.br.harry_potter_app.presentation.CharactersHomeViewModel
import com.br.harry_potter_app.utils.NetworkUtils
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

const val baseUrl = "https://potterapi-fedeperin.vercel.app/"

val networkModules = module {
    single {
        NetworkUtils.getRetrofitInstance(path = baseUrl)
    }

    single { NetworkUtils.getService(get()) }
}

val dataBaseModule = module {
    single {
        Room.databaseBuilder(androidContext(), AppDatabase::class.java, "characters-database")
            .build()
    }
}

val dataModule = module {
    single {
        Service::class.java
    }
}

val domainModule = module {
    factory {
        CharacterDataSource(get())
    }
    factory<CharactersRepository> {
        CharactersRepositoryImpl(get())
    }
    factory {
        GetCharactersListUseCase(get())
    }
}

val presentationModule = module {
    factory {
        CharactersHomeViewModel(get())
    }
}