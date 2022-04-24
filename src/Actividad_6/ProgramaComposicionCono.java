package Actividad_6;


/**
 * Progarma que crea 5 objetos conos, y devuelve sus atributos
 */
public class ProgramaComposicionCono {

    /**
     * Método, que imprime el dato dado
     * @param datos devuelve datos
     */
    private static void imprimir(Object datos) {
        System.out.println(datos);
    }

    /**
     * Método main, que muestra los resultados de los datos
     * Genera número random, para el radio del círculo
     * Con el número, se halla en las clases la altura y área del cono
     * @param args devuelve resultado
     */
    public static void main(String[] args) {

        java.util.Random aleatorio = new java.util.Random();
        for (int i = 1; i <= 5; i++) {
            int radio = aleatorio.nextInt(9) + 1;
            Cono cono = new Cono(0, 0, radio, i, "Azul");
            cono.imprimir();
        }
    }
}

