package Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import java.util.Random;

public class Java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(
                    " Selecciona el ejercicio que deseas ejecutar:\n 1. Ejercicio 1\n 2. Ejercicio 2\n 3. Ejercicio 3\n 4. Ejercicio 4\n 5. Ejercicio 5\n 6. Ejercicio 6\n 7. Ejercicio 7\n 8. Ejercicio 8\n 9. Ejercicio 9\n 10. Ejercicio 10\n 11. Ejercicio 11\n 12. Ejercicio 12\n 13. Ejercicio 13\n 14. Ejercicio 14\n 0. Salir "
            );

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 1 -> Ejercicio1();
                case 2 -> Ejercicio2();
                case 3 -> Ejercicio3();
                case 4 -> Ejercicio4();
                case 5 -> Ejercicio5();
                case 6 -> Ejercicio6();
                case 7 -> Ejercicio7();
                case 8 -> Ejercicio8();
                case 9 -> Ejercicio9();
                case 10 -> Ejercicio10();
                case 11 -> Ejercicio11();
                case 12 -> Ejercicio12();
                case 13 -> Ejercicio13();
                case 14 -> Ejercicio14();
                case 0 -> {
                    System.out.println("Saliendo...");
                    return;
                }
                default -> System.out.println("Opción no válida.");
            }
            System.out.println();
        }
    }

    public static void Ejercicio1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("¡Hola " + nombre + "!");
    }

    public static void Ejercicio2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un numero: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Numero Par");
        } else {
            System.out.println("Numero Impar");
        }
    }

    public static void Ejercicio3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el radio de un circulo: ");
        int radio = scanner.nextInt();
        double area = Math.PI * radio * radio;
        System.out.println("El área es: " + area);
    }

    public static void Ejercicio4() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intenta adivinar el numero entre 1 y 100");
        int numero = scanner.nextInt();

        while (numero != numeroAleatorio) {
            if (numero > numeroAleatorio) {
                System.out.println("El numero a adivinar es mas pequeño que el dado");
            } else {
                System.out.println("El numero a adivinar es mas grande que el dado");
            }
            numero = scanner.nextInt();
        }
        System.out.println("Enhorabuena lo adivinaste era el número: " + numeroAleatorio);
    }

    public static void Ejercicio5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un numero: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void Ejercicio6() {
        int contador = 0;
        for (int i = 1; i <= 100; i++) {
            contador += i;
        }
        System.out.println("La suma es: " + contador);
    }

    public static void Ejercicio7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba una cadena: ");
        String cadena = scanner.nextLine();

        String cadenaReversa = new StringBuilder(cadena).reverse().toString();
        System.out.println(cadenaReversa);
    }

    public static void Ejercicio8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba una cadena: ");
        String cadena = scanner.nextLine();
        int contador = 0;

        for (char letra : cadena.toCharArray()) {
            if ("aeiou".indexOf(letra) != -1) {
                contador++;
            }
        }
        System.out.println("La cadena tiene " + contador + " vocales");
    }

    public static void Ejercicio9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un numero: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("No es primo");
        } else {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            System.out.println(esPrimo ? "Si es primo" : "No es primo");
        }
    }

    public static void Ejercicio10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Pasar Celsius a Fahrenheit\n2. Pasar Fahrenheit a Celsius");
        int opcion = scanner.nextInt();
        System.out.println("Cual es la temperatura?");
        int temperatura = scanner.nextInt();

        if (opcion == 1) {
            System.out.println(temperatura * 9 / 5 + 32);
        } else if (opcion == 2) {
            System.out.println((temperatura - 32) * 5 / 9);
        }
    }

    public static void Ejercicio11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un numero: ");
        int numero = scanner.nextInt();

        System.out.println("Los primeros " + numero + " números de la secuencia de Fibonacci son:");

        int a = 0, b = 1;

        for (int i = 1; i <= numero; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void Ejercicio12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un numero: ");
        int numero = scanner.nextInt();

        String numeroReversa = new StringBuilder(String.valueOf(numero)).reverse().toString();
        System.out.println(Integer.parseInt(numeroReversa));
    }

    public static void Ejercicio13() {
        Kotlin.Anime anime = new Kotlin.Anime("Algo", 10, "no se");
        System.out.println(anime);
    }

    public static void Ejercicio14() {
        ArrayList<Videojuego> inventario = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Añadir videojuego\n2. Eliminar videojuego\n3. Mostrar inventario\n4. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 1:
                    System.out.println("Escribe el título del videojuego:");
                    String titulo = scanner.nextLine();
                    System.out.println("Escribe la plataforma:");
                    String plataforma = scanner.nextLine();
                    System.out.println("Escribe las horas jugadas:");
                    int horasJugadas = scanner.nextInt();
                    inventario.add(new Videojuego(titulo, plataforma, horasJugadas));
                    break;

                case 2:
                    System.out.println("Escribe el título del videojuego que deseas eliminar:");
                    String tituloEliminar = scanner.nextLine();
                    Iterator<Videojuego> iterator = inventario.iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next().getTitulo().equals(tituloEliminar)) {
                            iterator.remove();
                        }
                    }
                    break;

                case 3:
                    if (inventario.isEmpty()) {
                        System.out.println("El inventario está vacío.");
                    } else {
                        for (Videojuego v : inventario) {
                            System.out.println(v);
                        }
                    }
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}

