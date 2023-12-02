package Máquina2;

import java.util.Scanner;

public class Video {

    public Video() { //Constructor

    }

    public void Video() {
        Scanner tecaldo = new Scanner(System.in);
        String men;
        boolean continuar = true;
        //Bloque para carga
        try {
            System.out.println("Cargando preguntas...");
            // Simula una carga de 3 segundos
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        //Fin del bloque de carga
        while (continuar) {
            //Condicion que debe terminar cuando se llega a una respuesta
            System.out.println("¿Listo?");
            men = tecaldo.nextLine().toLowerCase();
            if (men.equalsIgnoreCase("si")) {
                System.out.println("¿Tu personaje pertenece al mundo de Marío?");
                men = tecaldo.nextLine().toLowerCase();
                if (men.equalsIgnoreCase("si")) {
                    System.out.println("¿Tu personaje ha tenido multiples empleos (doctor, pizzero, plomero? )");
                    men = tecaldo.nextLine().toLowerCase();
                    if (men.equalsIgnoreCase("si")) {
                        System.out.println("Tu personaje es Mario Bros.");
                        continuar = false;
                    } else {

                        System.out.println("¿Tu personaje es gordito, tiene una 'W' en su gorra y usa prendas amarillas?");

                        men = tecaldo.nextLine().toLowerCase();

                        if (men.equalsIgnoreCase("si")) {
                            System.out.println("Tu personaje es Wario");
                            continuar = false;
                        } else {
                            System.out.println("¿Tu personaje es verde y parece camello?");
                            men = tecaldo.nextLine().toLowerCase();
                            if (men.equalsIgnoreCase("si")) {
                                System.out.println("Tu personaje es: Yocho");
                                continuar = false;
                            } else {
                                System.out.println("No creo, ha de ser yocho intentalo otra vez");
                            }
                        }
                    }

                } else {
                    System.out.println("¿Tu personaje es un animal?");
                    men = tecaldo.nextLine().toLowerCase();
                    if (men.equalsIgnoreCase("si")) {
                        System.out.println("¿Tu personaje es de color azul?");
                        men = tecaldo.nextLine();
                        if (men.equalsIgnoreCase("si")) {
                            System.out.println("Tu personaje es Sonic");
                            continuar = false;
                        } else {
                            System.out.println("¿Tu personaje representa un animal extinto?");
                            men = tecaldo.nextLine().toLowerCase();
                            if (men.equalsIgnoreCase("si")) {
                                System.out.println("Tu personaje es el Dinosaurio de Google");
                                continuar = false;
                            } else {
                                System.out.println("Imposible, intentalo de nuevo");
                            }
                        }
                    } else {
                        System.out.println("¿Tu personaje ha sobrevivido a una infección zombie?");
                        men = tecaldo.nextLine().toLowerCase();
                        if (men.equalsIgnoreCase("si")) {
                            System.out.println("¿Tu personaje se estresa con otro personaje que solo grita su nombre?");
                            men = tecaldo.nextLine().toLowerCase();
                            if (men.equalsIgnoreCase("si")) {
                                System.out.println("Tu personaje es Leon S. Kennedy");
                                continuar = false;

                            } else {
                                System.out.println("Imposible, no hay nadie más fastidiosa que esa, intentalo otra vez");
                            }
                        }
                        else{
                            System.out.println("¿Tu personaje sobrevivió en el infierno y salió?");
                            men = tecaldo.nextLine().toLowerCase();
                            if(men.equalsIgnoreCase("si")){
                                System.out.println("¿Tu personaje es un semidios?");
                                men = tecaldo.nextLine().toLowerCase();
                                if(men.equalsIgnoreCase("si")){
                                    System.out.println("Tu personaje es Krato");
                                    continuar = false;
                                }
                                else{
                                    System.out.println("Conozco incluso a Dioses pero si no es uno ni otro pues intentalo otra vez");
                                }
                                
                            }
                            else{
                                System.out.println("¿Tu personaje es un pecador?");
                                men = tecaldo.nextLine().toLowerCase();
                                if(men.equalsIgnoreCase("si")){
                                    System.out.println("¿Tu personaje mata a otros pecados para buscar su salvación?");
                                    men = tecaldo.nextLine().toLowerCase();
                                    if(men.equalsIgnoreCase("si")){
                                        System.out.println("Tu personaje es el Penitente");
                                        continuar = false;
                                    }
                                    else{
                                        System.out.println("Que raro, intantelo otra vez");
                                    }
                                }
                                else{
                                    System.out.println("Tendrías que ser tú pero no estamos hablando de eso, intentalo otra vez");
                                }
                            }
                        }

                    }
                }

            } else {
                //Bloque de la condicion while
                if (!men.equalsIgnoreCase("si") || !men.equalsIgnoreCase("no")) {
                    System.out.println("Entonces nos vamos");
                    break;
                }
                //Bloque de la condición while
            }//fin cliclo

        }//llave metodo
    }
}
