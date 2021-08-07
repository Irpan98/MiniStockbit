package id.itborneo.ministockbit.di

import id.itborneo.ministockbit.ui.watchlist.WatchListViewModel
import kotlinx.coroutines.FlowPreview
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

@FlowPreview
val viewModelModule = module {
    viewModel {
        WatchListViewModel(get())
    }


//    viewModel {
//        MovieViewModel(get())
//    }
//    viewModel {
//        SeriesViewModel(get())
//    }
//
//    viewModel { parameter ->
//        DetailSeriesViewModel(get(), parameter.get())
//    }
//    viewModel { parameter ->
//        DetailMovieViewModel(get(), parameter.get())
//    }
}