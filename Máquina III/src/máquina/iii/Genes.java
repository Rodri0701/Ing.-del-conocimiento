package máquina.iii;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Genes {

    public int calcularAptitud(String individuo, String objetivo) {
        int aptitud = 0;
        for (int i = 0; i < individuo.length(); i++) {
            if (individuo.charAt(i) == objetivo.charAt(i)) {
                aptitud++;
            }
        }
        return aptitud;
    }

    public List<String> seleccionPadres(List<String> poblacion, String objetivo) {
        Collections.sort(poblacion, (a, b) -> Integer.compare(calcularAptitud(b, objetivo), calcularAptitud(a, objetivo)));
        return poblacion.subList(0, 2);
    }

    public String cruzar(String padre1, String padre2) {
        int puntoCruce = padre1.length() / 2; // Punto de cruce en la mitad
        return padre1.substring(0, puntoCruce) + padre2.substring(puntoCruce);
    }

    public String mutar(String individuo, double tasaMutacion) {
        StringBuilder resultado = new StringBuilder();
        for (char bit : individuo.toCharArray()) {
            if (Math.random() > tasaMutacion) {
                resultado.append(bit);
            } else {
                resultado.append((char) ('0' + (1 - (bit - '0')))); // Cambia 0 por 1 y viceversa
            }
        }
        return resultado.toString();
    }

    public List<String> aplicarMutaciones(List<String> poblacion, double tasaMutacion) {
        List<String> poblacionMutada = new ArrayList<>();
        for (String individuo : poblacion) {
            poblacionMutada.add(mutar(individuo, tasaMutacion));
        }
        return poblacionMutada;
    }

    public void maquinaEvolucionaria(String objetivo, int tamanoPoblacion, int maxIteraciones) {
        Población generador = new Población();
        List<String> poblacion = generador.Población(tamanoPoblacion, objetivo.length());
        int generacionMasApta = 0;
        int aptitudGeneracionMasApta = 0;
        String mejorIndividuo = "";

        for (int generacion = 1; generacion <= maxIteraciones; generacion++) {
            double tasaMutacion = Math.random(); // Tasa de mutación aleatoria en cada iteración
            poblacion = aplicarMutaciones(poblacion, tasaMutacion);
            poblacion.sort((a, b) -> Integer.compare(calcularAptitud(b, objetivo), calcularAptitud(a, objetivo)));

            String individuoMasApto = poblacion.get(0);
            int aptitudIndividuoMasApto = calcularAptitud(individuoMasApto, objetivo);

            System.out.println("Generación " + generacion + ": " + individuoMasApto +
                    " (Aptitud: " + aptitudIndividuoMasApto + ")");

            if (aptitudIndividuoMasApto > aptitudGeneracionMasApta) {
                generacionMasApta = generacion;
                aptitudGeneracionMasApta = aptitudIndividuoMasApto;
                mejorIndividuo = individuoMasApto;
            }

           
        }

        System.out.println("Generación más apta: " + generacionMasApta + ", Individuo más apto: " +
                mejorIndividuo + " (Aptitud: " + aptitudGeneracionMasApta + ").");
    }
}
