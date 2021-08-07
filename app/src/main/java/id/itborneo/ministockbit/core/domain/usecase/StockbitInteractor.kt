package id.itborneo.ministockbit.core.domain.usecase

import androidx.lifecycle.asLiveData
import id.itborneo.ministockbit.core.domain.repository.IStockbitRepository

class StockbitInteractor(private val stockbitRepository: IStockbitRepository) : StockbitUseCase {
    override fun getListCrypto() = stockbitRepository.getListCrypto().asLiveData()


}