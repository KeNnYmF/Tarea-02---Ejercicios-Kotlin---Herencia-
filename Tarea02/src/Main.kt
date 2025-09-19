package banco

// Programa principal
fun main() {
    
    // Crear cuenta de ahorros
    val cuentaAhorros = CuentaAhorros(11000f, 6f)
    cuentaAhorros.consignar(500f)
    cuentaAhorros.retirar(2600f)
    cuentaAhorros.retirar(100f)
    cuentaAhorros.retirar(50f)
    cuentaAhorros.extractoMensual()
    cuentaAhorros.imprimir()

    println("\n----------------------\n")

    // Crear cuenta corriente
    val cuentaCorriente = CuentaCorriente(2000f, 12f)
    cuentaCorriente.retirar(2500f) 
    cuentaCorriente.consignar(300f)
    cuentaCorriente.consignar(500f)
    cuentaCorriente.extractoMensual()
    cuentaCorriente.imprimir()
}