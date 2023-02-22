fun main(){
    val numbers = setOf(3, 7, 1, 9, 11, 2, 8, 5, 10)

    var sum = 0
    for (number in numbers) {
        sum += number
    }

    val prom= sum / numbers.size.toDouble()

    println("El promedio es: $prom")

    val numbers2 = numbers.sorted() 

    println("Los números en orden ascendente son: $numbers2")
