package máquina;

import java.util.Scanner;

public class Garganta {

    //constructor
    public Garganta() {
    }

    //fin constructor
    //metodo
    public int Garganta() {
        Scanner teclado = new Scanner(System.in);
        String Respuesta;
        boolean continuar = true;
        int contador = 0;

        while (continuar) {

            System.out.println("¿Sientes dolor de garganta?");
            Respuesta = teclado.next().toLowerCase();
            if (Respuesta.equalsIgnoreCase("si")) {
                //bloque de espera
                try {
                    System.out.println("Analizándo...");
                    // Dormir durante 5 segundos (5000 milisegundos)
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Se interrumpió la espera.");
                }
                //fin del bloque
                System.out.println("Entiendo...");
                contador = 10;
                continuar = false;
            } else {
                if (Respuesta.equalsIgnoreCase("no")) {
                    //bloque de espera
                    try {
                        System.out.println("Analizándo...");
                        // Dormir durante 5 segundos (5000 milisegundos)
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("Se interrumpió la espera.");
                    }
                    //fin del bloque
                    System.out.println("Es bueno saber que no tienes malestar");
                    continuar = false;
                    contador = 0;
                } else {
                    System.out.println("Escribe solamente si o no");
                }

            }

        } //fin del ciclo;

        return contador;
    }//fin metodo
}
