package id.itborneo.ministockbit.core.domain.repository

import id.itborneo.ministockbit.core.data.remote.response.CryptoResponse
import id.itborneo.ministockbit.core.utils.Resource
import kotlinx.coroutines.flow.Flow

interface IStockbitRepository {

    fun getListCrypto(): Flow<Resource<CryptoResponse>>

}