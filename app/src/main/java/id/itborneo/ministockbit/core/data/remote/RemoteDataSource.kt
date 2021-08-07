package id.itborneo.ministockbit.core.data.remote

import id.itborneo.ministockbit.core.data.remote.networks.ApiService
import id.itborneo.ministockbit.core.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class RemoteDataSource(private val api: ApiService) {

    private fun <T> saveCall(call: suspend () -> T) = flow {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = call()))

        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }.flowOn(Dispatchers.IO)

    //    fun getListCrypto() = saveCall { api.getListCrypto().results.toListMovieModel() }
    fun getListCrypto() = saveCall { api.getListCrypto() }


}


