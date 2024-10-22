package ifgoiano.urt.recyclerview
import Estado
import EstadoAdapter
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val estados = listOf(
            Estado("Acre", "Rio Branco", "0.9 milhões", "Norte", R.drawable.bandeira_acre),
            Estado("Alagoas", "Maceió", "3.3 milhões", "Nordeste", R.drawable.bandeira_alogoas),
            Estado("Amapá", "Macapá", "0.8 milhões", "Norte", R.drawable.bandeira_amapa),
            Estado("Amazonas", "Manaus", "4.2 milhões", "Norte", R.drawable.bandeira_amazonas),
            Estado("Bahia", "Salvador", "15.2 milhões", "Nordeste", R.drawable.bandeira_bahia),
            Estado("Ceará", "Fortaleza", "9.2 milhões", "Nordeste", R.drawable.bandeira_ceara),
            Estado("Distrito Federal", "Brasília", "3.0 milhões", "Centro-Oeste", R.drawable.bandeira_distrito_federal),
            Estado("Espírito Santo", "Vitória", "4.0 milhões", "Sudeste", R.drawable.bandeira_espirito_santo),
            Estado("Goiás", "Goiânia", "7.2 milhões", "Centro-Oeste", R.drawable.bandeira_goias),
            Estado("Maranhão", "São Luís", "7.1 milhões", "Nordeste", R.drawable.bandeira_maranhao),
            Estado("Mato Grosso", "Cuiabá", "3.5 milhões", "Centro-Oeste", R.drawable.bandeira_mato_grosso),
            Estado("Mato Grosso do Sul", "Campo Grande", "2.8 milhões", "Centro-Oeste", R.drawable.bandeira_mato_grosso_do_sul),
            Estado("Minas Gerais", "Belo Horizonte", "21.3 milhões", "Sudeste", R.drawable.bandeira_minas_gerais),
            Estado("Pará", "Belém", "8.7 milhões", "Norte", R.drawable.bandeira_para),
            Estado("Paraíba", "João Pessoa", "4.0 milhões", "Nordeste", R.drawable.bandeira_paraiba),
            Estado("Paraná", "Curitiba", "11.5 milhões", "Sul", R.drawable.bandeira_parana),
            Estado("Pernambuco", "Recife", "9.6 milhões", "Nordeste", R.drawable.bandeira_pernambuco),
            Estado("Piauí", "Teresina", "3.3 milhões", "Nordeste", R.drawable.bandeira_piaui),
            Estado("Rio de Janeiro", "Rio de Janeiro", "17.4 milhões", "Sudeste", R.drawable.bandeira_rio_de_janeiro),
            Estado("Rio Grande do Norte", "Natal", "3.5 milhões", "Nordeste", R.drawable.bandeira_rio_grande_do_norte),
            Estado("Rio Grande do Sul", "Porto Alegre", "11.3 milhões", "Sul", R.drawable.bandeira_rio_grande_do_sul),
            Estado("Rondônia", "Porto Velho", "1.8 milhões", "Norte", R.drawable.bandeira_rondonia),
            Estado("Roraima", "Boa Vista", "0.6 milhões", "Norte", R.drawable.bandeira_roraima),
            Estado("Santa Catarina", "Florianópolis", "7.3 milhões", "Sul", R.drawable.bandeira_santa_catarina),
            Estado("São Paulo", "São Paulo", "45.9 milhões", "Sudeste", R.drawable.bandeira_sao_paulo),
            Estado("Sergipe", "Aracaju", "2.3 milhões", "Nordeste", R.drawable.bandeira_sergipe),
            Estado("Tocantins", "Palmas", "1.6 milhões", "Norte", R.drawable.bandeira_tocantins)

        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewEstados)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EstadoAdapter(estados) { estado ->
            val intent = Intent(this, DetalheEstadoActivity::class.java)
            intent.putExtra("estado", estado)
            startActivity(intent)
        }
    }
}