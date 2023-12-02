package Máquina2;

import java.util.Scanner;

public class Preguntas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Reales real = new Reales();
        Ficticios personajes = new Ficticios();
        Video vide = new Video();
        String men;
        boolean continuar = true;

        //Bloque para carga
        try {
            System.out.println("Cargando...");
            // Simula una carga de 1 segundos
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        //Fin del bloque de carga
        System.out.println("----------------------------------------------------------------------");
        System.out.println("BIENVENIDO AL MINI-AKINATOR");

        while (continuar) {
            System.out.println("¿Listo?");
            men = teclado.nextLine().toLowerCase();
            if (men.equalsIgnoreCase("si")) {
                System.out.println("¿Tu peronsaje es o fue real?");
                men = teclado.nextLine().toLowerCase();
                if (men.equalsIgnoreCase("si")) {
                    real.Reales();
                    continuar = false;

                } else {
                    System.out.println("¿Tu personaje es  de algún videojuego?");
                    men = teclado.nextLine().toLowerCase();
                    if (men.equalsIgnoreCase("si")) {
                        vide.Video();
                        continuar = false;
                    } else {
                        System.out.println("¿Tu personaje es ficticio? (anime o series)");
                        men = teclado.nextLine().toLowerCase();
                        if (men.equalsIgnoreCase("si")) {
                            personajes.ficticios();
                            continuar = false;
                        } else {
                            System.out.println("¿Seguro que conoces los personajes?");
                            System.out.println("Intetalo otra vez");
                        }

                    }

                }

            } else {
                if (men.equalsIgnoreCase("no")) {
                    System.out.println("Entonces no jugamos y nos vamos a dormir");
                    break;
                }
                System.out.println("Escribe 'si' si quieres jugar");

            }
        }//ciclo while
    }
}
