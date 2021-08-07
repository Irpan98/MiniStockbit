package id.itborneo.ministockbit.ui.watchlist

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.itborneo.ministockbit.R
import id.itborneo.moca.core.enums.Status
import org.koin.android.viewmodel.ext.android.sharedViewModel


class WatchListFragment : Fragment() {


    private val viewModel: WatchListViewModel by sharedViewModel()

    private val TAG = "WatchListFragment"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.watch_list_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        observerData()
    }

    private fun observerData() {
        viewModel.getMovies().observe(viewLifecycleOwner) {
            Log.d("observerData", it.data.toString())
            when (it.status) {
                Status.SUCCESS -> {
//                    showLoading(false)
                    val data = it.data
                    if (data != null) {
//                        adapter.set(data)
                    } else {
//                        showError()
                    }
                }
                Status.LOADING -> {
//                    showLoading(true)
                }
                Status.ERROR -> {
//                    showLoading(false)
//                    showError()
                    Log.e(TAG, "${it.status}, ${it.message} and ${it.data}")
                }
            }
        }
    }


}