package id.itborneo.ministockbit.core.data.remote.networks

import id.itborneo.ministockbit.core.data.remote.response.CryptoResponse
import retrofit2.http.GET


interface ApiService {

    @GET("data/top/totaltoptiervolfull?tsym=USD")
    suspend fun getListCrypto(): CryptoResponse

//    @GET("4/discover/tv/")
//    suspend fun getSeries(): SeriesListResponse
//
//    @GET("3/movie/{id}")
//    suspend fun getDetailMovie(
//        @Path("id") id: Int
//    ): MovieDetailModel
//
//    @GET("3/tv/{id}")
//    suspend fun getDetailSeries(
//        @Path("id") id: Int
//    ): SeriesDetailModel
//
//    @GET("3/trending/movie/day")
//    suspend fun getTrendingMovie(): MovieListResponse
//
//    @GET("3/trending/tv/day")
//    suspend fun getTrendingSeries(): SeriesListResponse
//
//    @GET("3/movie/now_playing")
//    suspend fun getPlayingNowMovies(): MovieListResponse
//
//    @GET("3/tv/airing_today")
//    suspend fun getAiringTodaySeries(): SeriesListResponse
//
//    @GET("3/movie/{id}/credits")
//    suspend fun getCreditsMovie(
//        @Path("id") id: Int
//    ): CreditsModel
//
//    @GET("3/search/movie")
//    suspend fun searchMovies(
//        @Query("query") query: String
//    ): MovieListResponse
//
//    @GET("3/search/tv")
//    suspend fun searchSeries(
//        @Query("query") query: String
//    ): SeriesListResponse
}

