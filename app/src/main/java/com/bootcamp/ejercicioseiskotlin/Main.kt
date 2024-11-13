package com.bootcamp.ejercicioseiskotlin

fun main() {
    // Crear tres cuentas bancarias
    val cuenta1 = CuentaBancaria("Lorena", 1000.0)
    val cuenta2 = CuentaBancaria("Carlos", 500.0)
    val cuenta3 = CuentaBancaria("Ana", 1500.0)

    // Realizar transacciones en la cuenta de Lorena-5
    cuenta1.deposito(200.0)
    cuenta1.retiro(1200.0)  // Retiro exitoso
    cuenta1.deposito(3000.0)
    cuenta1.deposito(500.0)
    cuenta1.retiro(3606.0)  // Retiro fallido

    // Realizar transacciones en la cuenta de Carlos-5
    cuenta2.deposito(100.0)
    cuenta2.retiro(50.0)
    cuenta2.retiro(1000.0)  // Retiro fallido
    cuenta2.deposito(200.0)
    cuenta2.retiro(200.0)

    // Realizar transacciones en la cuenta de Ana-5
    cuenta3.deposito(500.0)
    cuenta3.retiro(300.0)
    cuenta3.deposito(1000.0)
    cuenta3.retiro(2000.0)  // Retiro fallido
    cuenta3.retiro(500.0)

    // Imprimir historial de cada cuenta
    println("-----Historial de Transacciones - ${cuenta1.nombreCuenta}-----")
    cuenta1.mostrarHistorial().forEach { println(it) }
    println(" En la cuenta de:  ${cuenta1.nombreCuenta} su saldo disponible es de: ${cuenta1.mostrarSaldo()}\n")



    println("-----Historial de Transacciones - ${cuenta2.nombreCuenta}-----")
    cuenta2.mostrarHistorial().forEach { println(it) }
    println("En la cuenta de: ${cuenta2.nombreCuenta} su saldo disponible es de: $${cuenta2.mostrarSaldo()}\n")


    println("-----Historial de Transacciones - ${cuenta3.nombreCuenta}-----")
    cuenta3.mostrarHistorial().forEach { println(it) }
    println("En la cuenta de: ${cuenta3.nombreCuenta} su saldo disponible es de: $${cuenta3.mostrarSaldo()}\n")

}
