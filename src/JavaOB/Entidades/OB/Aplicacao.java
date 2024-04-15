package JavaOB.Entidades.OB;

import JavaOB.Entidades.Entidades.Triangle;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Diga as medidas do triangulo X : ");
        x.a = sc.nextDouble();
        x.b= sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Diga as medidas do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

       double areaX = x.area();
       double areaY = y.area();

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Area maior: X");
        }else {
            System.out.println("Area maior: Y");
        }
        sc.close();
    }
}
