package máquina.iii;


import java.util.ArrayList;
import java.util.List;

public class Población {

    public List<String> Población(int tamanoPoblacion, int longitudCadena) {
        List<String> poblacion = new ArrayList<>();
        for (int i = 0; i < tamanoPoblacion; i++) {
            StringBuilder individuo = new StringBuilder();
            for (int j = 0; j < longitudCadena; j++) {
                individuo.append((char) ('0' + (int) (Math.random() * 2))); // Genera aleatoriamente 0 o 1
            }
            poblacion.add(individuo.toString());
        }
        return poblacion;
    }
}
