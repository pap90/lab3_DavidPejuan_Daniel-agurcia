package lab3_dd;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_DD {

    public static void main(String[] args) {
        ArrayList<Ejercito> lista_ejercitos = new ArrayList();
        ArrayList<Arma> lista_armas = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int resp = -1;
        while (resp != 5) {
            System.out.println("1- crear ejercitos\n"
                    + "2- crear soldado\n"
                    + "3- crear arma\n"
                    + "4- hacer guerra\n"
                    + "5- salir");
            resp = sc.nextInt();
            switch (resp) {
                case 1:

                    break;
                case 2:
                    if (lista_ejercitos.size() == 0) {
                        System.out.println("No existe ejercito");
                    } else {
                        int resp2 = -1;
                        while (resp != 0) {
                            System.out.println("0-salir\n"
                                    + "1- crear general\n"
                                    + "2- crear caballero\n"
                                    + "3- crear ejecutor");
                            resp2=sc.nextInt();
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:

            }
        }
    }

}
