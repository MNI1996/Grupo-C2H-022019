package main.java

import java.sql.Time


class Menu (var name: String, var description: String,var categoria: Categoria,var valorDelivery: Int,var durdacionMenu: Duracion,
            var horarios: Horarios,var tiempoEspera: Time,var precio: Double,var primeraPromocion: Promocion,var segundaPromocion:Promocion ?,
            var stock:Int, var enabled: Boolean) {

    fun calculatedPrice(cantidad: Int): Double {
        var totalPrice = when{
            segundaPromocion != null && cantidad > segundaPromocion!!.cantidadMinima-> cantidad*segundaPromocion!!.precioPromocion
            cantidad > primeraPromocion.cantidadMinima -> primeraPromocion.precioPromocion * cantidad
            else -> precio * cantidad
        }
        return totalPrice + valorDelivery
    }

}