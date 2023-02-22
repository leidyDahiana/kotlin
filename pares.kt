fun main(){


    val personas = listOf(
        Pair("Pablo", 30),
        Pair("Ismael", 25),
        Pair("Maria", 17),
        Pair("Mariana", 20)

    ) 

    val mayoresDeEdad = personas.filter { it.second >= 18 } 
    mayoresDeEdad.forEach { println("${it.first} tiene ${it.second} años") }




}
Footer
© 2023 GitHu