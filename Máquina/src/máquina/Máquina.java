package máquina; //Paquete donde esta el programa

import java.util.Scanner;

public class Máquina {

    public static void main(String[] args) {
        Scanner respuesta = new Scanner(System.in); //
        Fiebre fiebre = new Fiebre();
        Garganta garganta = new Garganta();
        Tos tos = new Tos();
        int num;
        boolean continuar = true;
        String respuestas;
        System.out.println("Hola, bienvenido a tu máquina se salud favorita");
        //bloque de espera
        try {
            System.out.println("Cargando...");
            // Dormir durante 5 segundos (5000 milisegundos)
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Se interrumpió la espera.");
        }
        //fin del bloque
        while (continuar) {
            System.out.println("¿Cómo te sientes?");
            respuestas = respuesta.next().toLowerCase();
            if (respuestas.equals("mal")) {
                //bloque para los resultados         
                num = fiebre.FiebreSi() + tos.Tos() + garganta.Garganta();
                if (num == 30){
                    System.out.println("Si, tienes laringuitis, ve al doctor");
                    continuar = false;
                }
                else{
                    if (num >= 20 && num <30){
                        System.out.println("Puede que sea solo principios de gripe");
                        continuar = false;
                          }
                    else{
                        System.out.println("Estas relativamente sano, tal vez es otra enfermedad o tal vez un susto");
                        continuar = false;
                    }
                }
            } //fin del if
            else {
                if (respuestas.equalsIgnoreCase("bien")) {
                    System.out.println("¿Deseas hacer otro análisis?");
                    respuestas = respuesta.next().toLowerCase();
                    if (respuestas.equalsIgnoreCase("no")) {
                        continuar = false;
                        System.out.println("Nos vemos!");
                        break;
                    }//pequeño if
                    else {
                        System.out.println("Escribe si sí o si no");
                        continuar = true;
                    }//pequeño else
                    //bloque de espera
                }//gran if
                else {
                    System.out.println("Escribe si bien o mal");
                }
            }//primer else
        }//ciclo while
    }//metodo main
}//fin de la clase
