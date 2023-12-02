package Máquina2;

import java.util.Scanner;

public class Ficticios {

    public Ficticios() { //contructor
    }

    public void ficticios() {
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
            System.out.println("¿Tu personaje es un animal marino?");
            men = teclado.nextLine().toLowerCase();
            if (men.equalsIgnoreCase("si")) {
                System.out.println("¿Tu personaje pertenece a una caricatura?");
                men = teclado.nextLine().toLowerCase();
                if (men.equalsIgnoreCase("si")) {
                    System.out.println("¿Tu personaje es la estrella sin ser el protagonista de la serie?");
                    men = teclado.nextLine().toLowerCase();
                    if (men.equalsIgnoreCase("si")) {
                        System.out.println("Tu personaje es: Patricio estrella");
                        continuar = false;
                    } else {
                        System.out.println("Imposible solo hay una estrella del mar sin ser el protagonista"
                                + " intentalo de nuevo");
                    }
                } else {
                    System.out.println("¿Tu personaje es cuadrado y amarillo?");
                    men = teclado.nextLine().toLowerCase();
                    if (men.equalsIgnoreCase("si")) {
                        System.out.println("Tu personaje es el Bob Esponja");
                        continuar = false;
                    } else {
                        System.out.println("¿Apoco conoces otro que sea cuadrado?"
                                + " intentalo otra vez");
                    }
                }
            } else {
                if (men.equalsIgnoreCase("no")) {
                    System.out.println("¿Tu personaje se considera apto para toda la familia?");
                    men = teclado.nextLine().toLowerCase();
                    if (men.equalsIgnoreCase("si")) {
                        System.out.println("¿Tu personaje es parte de la Familia de Disney?");
                        men = teclado.nextLine().toLowerCase();
                        if (men.equalsIgnoreCase("si")) {
                            System.out.println("¿Tu personaje es parte de la familia de Marvel?");
                            men = teclado.nextLine().toLowerCase();
                            if (men.equalsIgnoreCase("si")) {
                                System.out.println("¿Tu personaje tiene superpoderes?");
                                men = teclado.nextLine().toLowerCase();
                                if (men.equalsIgnoreCase("si")) {
                                    System.out.println("¿Sus poderes son gracias auna gema");
                                    men = teclado.nextLine().toLowerCase();
                                    if (men.equalsIgnoreCase("si")) {
                                        System.out.println("¿Tu personaje es hombre?");
                                        men = teclado.nextLine().toLowerCase();
                                        if (men.equalsIgnoreCase("si")) {
                                            System.out.println("Tu personaje es Dr. Strange");
                                            continuar = false;
                                        } else {
                                            System.out.println("Tu personaja es Wanda");
                                            continuar = false;
                                        }
                                    } else {
                                        System.out.println("¿Tu personaje obtuvo sus poderes por una accidente?");
                                        men = teclado.nextLine().toLowerCase();
                                        if (men.equalsIgnoreCase("si")) {
                                            System.out.println("Tu personaje es la Mole.");
                                            continuar = false;
                                        } else {
                                            System.out.println("¿Acaso fue picado por un aracnido?");
                                            men = teclado.nextLine().toLowerCase();
                                            if (men.equalsIgnoreCase("si")) {
                                                System.out.println("Tu personaje es: Spiderman");
                                            } else {
                                                System.out.println("Debes ser tu, pero eso no funciona en la vida real, intentalo ontra vez");
                                            }
                                        }
                                    }
                                } else { //Si dice que no tiene poderes
                                    System.out.println("¿Tu personaje esta inspirado una cultura?");
                                    men = teclado.nextLine().toLowerCase();
                                    if (men.equalsIgnoreCase("si")) {
                                        System.out.println("¿Tu personaje es mujer?");
                                        men = teclado.nextLine().toLowerCase();
                                        if (men.equalsIgnoreCase("si")) {
                                            System.out.println("Tu personaje es: Mamá Coco.");
                                            continuar = false;
                                        } else {
                                            System.out.println("Tu personaje es: Migúel");
                                            continuar = false;
                                        }
                                    } else {
                                        System.out.println("¿Tu personaje representa a una marca?");
                                        men = teclado.nextLine().toLowerCase();
                                        if (men.equalsIgnoreCase("si")) {
                                            System.out.println("¿Tu personaje es conocido por ser, la campeona de los precios bajos?");
                                            men = teclado.nextLine().toLowerCase();
                                            if (men.equalsIgnoreCase("si")) {
                                                System.out.println("Tu personaje es Mamá lucha");
                                                continuar = false;
                                            } else {
                                                System.out.println("¿Tu personaje es un doctor chistoso?");
                                                men = teclado.nextLine().toLowerCase();
                                                if (men.equalsIgnoreCase("si")) {
                                                    System.out.println("Tu personaje es el Doctor Simi");
                                                    continuar = false;
                                                } else {
                                                    System.out.println("Será tu tio, pero no, intentalo de nuevo");
                                                }
                                            }
                                        } else {
                                            System.out.println("¿Tu peronsaje es iconico de una pelicula?");
                                            men = teclado.nextLine().toLowerCase();
                                            if (men.equalsIgnoreCase("si")) {
                                                System.out.println("¿Tu peronsaje salvo china?");
                                                men = teclado.nextLine().toLowerCase();
                                                if (men.equalsIgnoreCase("si")) {
                                                    System.out.println("Tu personaje es Mulan");
                                                    continuar = false;

                                                } else {
                                                    System.out.println("¿Tu personaje es un animal?");
                                                    men = teclado.nextLine().toLowerCase();
                                                    if (men.equalsIgnoreCase("si")) {
                                                        System.out.println("Tu personaje es Bambi");
                                                        continuar = false;
                                                    } else {
                                                        System.out.println("Tu peronsaje es un ser extraño de dudosa procedencia?");
                                                        men = teclado.nextLine().toLowerCase();
                                                        if (men.equalsIgnoreCase("si")) {
                                                            System.out.println("Tu peronsaje es: El come galletas");
                                                            continuar = false;
                                                        } else {
                                                            System.out.println("Tendría que ser tus papeles de adpción pero no"
                                                                    + " intentalo otra vez");
                                                        }
                                                    }
                                                }
                                            }
                                            else{
                                                System.out.println("No pensamos en la misma caterogirias, intentalo otra vez.");
                                            }
                                        }

                                    }
                                }
                            }
                            else{
                                System.out.println("Estoy seguro que te equivocaste, intentalo otra vez");   
                            }
                        } else {
                            System.out.println("¿Tu personaje pertenece a la familia de WarnerBros?");
                            men = teclado.nextLine().toLowerCase();
                            if (men.equalsIgnoreCase("si")) {
                                System.out.println("¿Tu personaje es parte del mundo de DC");
                                men = teclado.nextLine().toLowerCase();
                                if(men.equalsIgnoreCase("si")){
                                    System.out.println("¿Tu personaje tiene poderes?");
                                    men = teclado.nextLine().toLowerCase();
                                    if(men.equalsIgnoreCase("si")){
                                        System.out.println("Tu personaje es Batman.");
                                        continuar = false;
                                        
                                    }
                                    else{
                                        System.out.println("¿Y la inteligencia no es poder?"
                                                + " intentalo otra vez");
                                    }
                                }
                            } else {
                                System.out.println("Naaa me estas bromiendo, intenta otra vez");
                            }
                        }
                    } else {
                        if (men.equalsIgnoreCase("no")) {
                            System.out.println("¿Tu personaje es de algún anime?");
                            men = teclado.nextLine().toLowerCase();
                            if (men.equalsIgnoreCase("si")) {
                                System.out.println("¿A tu personaje le gusta pelear?");
                                men = teclado.nextLine().toLowerCase();
                                if(men.equalsIgnoreCase("si")){
                                    System.out.println("¿A tu personaje le regalan transformaciones?");
                                    men = teclado.nextLine().toLowerCase();
                                    if(men.equalsIgnoreCase("si")){
                                        System.out.println("Tu personaje es Goku");
                                        continuar =false;
                                    }else{
                                        System.out.println("¿Tu personaje tiene la frase 'Date baio'");
                                        men=teclado.nextLine().toLowerCase();
                                        if(men.equalsIgnoreCase("si")){
                                            System.out.println("Tu peronsaje es el Naruto");
                                            continuar=false;
                                        }
                                        else{
                                            System.out.println("¿Tu peronsaje es pirata?");
                                            men=teclado.nextLine().toLowerCase();
                                        if(men.equalsIgnoreCase("si")){
                                            System.out.println("Tu personaje es Luffy");
                                            continuar =false;
                                        }
                                        else{
                                            System.out.println("Naaaaa, intentalo otra vez");
                                        }
                                        }
                                    }
                                }
                            } else {
                                if (men.equalsIgnoreCase("no")) {
                                    System.out.println("¿Tu peronsaje es alguna deidad?");
                                    men = teclado.nextLine().toLowerCase();
                                    if (men.equalsIgnoreCase("si")) {
                                        System.out.println("Tu personaje es Belsebu");
                                    } else {
                                         System.out.println("Debes conocer el personaje que estas pensando, intentalo otra vez");
                                         
                                    }
                                }
                            }
                        }
                    }
                }

            }

        }//fin del ciclo while

    }

}
