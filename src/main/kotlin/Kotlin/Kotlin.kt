package Kotlin

import kotlin.math.PI
import kotlin.random.Random

fun main() {
    while (true) {
        println(
            " Selecciona el ejercicio que deseas ejecutar:\n1. Ejercicio 1\n2. Ejercicio 2\n3. Ejercicio 3\n4. Ejercicio 4\n5. Ejercicio 5\n6. Ejercicio 6\n7. Ejercicio 7\n8. Ejercicio 8\n9. Ejercicio 9\n10. Ejercicio 10\n11. Ejercicio 11\n12. Ejercicio 12\n13. Ejercicio 13\n14. Ejercicio 14\n0. Salir\n "
        )
        when (readln().toInt()) {
            1 -> Ejercicio1()
            2 -> Ejercicio2()
            3 -> Ejercicio3()
            4 -> Ejercicio4()
            5 -> Ejercicio5()
            6 -> Ejercicio6()
            7 -> Ejercicio7()
            8 -> Ejercicio8()
            9 -> Ejercicio9()
            10 -> Ejercicio10()
            11 -> Ejercicio11()
            12 -> Ejercicio12()
            13 -> Ejercicio13()
            14 -> Ejercicio14()
            0 -> {
                println("Saliendo...")
                return
            }

            else -> println("Opción no válida.")
        }
        println()
    }
}


fun Ejercicio1() {
    println("Escriba su nombre:")
    val nombre = readln()
    println("¡Hola $nombre!")
}

fun Ejercicio2() {
    println("Escriba un numero: ")
    val numero = readln().toInt()
    if (numero % 2 == 0) {
        println("Numero Par")
    } else {
        println("Numero Impar")
    }
}

fun Ejercicio3() {
    println("Escriba el radio de un circulo: ")
    val radio = readln().toInt()
    val area = PI * radio * radio
    println("El área es: $area")
}

fun Ejercicio4() {
    val random = Random.nextInt(1, 100)
    println("Intenta adivinar el numero entre 1 y 100")
    var numero = readln().toInt()

    while (numero != random) {
        if (numero > random) {
            println("El numero a adivinar es mas pequeño que el dado")
        }
        if (numero < random) {
            println("El numero a adivinar es mas grande que el dado")
        }
        numero = readln().toInt()
    }
    println("Enhorabuena lo adivinaste era el número: $random")
}

fun Ejercicio5() {
    println("Escriba un numero: ")
    val numero = readln().toInt()

    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
}

fun Ejercicio6() {
    var contador = 0
    for (i in 1..100) {
        contador += i
    }

    println("La suma es: $contador")
}

fun Ejercicio7() {
    println("Escriba una cadena: ")
    var cadena = readln()

    println(cadena.reversed())
}

fun Ejercicio8() {
    println("Escriba una cadena: ")
    var cadena = readln().toList()
    var contador = 0
    for (letra in cadena) {
        if (letra.toString() == "a" || letra.toString() == "e" || letra.toString() == "i" || letra.toString() == "o" || letra.toString() == "u") {
            contador++
        }
    }
    println("La cadena tiene $contador vocales")
}

fun Ejercicio9() {
    println("Escriba un numero: ")
    val numero = readln().toInt()

    if (numero <= 1) {
        println("No es primo")
    }
    for (i in 2..Math.sqrt(numero.toDouble()).toInt()) {
        if (numero % i == 0) {
            println("No es primo")
        } else {
            println("Si es primo")
        }
    }
}

fun Ejercicio10() {
    println("1. Pasar Celsius a Fahrenheit\n2. Pasar Fahrenheit a Celsius")
    var opcion = readln().toInt()
    println("Cual es la temperatura?")
    val temperatura = readln().toInt()
    when (opcion) {
        1 -> {
            println(temperatura * (9 / 5) + 32)
        }

        2 -> {
            println((temperatura - 32) * (5 / 9))
        }
    }
}

fun Ejercicio11() {
    println("Escriba un numero: ")
    val numero = readln().toInt()

    println("Los primeros $numero números de la secuencia de Fibonacci son:")

    var a = 0
    var b = 1

    for (i in 1..numero) {
        print("$a ")

        val next = a + b
        a = b
        b = next
    }
}

fun Ejercicio12() {
    println("Escriba un numero: ")
    val numero = readln().toInt()
    println(numero.toString().reversed().toInt())
}

fun Ejercicio13() {
    val anime = Anime("Algo", 10, "no se")
    println(anime.toString())
}

fun Ejercicio14() {
    val inventario = mutableListOf<Videojuego>()
    while (true) {
        println("1. Añadir videojuego\n2. Eliminar videojuego\n3. Mostrar inventario\n4. Salir")
        when (readln().toInt()) {
            1 -> {
                println("Escribe el título del videojuego:")
                val titulo = readln()
                println("Escribe la plataforma:")
                val plataforma = readln()
                println("Escribe las horas jugadas:")
                val horasJugadas = readln().toInt()
                inventario.add(Videojuego(titulo, plataforma, horasJugadas))
            }

            2 -> {
                println("Escribe el título del videojuego que deseas eliminar:")
                val titulo = readln()
                inventario.removeIf { it.titulo == titulo }
            }

            3 -> {
                if (inventario.isEmpty()) {
                    println("El inventario está vacío.")
                } else {
                    inventario.forEach { println(it) }
                }
            }

            4 -> break
            else -> println("Opción no válida.")
        }
    }
}