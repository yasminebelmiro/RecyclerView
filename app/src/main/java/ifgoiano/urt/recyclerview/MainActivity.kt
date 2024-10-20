// MainActivity.kt
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ifgoiano.urt.recyclerview.DetalheEstadoActivity
import ifgoiano.urt.recyclerview.R
import ifgoiano.urt.recyclerview.R.layout.activity_main

class MainActivity : AppCompatActivity() {

    private val estados = listOf(
        Estado("Acre", "Rio Branco", 906876, "Norte", R.drawable.bandeira_acre),
        Estado("Alagoas", "Maceió", 3351543, "Nordeste", R.drawable.bandeira_alogoas),
        Estado("Amapá", "Macapá", 861773, "Norte", R.drawable.bandeira_amapa),
        Estado("Amazonas", "Manaus", 4269995, "Norte", R.drawable.bandeira_amazonas),
        Estado("Bahia", "Salvador", 14873064, "Nordeste", R.drawable.bandeira_bahia),
        Estado("Ceará", "Fortaleza", 9240580, "Nordeste", R.drawable.bandeira_ceara),
        Estado("Distrito Federal", "Brasília", 3055149, "Centro-Oeste", R.drawable.bandeira_distrito_federal),
        Estado("Espírito Santo", "Vitória", 4064052, "Sudeste", R.drawable.bandeira_espirito_santo),
        Estado("Goiás", "Goiânia", 7206589, "Centro-Oeste", R.drawable.bandeira_goias),
        Estado("Maranhão", "São Luís", 7153262, "Nordeste", R.drawable.bandeira_maranhao),
        Estado("Mato Grosso", "Cuiabá", 3567234, "Centro-Oeste", R.drawable.bandeira_mato_grosso),
        Estado("Mato Grosso do Sul", "Campo Grande", 2839188, "Centro-Oeste", R.drawable.bandeira_mato_grosso_do_sul),
        Estado("Minas Gerais", "Belo Horizonte", 21411923, "Sudeste", R.drawable.bandeira_minas_gerais),
        Estado("Pará", "Belém", 9056654, "Norte", R.drawable.bandeira_para),
        Estado("Paraíba", "João Pessoa", 4059905, "Nordeste", R.drawable.bandeira_paraiba),
        Estado("Paraná", "Curitiba", 11516840, "Sul", R.drawable.bandeira_parana),
        Estado("Pernambuco", "Recife", 9674793, "Nordeste", R.drawable.bandeira_pernambuco),
        Estado("Piauí", "Teresina", 3281480, "Nordeste", R.drawable.bandeira_piaui),
        Estado("Rio de Janeiro", "Rio de Janeiro", 17264943, "Sudeste", R.drawable.bandeira_rio_de_janeiro),
        Estado("Rio Grande do Norte", "Natal", 3534165, "Nordeste", R.drawable.bandeira_rio_grande_do_norte),
        Estado("Rio Grande do Sul", "Porto Alegre", 11466630, "Sul", R.drawable.bandeira_rio_grande_do_sul),
        Estado("Rondônia", "Porto Velho", 1845866, "Norte", R.drawable.bandeira_rondonia),
        Estado("Roraima", "Boa Vista", 652713, "Norte", R.drawable.bandeira_roraima),
        Estado("Santa Catarina", "Florianópolis", 7338473, "Sul", R.drawable.bandeira_santa_catarina),
        Estado("São Paulo", "São Paulo", 45919049, "Sudeste", R.drawable.bandeira_sao_paulo),
        Estado("Sergipe", "Aracaju", 2318822, "Nordeste", R.drawable.bandeira_sergipe),
        Estado("Tocantins", "Palmas", 1590248, "Norte", R.drawable.bandeira_tocantins)
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
        val recyclerViewEstados = findViewById<RecyclerView>(R.id.recyclerViewEstados);

        recyclerViewEstados.layoutManager = LinearLayoutManager(this)
        recyclerViewEstados.adapter = EstadoAdapter(estados) { estado ->
            val intent = Intent(this, DetalheEstadoActivity::class.java).apply {
                putExtra("estado", estado)
            }
            startActivity(intent)
        }
    }
}
