package com.example.homework_1_2.functions

fun main() {
    val math = MathFunc()
    val temp = TempatureFunc()

    println("${temp.celsiusToFahrenheit(42.0)}")
    println("${math.icacitoplami(6)}")
    println("${math.dikdortgencevre(4, 6)}")
    println("${math.Amiktari("Android ve Kotlin")}")
    println("${math.maasHesabi(30)}")
    println("${math.ucret(40)}")
    println("${math.factorial(5)}")
}