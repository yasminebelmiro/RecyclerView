import android.os.Parcelable
import kotlinx.parcelize.Parcelize

// model/Estado.kt
@Parcelize
data class Estado(
    val nome: String,
    val capital: String,
    val populacao: Int,
    val regiao: String,
    val bandeira: Int // Recurso drawable da bandeira
): Parcelable


