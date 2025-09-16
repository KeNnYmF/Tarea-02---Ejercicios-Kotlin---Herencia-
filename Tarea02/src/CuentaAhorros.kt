package banco

class CuentaAhorros(saldo: Float, tasaAnual: Float) : Cuenta(saldo, tasaAnual) {

    private var activa: Boolean = saldo >= 10000

    override fun consignar(cantidad: Float) {
        if (activa) {
            super.consignar(cantidad)
        } else {
            println("Cuenta inactiva, no es posible consignar.")
        }
    }

    override fun retirar(cantidad: Float) {
        if (activa) {
            super.retirar(cantidad)
        } else {
            println("Cuenta inactiva, no es posible retirar.")
        }
    }

    override fun extractoMensual() {
        if (numeroRetiros > 4) {
            comisionMensual += (numeroRetiros - 4) * 1000f
        }
        super.extractoMensual()
        activa = saldo >= 10000
    }

    override fun imprimir() {
        println("=== Cuenta de Ahorros ===")
        println("Saldo: $saldo")
        println("Comisión mensual: $comisionMensual")
        println("Transacciones: ${numeroConsignaciones + numeroRetiros}")
        println("Cuenta activa: $activa")
    }
}
