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
                    + "4- hacer guerra!!!!!\n"
                    + "5- salir");
            resp = sc.nextInt();
            switch (resp) {
                case 1:
                    System.out.println("Ingrese el nombre del ejercito: ");
                    String nombreE = sc.next();
                    System.out.println("Ingrese la region: ");
                    String region = sc.next();
                    System.out.println("Ingrese el presupuesto que tiene su ejercito: ");
                    String dinero = sc.next();
                    boolean vali1 = true;
                    for (int i = 0; i < dinero.length() - 1; i++) {
                        if (Character.isLetter(dinero.charAt(i))) {
                            vali1 = false;
                        }
                    }
                    while (vali1 == false) {
                        System.out.println("Ingreso una letra y no se valido");
                        System.out.println("Ingrese el presupuesto que tiene su ejercito: ");
                        dinero = sc.next();
                        vali1 = true;
                        for (int i = 0; i < dinero.length(); i++) {
                            if (Character.isLetter(dinero.charAt(i))) {
                                vali1 = false;
                            }
                        }
                    }
                    int dinero2 = Integer.parseInt(dinero);
                    lista_ejercitos.add(new Ejercito(nombreE, region, dinero2));
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
                                    soldado ejecutador = new ejecutor(nombree, lugare, edade);
                                    break;
                                default:

                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del arma: ");
                    String nombreA = sc.next();
                    System.out.println("Ingrese el alcance del arma: ");
                    String alcance = sc.next();
                    boolean vali2 = true;
                    for (int i = 0; i < alcance.length() - 1; i++) {
                        if (Character.isLetter(alcance.charAt(i))) {
                            vali2 = false;
                        }
                    }
                    while (vali2 == false) {
                        System.out.println("Ingreso una letra y no se valido");
                        System.out.println("Ingrese el alcance del arma: ");
                        alcance = sc.next();
                        vali2 = true;
                        for (int i = 0; i < alcance.length(); i++) {
                            if (Character.isLetter(alcance.charAt(i))) {
                                vali2 = false;
                            }
                        }
                    }
                    int alcance2 = Integer.parseInt(alcance);
                    System.out.println("Ingrese el precio del arma: ");
                    String precio = sc.next();
                    boolean vali3 = true;
                    for (int i = 0; i < precio.length() - 1; i++) {
                        if (Character.isLetter(precio.charAt(i))) {
                            vali3 = false;
                        }
                    }
                    while (vali3 == false) {
                        System.out.println("Ingreso una letra y no se valido");
                        System.out.println("Ingrese el precio del arma: ");
                        precio = sc.next();
                        vali3 = true;
                        for (int i = 0; i < precio.length(); i++) {
                            if (Character.isLetter(precio.charAt(i))) {
                                vali3 = false;
                            }
                        }
                    }
                    int precio2 = Integer.parseInt(precio);
                    System.out.println("Ingrese el tipo de arma:\n1)Bomba\n2)Rifle\n3)Arma Blanca");
                    int opcion_arma = sc.nextInt();
                    switch (opcion_arma) {
                        case 1:
                            System.out.println("Ingrese el material de la bomba: ");
                            String material = sc.next();
                            break;
                        case 2:
                            System.out.println("Desea que el rifle sea automatico?[s/n]: ");
                            char auto = sc.next().charAt(0);
                            break;
                        case 3:
                            System.out.println("Ingrese el material del Arma Blanca: ");
                            String materialAB = sc.next();
                            break;
                    }
                    break;
                case 4:
                    break;
                default:

            }
        }
    }

}
