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
                        for (int i = 0; i < lista_ejercitos.size(); i++) {
                            System.out.println("Ejercito numero " + i + " " + lista_ejercitos.get(i));
                        }
                        System.out.println("seleccione el numero de ejercito: ");
                        int resp3 = sc.nextInt();
                        while (resp3 > lista_ejercitos.size() || resp3 < 0) {
                            System.out.println("posicion no valida seleccione otra");
                            resp3 = sc.nextInt();
                        }
                        while (resp != 0) {
                            System.out.println("0-salir\n"
                                    + "1- crear general\n"
                                    + "2- crear caballero\n"
                                    + "3- crear ejecutor");
                            resp2 = sc.nextInt();
                            switch (resp2) {
                                case 1:
                                    System.out.println("Ingrese el nombre del general: ");
                                    String nombreg = sc.next();
                                    System.out.println("Ingrese el lugar del general: ");
                                    String lugarg = sc.next();
                                    System.out.println("Ingrese la edad del general: ");
                                    String edadgg = sc.next();
                                    int cont = 0;
                                    for (int i = 0; i < edadgg.length() - 1; i++) {

                                        if (Character.isLetter(edadgg.charAt(i))) {
                                            cont++;
                                        }
                                    }
                                    while (cont > 0) {
                                        System.out.println("entrada no valida");
                                        cont = 0;
                                        for (int i = 0; i < edadgg.length() - 1; i++) {

                                            if (Character.isLetter(edadgg.charAt(i))) {
                                                cont++;
                                            }
                                        }
                                        edadgg = sc.next();
                                    }
                                    int edadg = Integer.parseInt(edadgg);
                                    System.out.println("Ingrese los años de experiencia: ");
                                    String añosgg = sc.next();
                                    for (int i = 0; i < añosgg.length() - 1; i++) {

                                        if (Character.isLetter(añosgg.charAt(i))) {
                                            cont++;
                                        }
                                    }
                                    while (cont > 0) {
                                        System.out.println("entrada no valida");
                                        cont = 0;
                                        for (int i = 0; i < añosgg.length() - 1; i++) {

                                            if (Character.isLetter(añosgg.charAt(i))) {
                                                cont++;
                                            }
                                        }
                                        añosgg = sc.next();
                                    }
                                    int añosg = Integer.parseInt(añosgg);
                                    soldado soldado = new general(añosg, nombreg, lugarg, edadg);
                                    lista_ejercitos.get(resp3).add_soldado(soldado);
                                    break;
                                case 2:
                                    System.out.println("Ingrese el nombre del caballero: ");
                                    String nombrec = sc.next();
                                    System.out.println("Ingrese el lugar del caballero: ");
                                    String lugarc = sc.next();
                                    System.out.println("Ingrese la edad del caballero: ");
                                    String edadcc = sc.next();
                                    cont = 0;
                                    for (int i = 0; i < edadcc.length() - 1; i++) {

                                        if (Character.isLetter(edadcc.charAt(i))) {
                                            cont++;
                                        }
                                    }
                                    while (cont > 0) {
                                        System.out.println("entrada no valida");
                                        cont = 0;
                                        for (int i = 0; i < edadcc.length() - 1; i++) {

                                            if (Character.isLetter(edadcc.charAt(i))) {
                                                cont++;
                                            }
                                        }
                                        edadcc = sc.next();
                                    }
                                    int edadc = Integer.parseInt(edadcc);
                                    soldado caballero = new caballero(nombrec, lugarc, edadc);
                                    lista_ejercitos.get(resp3).add_soldado(new caballero(nombrec, lugarc, edadc));
                                    break;
                                case 3:
                                    System.out.println("Ingrese el nombre del ejecutador: ");
                                    String nombree = sc.next();
                                    System.out.println("Ingrese el lugar: ");
                                    String lugare = sc.next();
                                    System.out.println("Ingrese la edad: ");
                                    String edadee = sc.next();
                                    cont = 0;
                                    for (int i = 0; i < edadee.length() - 1; i++) {

                                        if (Character.isLetter(edadee.charAt(i))) {
                                            cont++;
                                        }
                                    }
                                    while (cont > 0) {
                                        System.out.println("entrada no valida");
                                        cont = 0;
                                        for (int i = 0; i < edadee.length() - 1; i++) {

                                            if (Character.isLetter(edadee.charAt(i))) {
                                                cont++;
                                            }
                                        }
                                        edadee = sc.next();
                                    }
                                    int edade = Integer.parseInt(edadee);
                                    soldado ejecutador=new ejecutor( nombree, lugare, edade);
                                    break;
                                default:

                            }
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
