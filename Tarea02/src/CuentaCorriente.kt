package banco

class CuentaCorriente(saldo: Float, tasaAnual: Float) : Cuenta(saldo, tasaAnual) {

    private var sobregiro: Float = 0f

    override fun retirar(cantidad: Float) {
        if (cantidad <= saldo) {
            super.retirar(cantidad)
        } else {
            val diferencia = cantidad - saldo
            saldo = 0f
            sobregiro += diferencia
            numeroRetiros++
            println("Retiro con sobregiro: $cantidad, nuevo sobregiro: $sobregiro")
        }
    }

    override fun consignar(cantidad: Float) {
        super.consignar(cantidad)
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                saldo += (cantidad - sobregiro)
                sobregiro = 0f
            } else {
                sobregiro -= cantidad
            }
        }
    }

    override fun extractoMensual() {
        super.extractoMensual()
    }

    override fun imprimir() {
        println("=== Cuenta Corriente ===")
        println("Saldo: $saldo")
        println("Comisión mensual: $comisionMensual")
        println("Transacciones: ${numeroConsignaciones + numeroRetiros}")
        println("Sobregiro: $sobregiro")
    }
}
