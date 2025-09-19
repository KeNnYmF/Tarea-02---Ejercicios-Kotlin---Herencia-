package banco

open class Cuenta(
    protected var saldo: Float,
    protected var tasaAnual: Float
) {
    protected var numeroConsignaciones: Int = 0
    protected var numeroRetiros: Int = 0
    protected var comisionMensual: Float = 0f

    // Método para consignar dinero
    open fun consignar(cantidad: Float) {
        if (cantidad > 0) {
            saldo += cantidad
            numeroConsignaciones++
        }
    }

    // Método para retirar dinero
    open fun retirar(cantidad: Float) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad
            numeroRetiros++
        } else {
            println("Fondos insuficientes para retirar $cantidad")
        }
    }

    // Calcula interés mensual
    protected fun calcularInteresMensual(): Float {
        val interesMensual = saldo * (tasaAnual / 12 / 100)
        saldo += interesMensual
        return interesMensual
    }

    // Genera extracto mensual
    open fun extractoMensual() {
        saldo -= comisionMensual
        calcularInteresMensual()
    }

    // Imprime el estado de la cuenta
    open fun imprimir() {
        println("Saldo: $saldo")
        println("Número de consignaciones: $numeroConsignaciones")
        println("Número de retiros: $numeroRetiros")
        println("Tasa anual: $tasaAnual%")
        println("Comisión mensual: $comisionMensual")
    }
}