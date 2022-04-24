package Actividad_6;


public class Prisma {

    private int baseTriangulo;

    private int alturaPrisma;


    public Prisma(int baseTriangulo, int alturaPrisma) {
        this.baseTriangulo = baseTriangulo;
        this.alturaPrisma = alturaPrisma;
    }


    public int getAlturaPrisma() {
        return alturaPrisma;
    }


    public void setAlturaPrisma(int alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }


    public int getBaseTriangulo() {
        return baseTriangulo;
    }

    public void setBaseTriangulo(int baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }


    public float alturaTriangulo() {
        return (float) ((Math.sqrt(3)/2)*this.baseTriangulo);

    }


    public float areaBase() {
        return (this.baseTriangulo * this.alturaTriangulo() )/2;
    }


    public float perimetro() {
        return (this.baseTriangulo*3);
    }


    public float areaLateral() {
        return (perimetro()*this.alturaPrisma);
    }

    public float getAreaTotal() {
        return (this.areaLateral() + (2 * this.areaBase()));

    }


}
