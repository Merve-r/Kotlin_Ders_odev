package Ödevler
// 1. Dereceyi Fahrenheit'a çeviren fonksiyon
fun dereceToFahrenheit(celsius: Double): Double {
    return celsius * 1.8 + 32
}
// 2. Dikdörtgen çevresi hesaplayan fonksiyon
fun dikdortgenCevresi(kisaKenar: Int, uzunKenar: Int): Int {
    return 2 * (kisaKenar + uzunKenar)
}
// 3. Faktöriyel hesaplayan fonksiyon
fun faktoriyelHesapla(sayi: Int): Int {
    var sonuc = 1
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc
}
// 4. Kelimedeki 'a' harflerini sayan fonksiyon
fun aHarfSayisi(kelime: String): Int {
    var sayac = 0
    for (harf in kelime) {
        if (harf == 'a') {
            sayac++
        }
    }
    return sayac
}
// 5. Çokgenin iç açı toplamını hesaplayan fonksiyon
fun icAciToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}
// 6. Gün sayısına göre maaş hesaplayan fonksiyon
fun maasHesapla(gunSayisi: Int): Int {
    val toplamSaat = gunSayisi * 8
    return if (toplamSaat <= 160) {
        toplamSaat * 10
    } else {
        (160 * 10) + ((toplamSaat - 160) * 20)
    }
}
// 7. Kota miktarına göre ücret hesaplayan fonksiyon
fun kotaUcreti(kota: Int): Int {
    return if (kota <= 50) {
        100
    } else {
        100 + (kota - 50) * 4
    }
}

// ------------
fun main() {
    println("Derece -> Fahrenheit: ${dereceToFahrenheit(28.0)}")
    println("Dikdörtgen Çevresi: ${dikdortgenCevresi(3, 7)}")
    println("Faktöriyel: ${faktoriyelHesapla(4)}")
    println("Kelimedeki 'a' sayısı: ${aHarfSayisi("almanya")}")
    println("İç Açı Toplamı: ${icAciToplami(3)}")
    println("Maaş: ${maasHesapla(20)} ₺")
    println("Kota Ücreti: ${kotaUcreti(50)} ₺")
}


