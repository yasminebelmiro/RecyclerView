
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ifgoiano.urt.recyclerview.R

class EstadoAdapter(private val estados: List<Estado>, private val onClick: (Estado) -> Unit) :
    RecyclerView.Adapter<EstadoAdapter.EstadoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EstadoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_estado, parent, false)
        return EstadoViewHolder(view)
    }

    override fun onBindViewHolder(holder: EstadoViewHolder, position: Int) {
        val estado = estados[position]
        holder.imgBandeira.setImageResource(estado.bandeira)
        holder.txtNomeEstado.text = estado.nome

        holder.itemView.setOnClickListener { onClick(estado) }
    }

    override fun getItemCount() = estados.size

    class EstadoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgBandeira: ImageView = itemView.findViewById(R.id.imgBandeira)
        val txtNomeEstado: TextView = itemView.findViewById(R.id.txtNomeEstado)
    }
}
