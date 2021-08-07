package id.itborneo.ministockbit.ui.watchlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import id.itborneo.ministockbit.core.data.remote.response.CryptoResponse
import id.itborneo.ministockbit.core.repository.StockbitRepository
import id.itborneo.ministockbit.core.utils.Resource
import kotlinx.coroutines.launch


class WatchListViewModel(private val useCase: StockbitRepository) : ViewModel() {

    private lateinit var listCrypto: LiveData<Resource<CryptoResponse>>


    init {
        initMovies()
    }

    private fun initMovies() = viewModelScope.launch {
        listCrypto = useCase.getListCrypto().asLiveData()
    }

    fun getMovies() = listCrypto

}
