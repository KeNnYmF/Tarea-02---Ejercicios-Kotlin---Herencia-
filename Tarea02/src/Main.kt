package banco

// Programa principal
fun main() {
    val cuentaAhorros = CuentaAhorros(11000f, 6f)
    cuentaAhorros.consignar(500f)
    cuentaAhorros.retirar(2600f)
    cuentaAhorros.retirar(100f)
    cuentaAhorros.retirar(50f)
    cuentaAhorros.extractoMensual()
    cuentaAhorros.imprimir()

    println("\n----------------------\n")

    val cuentaCorriente = CuentaCorriente(2000f, 12f)
    cuentaCorriente.retirar(2500f) // genera sobregiro
    cuentaCorriente.consignar(300f)// reduce sobregiro
    cuentaCorriente.consignar(500f)// reduce sobregiro
    cuentaCorriente.extractoMensual()
    cuentaCorriente.imprimir()
}