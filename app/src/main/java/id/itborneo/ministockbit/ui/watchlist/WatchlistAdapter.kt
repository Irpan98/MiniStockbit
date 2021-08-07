package id.itborneo.ministockbit.ui.watchlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.itborneo.ministockbit.core.domain.model.Crypto
import id.itborneo.ministockbit.databinding.ItemCryptoBinding


class WatchlistAdapter(private val listener: (Crypto) -> Unit) :
    RecyclerView.Adapter<WatchlistAdapter.ViewHolder>() {

    private var listCrypto = listOf<Crypto>()

    fun set(movies: List<Crypto>) {
        this.listCrypto = movies
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemBinding =
            ItemCryptoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listCrypto[position])
    }

    override fun getItemCount() = listCrypto.size

    inner class ViewHolder(private val itemBinding: ItemCryptoBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(item: Crypto) {
            itemBinding.apply {
                tvName.text = item.name
                tvFullname.text = item.fullname
                tvVolume.text = item.volume.toString()
                tvVolumePast24Hours.text = item.volumePast24Hours.toString()

                root.setOnClickListener {
                    listener(item)
                }
            }
        }
    }
}