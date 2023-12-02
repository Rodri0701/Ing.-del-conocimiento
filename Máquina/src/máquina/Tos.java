package máquina;

import java.util.Scanner;

public class Tos {

    //constructor
    public Tos() {

    }
    //fin constructor

    public int Tos() {
        int contador = 0;
        Scanner teclado = new Scanner(System.in);
        String respuesta;
        boolean continuar = true;

        while (continuar) {
            System.out.println("¿Tienes tos?");
            respuesta = teclado.next().toLowerCase();

            if (respuesta.equalsIgnoreCase("si")) {
                System.out.println("¿Qué tipo de tos tienes? seca/flemas");
                respuesta = teclado.next().toLowerCase();
                switch (respuesta) {
                    case "flemas":
                        //bloque de espera
                        try {
                            System.out.println("Analizándo...");
                            // Dormir durante 5 segundos (5000 milisegundos)
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            System.out.println("Se interrumpió la espera.");
                        }
                        //fin del bloque
                        contador += 5;
                        System.out.println("Entiendo...");
                        continuar = false;
                        break;
                    case "seca":
                        contador += 10;
                        //bloque de espera
                        try {
                            System.out.println("Analizándo...");
                            // Dormir durante 5 segundos (5000 milisegundos)
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            System.out.println("Se interrumpió la espera.");
                        }
                        //fin del bloque
                        System.out.println("Ya veo...");
                        continuar = false;
                        break;
                    default:
                        System.out.println("No se que tipo de tos es esa, ¿entonces es seca o con flemas?");
                        continuar = false;
                }
            } else {
                if (respuesta.equalsIgnoreCase("no")) {
                    //bloque de espera
                    try {
                        System.out.println("Analizándo...");
                        // Dormir durante 5 segundos (5000 milisegundos)
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("Se interrumpió la espera.");
                    }
                    //fin del bloque
                    System.out.println("Entonces sin tos, vamos bien");
                    continuar = false;
                    contador = 0;
                    break;
                } else {

                    System.out.println("Escribe si sí o si no");
                    continuar = true;
                }
            }
        }
        //System.out.println(contador);
        return contador;

    }
}
