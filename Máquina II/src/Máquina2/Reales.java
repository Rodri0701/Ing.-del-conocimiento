package Máquina2;

import java.util.Scanner;

public class Reales {//clase principal

    public Reales() {//constructor
    }

    public void Reales() {//clase vacia que no regresa nada
        Scanner teclado = new Scanner(System.in);
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
            System.out.println("¿Es algún deportista?");
            men = teclado.nextLine().toLowerCase();
            if (men.equalsIgnoreCase("si")) {//if

                System.out.println("¿Está relacionado con el mundo del futbol?");
                men = teclado.nextLine().toLowerCase();
                if (men.equalsIgnoreCase("si")) {//if

                    System.out.println("¿Tiene 7 balones de oro?");
                    men = teclado.nextLine().toLowerCase();
                    if (men.equalsIgnoreCase("si")) {

                        System.out.println("Tu personaje es Messi");
                        continuar = false;
                    }//
                    else {
                        System.out.println("¿Tu personaje es Mexicano?");
                        men = teclado.nextLine().toLowerCase();
                        if (men.equalsIgnoreCase("si")) {

                            System.out.println("Tu personaje es el: Chicharito");
                            continuar = false;
                        } else {
                            System.out.println("Tu personaje es el Bicho, Siiiu (CR7)");
                            continuar = false;
                        }//

                    }//
                }//
                else {//
                    System.out.println("¿Esta relacionado con el deporte del automovilismo?");
                    men = teclado.nextLine().toLowerCase();
                    if (men.equalsIgnoreCase("si")) {

                        System.out.println("Tu personaje es Chequito Pérez");
                        continuar = false;
                    }//
                    else {
                        System.out.println("¿Es un luchador profecional?");
                        men = teclado.nextLine().toLowerCase();
                        if (men.equalsIgnoreCase("si")) {

                            System.out.println("Tu personaje es Triple H");
                            continuar = false;

                        }
                    }
                }
            }// Aqui
            else {//els

                    System.out.println("¿Está relacionado con el mundo de la música?");
                    men = teclado.nextLine().toLowerCase();
                    if (men.equalsIgnoreCase("si")) {//if

                        System.out.println("¿Tu personaje canta canciones del genero 'POP' ");
                        men = teclado.nextLine().toLowerCase();
                        if (men.equalsIgnoreCase("si")) {

                            System.out.println("¿A tu personaje se le conoce como el 'Canciller del Pop'?");
                            men = teclado.nextLine().toLowerCase();
                            if (men.equalsIgnoreCase("si")) {
                                System.out.println("Tu personaje es Michelle Jacksón");
                                continuar = false;
                            }// 
                            else {
                                System.out.println("Solo existió uno y murio misteriosamente.");
                            }

                        } else {
                            if (men.equalsIgnoreCase("no")) {
                                System.out.println("¿Tu personaje canta canciones del genero 'Rock' ?");
                                men = teclado.nextLine().toLowerCase();
                                if (men.equalsIgnoreCase("si")) {

                                    System.out.println("¿La frase iconica de este personaje es: 'EEEOOOO' antes de cada canción?");
                                    men = teclado.nextLine().toLowerCase();
                                    if (men.equalsIgnoreCase("si")) {
                                        System.out.println("Tu personaje es: Freddy Mercury");
                                        continuar = false;
                                    } else {
                                        System.out.println("Imposible, a no ser que sea Tesla");
                                    }
                                } else {
                                    if (men.equalsIgnoreCase("no")) {
                                        System.out.println("¿Tu personaje canta canciones del genero de 'Valadas' ");
                                        men = teclado.nextLine().toLowerCase();
                                        if (men.equalsIgnoreCase("si")) {

                                            System.out.println("¿Tu personaje es conocido como el papá de todos? ");
                                            men = teclado.nextLine().toLowerCase();
                                            if (men.equalsIgnoreCase("si")) {

                                                System.out.println("Tu personaje es: Luis Miguel");
                                                continuar = false;
                                            } else {
                                                System.out.println("Imposible, ¿tienes papá?");
                                            }
                                        } else {
                                            System.out.println("¿Tu personaje canta corridos?");
                                            men = teclado.nextLine().toLowerCase();
                                            if (men.equalsIgnoreCase("si")) {

                                                System.out.println("Tu personaje es: Junio H.");
                                                continuar = false;
                                            }
                                        }
                                    }
                                }

                            }

                        }

                    }//fin del if
                    else {
                        System.out.println("¿Es un personaje con acontecimientos mundialmente historicos?");
                        men = teclado.nextLine().toLowerCase();//mensaje
                        if (men.equalsIgnoreCase("si")) {

                            System.out.println("¿Se dedicaba a la pintura?");
                            men = teclado.nextLine().toLowerCase();//mensaje
                            if (men.equalsIgnoreCase("si")) {
                                //Bloque para carga
                                try {
                                    System.out.println("Cargando...");
                                    // Simula una carga de 2 segundos
                                    Thread.sleep(3000);
                                } catch (InterruptedException e) {
                                    Thread.currentThread().interrupt();
                                }
                                //Fin del bloque de carga
                                System.out.println("Tu personaje es Davinci");
                                continuar = false;
                            } else {
                                System.out.println("¿Fue militar?");
                                men = teclado.nextLine().toLowerCase();//mensaje
                                if (men.equalsIgnoreCase("si")) {

                                    System.out.println("¿Le tiene miedo a los nopales y come cruazan?");
                                    men = teclado.nextLine().toLowerCase();//mensaje
                                    if (men.equalsIgnoreCase("si")) {

                                        System.out.println("Tu personaje es Napoleón");
                                        continuar = false;
                                    } else {

                                        System.out.println("¿Lo castigarón y de borracho se cayó con una bandera?");
                                        men = teclado.nextLine().toLowerCase();
                                        if (men.equalsIgnoreCase("si")) {

                                            System.out.println("Tu personaje es Juan Escutia");
                                            continuar = false;
                                        } else {

                                            System.out.println("Entonces tu personaje es Hittler");
                                            continuar = false;
                                        }//
                                    }//
                                }//
                            }//
                        }//
                        else {
                            System.out.println("¿Tu personaje es un comediante?");
                            men = teclado.nextLine().toLowerCase();
                            if (men.equalsIgnoreCase("si")) {

                                System.out.println("¿Acaso es famoso por los memes?");
                                men = teclado.nextLine().toLowerCase();
                                if (men.equalsIgnoreCase("si")) {

                                    System.out.println("Entonces tu personaje es Chems");
                                    continuar = false;

                                } else {
                                    System.out.println("¿Es un Youtuber?");
                                    men = teclado.nextLine().toLowerCase();
                                    if (men.equalsIgnoreCase("si")) {

                                        System.out.println("Tu personaje es hombre?");
                                        men = teclado.nextLine().toLowerCase();
                                        if (men.equalsIgnoreCase("si")) {

                                            System.out.println("Tu personaje es Mr.Beats");
                                            continuar = false;
                                        } else {
                                            System.out.println("Tu personaje es Karely Ruiz");
                                            continuar = false;
                                        }
                                    } else {
                                        System.out.println("¿Es mexicano?");
                                        men = teclado.nextLine().toLowerCase();
                                        if (men.equalsIgnoreCase("si")) {
                                            System.out.println("Tu personaje es Franco Escamilla");
                                            continuar = false;
                                        }
                                    }
                                }
                            } else {
                                System.out.println("¿Es acaso un personaje politico?");
                                men = teclado.nextLine().toLowerCase();
                                if (men.equalsIgnoreCase("si")) {

                                    System.out.println("¿Tu personaje fue asesinado?");
                                    men = teclado.nextLine().toLowerCase();
                                    if (men.equalsIgnoreCase("si")) {

                                        System.out.println("Tu personaje es: Colosio");
                                        continuar = false;
                                    }//
                                    else {
                                        System.out.println("Tu personaje es: Amlo");
                                        continuar = false;
                                    }
                                } else {
                                    System.out.println("Entonces no es una categoría real, intenta iniciando el programa nuevamente");
                                }
                            }
                        }//

                    }
                }
            }// fin else
        }//fin del while
    }
