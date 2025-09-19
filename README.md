# Sistema de Cuentas Bancarias en Kotlin

## 📖 Descripción
Este proyecto implementa un sistema de gestión de cuentas bancarias en Kotlin. El sistema incluye dos tipos de cuentas: **Cuenta de Ahorros** y **Cuenta Corriente**, cada una con comportamientos específicos como consignaciones, retiros, intereses y comisiones mensuales.

## 👥 Autores
- **Kenny Danny Martinez Fuentes** - 22200206
- **Felipe Santiago Triveño Daza** - 22200051

## 🛠️ Estructura del Proyecto

### Clases

1. **Cuenta**: Clase base que define los atributos y métodos comunes para todas las cuentas bancarias, como `saldo`, `tasaAnual`, `consignar()`, `retirar()`, y `extractoMensual()`.
   
2. **CuentaAhorros**: Extiende la clase `Cuenta` y agrega un comportamiento específico relacionado con el estado activo de la cuenta (requiere un saldo mínimo para estar activa), las comisiones por retiros adicionales y la generación de intereses mensuales.

3. **CuentaCorriente**: Extiende la clase `Cuenta` y permite sobregiros (retiros superiores al saldo), gestionando el balance de sobregiro y aplicando cargos por el uso de dicho servicio.

### Métodos Principales

- **consignar(cantidad: Float):** Realiza un depósito en la cuenta (si la cuenta está activa o no tiene sobregiro).
- **retirar(cantidad: Float):** Realiza un retiro de la cuenta, permitiendo sobregiros en el caso de la cuenta corriente.
- **extractoMensual():** Calcula los intereses mensuales y aplica comisiones por transacciones o retiros.
- **imprimir():** Muestra un resumen con el saldo, las transacciones y otros detalles de la cuenta.

## 💻 Requisitos

- Kotlin 1.5 o superior
- IDE recomendado: IntelliJ IDEA o Android Studio

## 🚀 Instrucciones de Ejecución

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/KeNnYmF/Tarea-02---Ejercicios-Kotlin---Herencia-
