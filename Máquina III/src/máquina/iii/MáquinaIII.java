package máquina.iii;

public class MáquinaIII {

    public static void main(String[] args) {
        String objetivo = "11010101";
        int tamanoPoblacion = 100;
        int maxIteraciones = 100;

        Genes maquina = new Genes();
        maquina.maquinaEvolucionaria(objetivo, tamanoPoblacion, maxIteraciones);
    }
}

