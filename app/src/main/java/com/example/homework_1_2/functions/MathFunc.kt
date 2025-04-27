package com.example.homework_1_2.functions

class MathFunc {

    fun ucret(x: Int): Int {
        return if (x <= 50) 100 else 100 + (x - 50) * 4
    }

    fun dikdortgencevre(kısa: Int, uzun: Int): Int {
        return 2 * (kısa + uzun)
    }

    fun factorial(number: Int): Int {
        var sonuc = 1
        for (i in 1..number) {
            sonuc *= i
        }
        return sonuc
    }

    fun maasHesabi(gun: Int): Int {
        val toplamSaat = gun * 8
        val fazla = if (toplamSaat > 160) toplamSaat - 160 else 0
        val normal = toplamSaat - fazla
        return (normal * 10) + (fazla * 20)
    }

    fun Amiktari(kelime: String): Int {
        return kelime.count { it == 'a' || it == 'A' }
    }

    fun icacitoplami(kenar: Int): Int {
        return (kenar - 2) * 180
    }
}