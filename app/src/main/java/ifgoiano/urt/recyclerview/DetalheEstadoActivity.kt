package ifgoiano.urt.recyclerview

import Estado
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ifgoiano.urt.recyclerview.R

class DetalheEstadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_estado)

        // Recuperar o objeto Estado da Intent
        val estado = intent.getParcelableExtra<Estado>("estado")

        if (estado != null) {
            // Usando findViewById para referenciar as views
            val imgBandeiraDetalhe = findViewById<ImageView>(R.id.imgBandeiraDetalhe)
            val txtNomeEstadoDetalhe = findViewById<TextView>(R.id.txtNomeEstadoDetalhe)
            val txtCapitalEstadoDetalhe = findViewById<TextView>(R.id.txtCapitalEstadoDetalhe)
            val txtPopulacaoEstadoDetalhe = findViewById<TextView>(R.id.txtPopulacaoEstadoDetalhe)
            val txtRegiaoEstadoDetalhe = findViewById<TextView>(R.id.txtRegiaoEstadoDetalhe)

            // Preencher os dados do estado
            imgBandeiraDetalhe.setImageResource(estado.bandeira)
            txtNomeEstadoDetalhe.text = estado.nome
            txtCapitalEstadoDetalhe.text = "Capital: ${estado.capital}"
            txtPopulacaoEstadoDetalhe.text = "População: ${estado.populacao}"
            txtRegiaoEstadoDetalhe.text = "Região: ${estado.regiao}"
        }
    }
}
