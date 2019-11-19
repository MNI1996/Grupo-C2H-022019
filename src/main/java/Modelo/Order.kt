package Modelo
import main.java.GeoCalculator
import java.time.LocalDate
import Modelo.Menu
import javax.persistence.*

@Entity
@Table (name = "MenuOrder")
class Order (
            @Transient
            var date: LocalDate,
            var user: String,
            @Transient
            var provider: Provider,
            @Transient
            var listMennus: MutableList<Menu>,
            var state: String,
            var precioTotal: Double
             ) {
    var code= Math.random()
    @Transient
    val geoCalculator = GeoCalculator

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    var id:Long = 0

    fun mennuesValidation(): Boolean{
        return listMennus.isNotEmpty()
    }

/*    fun restoValidation(): Boolean {
        return provider.ubication.distancia(user.ubication) <= 20
    }*/


}