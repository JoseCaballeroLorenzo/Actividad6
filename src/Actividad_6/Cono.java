package Actividad_6;


/**
 * Clase para calcular datos sobre conos
 */
public class Cono {

    /**
     * Base del circulo
     */
    private Circulo base;

    /**
     *Altura del cono
     */
    private float altura;

    /**
     * Color del cono
     */
    private String color;

    /**
     * Constructor para la clase Cono
     * @param cX variable X
     * @param cY variable Y
     * @param r radio del circulo
     * @param h altura del cono
     * @param color color del cono
     */
    public Cono(float cX, float cY, float r, float h, String color) { // constructor
        this.base = new Circulo(cX, cY, r);
        this.altura = h;
        this.color = color;
    }


    /**
     * Metodo para obtener la base del circulo
     * @return base del circulo
     */
    public Circulo getBase() {
        return base;
    }

    /**
     * @param base recibe la base del circulo
     */
    public void setBase(Circulo base) {
        this.base = base;
    }

    /**
     * Metodo para obtener la altura del cono
     * @return altura del cono
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura recibe la altura del cono
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Metodo para obtener el color del cono
     * @return el color del cono
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color recibe el color del cono
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Imprime el resultado de la base del cono
     * Muestra la altura del cono y el color en variables para el main
     */
    public void imprimir() {
        base.imprimir();
        System.out.println(" h=" + altura + " c=" + color);
    }
}



