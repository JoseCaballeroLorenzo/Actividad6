package Actividad_6;


/**
 *  Clase para calcular datos sobre el circulo del cono
 */
public class Circulo {

    /**
     * Variable X
     * Variable Y
     */
    private float x, y;

    /**
     * Radio del circulo
     */
    private float radio;

    /**
     * Constructor para la clase Circulo
     * @param cX variable x
     * @param cY variable Y
     * @param r radio del circulo
     */
    public Circulo(float cX, float cY, float r) { // constructor
        this.x = cX;
        this.y = cY;
        this.radio = r;
    }

    /**
     * Metodo para obtener la variable X
     * @return variable X
     */
    public float getX() {
        return x;
    }

    /**
     * @param x recibe la variable X
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Metodo para obtener la variable Y
     * @return variable Y
     */
    public float getY() {
        return y;
    }

    /**
     * @param y recibe la varibale Y
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * Metodo para obtener el radio del circulo
     * @return radio del circulo
     */
    public float getRadio() {
        return radio;
    }

    /**
     * @param radio recible el radio del circulo
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }

    /**
     * Metodo para calcular el area del circulo
     * Multiplicacion del numero pe
     * Por el radio al cuadrado
     * @return el area del circulo
     */
    public float area() {
        return (float) Math.PI * radio * radio;
    }

    /**
     * Metodo para imprimir los resultados
     * Resutlado de la variable X
     * Resutlado de la variable Y
     * Resutlado del radio del ciruclo
     * Resutlado del area del circulo
     */
    public void imprimir() {
        System.out.print(" x=" + x);
        System.out.print(" y=" + y);
        System.out.print(" r=" + radio);
        System.out.print(" A=" + area());
    }
}

