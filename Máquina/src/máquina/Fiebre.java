//paquete
package máquina;
//clase

import java.text.DecimalFormat; //importamos librerias para dar forato
import java.util.InputMismatchException;
import java.util.Scanner;//importamos librerias para leer desde el teclado

public class Fiebre {

    //constructor
    public Fiebre() {

    }

    //fin constructor
    //metodo que usare
    public int FiebreSi() {
        Scanner teclado = new Scanner(System.in);
        String Respuestas;
        int contador = 0;
        boolean continuar = true;
        float num;
        do {
            System.out.println("¿Tienes fiebre?");
            Respuestas = teclado.next().toLowerCase();
            switch (Respuestas) {
                case "si":
                    boolean errores = true;
                    while (errores) {

                        try {

                            System.out.println("¿Cúanto tienes de fiebre?");
                            num = teclado.nextFloat();
                            if (num >= 36 && num <= 37) { //temp normal
                                //bloque de espera
                                try {
                                    System.out.println("Analizándo...");
                                    // Dormir durante 5 segundos (5000 milisegundos)
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    System.out.println("Se interrumpió la espera.");
                                }
                                //fin del bloque
                                System.out.println("No hay recomendación, tu temperatura es normal");
                                contador += 0;
                                errores = false;

                            }//fin del normal  
                            else { //else del normal
                                if (num < 36) { //baja
                                    //bloque de espera
                                    try {
                                        System.out.println("Analizándo...");
                                        // Dormir durante 5 segundos (5000 milisegundos)
                                        Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                        System.out.println("Se interrumpió la espera.");
                                    }
                                    //fin del bloque
                                    System.out.println("Deberías ir al doctor, es una temperatura corporal baja");
                                    contador += 0;
                                    errores = false;
                                }//fin del if de baja
                                else { //else de baja
                                    if (num >= 38) {
                                        //bloque de espera
                                        try {
                                            System.out.println("Analizándo...");
                                            // Dormir durante 5 segundos (5000 milisegundos)
                                            Thread.sleep(2000);
                                        } catch (InterruptedException e) {
                                            System.out.println("Se interrumpió la espera.");
                                        }
                                        //fin del bloque
                                        System.out.println("Fiebre deberías ir al doctor");
                                        contador += 10;
                                        errores = false;
                                    }

                                } //fin del else de baja
                                errores = false;
                            } //fin del else del normal
                        } catch (InputMismatchException e) {
                            System.out.println("Solo numeros por favor");
                            teclado.nextLine();
                        }
                        continuar = false;
                    }

                    break;

                case "no":
                    //bloque de espera
                    try {
                        System.out.println("Analizándo...");
                        // Dormir durante 5 segundos (5000 milisegundos)
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("Se interrumpió la espera.");
                    }
                    //fin del bloque
                    System.out.println("Que bueno que no tienes, entonces siguimos...");
                    continuar = false;
                    contador += 0;
                    break;
                default:
                    System.out.println("Solo di Si o no");
            }

        } while (continuar);
        //System.out.println(contador);
        return contador;
    }
} //Metodo princiál

