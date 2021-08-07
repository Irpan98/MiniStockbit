package id.itborneo.ministockbit.core.di

import id.itborneo.ministockbit.core.data.remote.RemoteDataSource
import id.itborneo.ministockbit.core.data.remote.networks.ApiConfig
import id.itborneo.ministockbit.core.domain.repository.IStockbitRepository
import id.itborneo.ministockbit.core.domain.usecase.StockbitInteractor
import id.itborneo.ministockbit.core.domain.usecase.StockbitUseCase
import id.itborneo.ministockbit.core.repository.StockbitRepository
import org.koin.dsl.module


val apiModule = module {
    single {
        ApiConfig.apiService
    }
}

val repositoryModule = module {

    single { RemoteDataSource(get()) }
    single {
        StockbitRepository(get())
    }
}

val useCaseModule = module {
    single<IStockbitRepository> {
        StockbitRepository(get())
    }

    single<StockbitUseCase> {
        StockbitInteractor(get())
    }
}
