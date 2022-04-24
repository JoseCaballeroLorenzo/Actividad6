package Actividad_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class mainPrisma {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Prisma prisma;
        int contador =0;
        double mayor = 0;

        Prisma[] vecPrisma = new Prisma[3];
        ArrayList<Float> lista = new ArrayList<>();


        for (int i = 0; i < vecPrisma.length; i++) {


            prisma = new Prisma(0,0);

            System.out.print("Introduzca la altura del prisma " + (i + 1) + ": ");
            prisma.setAlturaPrisma(sc.nextInt());


            System.out.print("Introduce la base del triangulo " + (i + 1) + ": ");
            prisma.setBaseTriangulo(sc.nextInt());


            vecPrisma[i] = prisma;
            lista.add(vecPrisma[i].getAreaTotal());

        }
        for (int i = 0; i < vecPrisma.length; i++) {
            System.out.println("La altura del prisma " + (i + 1) + " es " +
                    vecPrisma[i].getAlturaPrisma() + ", y la base " +
                    vecPrisma[i].getBaseTriangulo() + " y el area total es " +
                    vecPrisma[i].getAreaTotal());

        }
        lista.sort(Collections.reverseOrder());
        for (Float numero: lista) {
            System.out.println(numero);
        }
    }
}