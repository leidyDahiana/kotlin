fun main() {

        val numbers = arrayOf(3, 7, 1, 9, 4, 2, 8, 5, 6)

        var sum = 0
        for (number in numbers) {
            sum += number
        }

        val prom= sum / numbers.size.toDouble()

        println("El promedio es: $prom")
    }