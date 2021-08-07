package id.itborneo.ministockbit.core.repository

import id.itborneo.ministockbit.core.data.remote.RemoteDataSource
import id.itborneo.ministockbit.core.domain.repository.IStockbitRepository

class StockbitRepository(
    private val remoteDataSource: RemoteDataSource,
) : IStockbitRepository {

    override fun getListCrypto() = remoteDataSource.getListCrypto()

}