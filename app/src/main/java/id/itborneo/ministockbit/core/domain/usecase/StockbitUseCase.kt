package id.itborneo.ministockbit.core.domain.usecase

import androidx.lifecycle.LiveData
import id.itborneo.ministockbit.core.data.remote.response.CryptoResponse
import id.itborneo.ministockbit.core.utils.Resource

interface StockbitUseCase {

    fun getListCrypto(): LiveData<Resource<CryptoResponse>>

}