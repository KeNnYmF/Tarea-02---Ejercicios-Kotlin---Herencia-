package banco

open class Cuenta(
    protected var saldo: Float,
    protected var tasaAnual: Float
) {
    protected var numeroConsignaciones: Int = 0
    protected var numeroRetiros: Int = 0
    protected var comisionMensual: Float = 0f

    open fun consignar(cantidad: Float) {
        if (cantidad > 0) {
            saldo += cantidad
            numeroConsignaciones++
        }
    }

    open fun retirar(cantidad: Float) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad
            numeroRetiros++
        } else {
            println("Fondos insuficientes para retirar $cantidad")
        }
    }

    protected fun calcularInteresMensual(): Float {
        val interesMensual = saldo * (tasaAnual / 12 / 100)
        saldo += interesMensual
        return interesMensual
    }

    open fun extractoMensual() {
        saldo -= comisionMensual
        calcularInteresMensual()
    }

    open fun imprimir() {
        println("Saldo: $saldo")
        println("Número de consignaciones: $numeroConsignaciones")
        println("Número de retiros: $numeroRetiros")
        println("Tasa anual: $tasaAnual%")
        println("Comisión mensual: $comisionMensual")
    }
}