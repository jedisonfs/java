package dia1;

import java.util.Scanner;

public class Dia1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ente = 0;
        int i = 0;
        int ident;
        String nom;
        String apell;
        String carrera;
//      double[] cal = new double[2];
        double caluno = 0;
        double caldos = 0;
        double prom = 0;

        System.out.println("                     UNIVERSIDAD SANTO TOMAS            ");
        System.out.print("Digite su no. Identificacion : ");
        ident = sc.nextInt();
        System.out.print("Ingrese su Nombre : ");
        nom = sc.nextLine();
        System.out.print("Ingrese sus apellidos : ");
        apell = sc.nextLine();
        System.out.println("");

        do {
            i++;

            if ((caluno >= 1) || (caluno <= 5)) {
                System.out.print("Ingrese primera calificacion  = ");
                caluno = sc.nextDouble();
            }
        } while ((caluno < 1) || (caluno > 5));

        do {
            i++;

            if ((caluno >= 1) || (caluno <= 5)) {
                System.out.print("Ingrese segunda calificacion = ");
                caldos = sc.nextDouble();
            }
        } while ((caluno < 1) || (caluno > 5));

        prom = (caluno + caldos) / 2;
        ente = (int) prom;

        switch (ente) {
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
        }

    }

}
