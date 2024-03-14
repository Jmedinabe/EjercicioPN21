package com.mycompany.ejerciciopn21;
import java.util.Scanner;
public class EjercicioPN21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la longitud del lado 1: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingresa la longitud del lado 2: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Ingresa la longitud del lado 3: ");
        double lado3 = scanner.nextDouble();

        double perimetro = lado1 + lado2 + lado3;

        double semiperimetro = perimetro / 2;

        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3)); //F´romula de Herón para hallar el área del triángulo

        System.out.println("El perímetro del triángulo es: " + perimetro);
        System.out.println("El semiperímetro es: " + semiperimetro);
        System.out.println("El área es: " + area);

        scanner.close();
    }
}
