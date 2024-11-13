package com.bootcamp.ejercicioseiskotlin

class CuentaBancaria(val nombreCuenta: String,
                     var saldoDisponible: Double) {

    // Lista para almacenar el historial de transacciones
    private val historialTransacciones: MutableList<String> = mutableListOf()

    // Función para realizar depósitos
    fun deposito(monto: Double) {
        saldoDisponible += monto
        historialTransacciones.add("$nombreCuenta depositó $$monto")
        println("El deposito de $$monto fue realizado con exito en la cuenta de $nombreCuenta")
    }

    // Función para realizar retiros
    fun retiro(monto: Double) {
        if (monto <= saldoDisponible) {
            saldoDisponible -= monto
            historialTransacciones.add("$nombreCuenta retiró $$monto")
        } else {
            historialTransacciones.add("$nombreCuenta intentó retirar $$monto," +
                    "pero no tiene saldo suficiente.")
        }
    }

    // Función para mostrar el saldo disponible
    fun mostrarSaldo(): Double {
       return saldoDisponible

    }

    // Función para mostrar el historial de transacciones
    fun mostrarHistorial(): List<String> {
        return historialTransacciones
    }
}
