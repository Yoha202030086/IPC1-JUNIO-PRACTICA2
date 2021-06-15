
package src;

import java.util.Scanner;

public class memorabilia {
    Scanner e = new Scanner(System.in);

    Scanner ent = new Scanner(System.in);

    int[] idPelicula = new int[20];
    String[] nomPelicula = new String[20];
    String[] categoria = new String[20];
    int[] telefono = new int[20];
    boolean[] disponible = new boolean[20];
    boolean[] prestado = new boolean[20];
    int aux1 = 0, aux2;
    int[] idClien = new int[20];
    String[] nombreClien = new String[20];
    String[] dispon = new String[20];
    String[] tiene = new String[20];
    int[] idPeliculaPrestada = new int[20];

    public static void main(String[] args) {
        memorabilia t1 = new memorabilia();

    }

    public memorabilia() {
        int acciones, salir = 0;
        do {
            System.out.println("Elegir una accion");
            System.err.println("1. Prestamo de peliculas");
            System.out.println("2. Devolucion de pelicula");
            System.out.println("3. Mostrar las peliculas");
            System.out.println("4. Ingreso de peliculas");
            System.out.println("5. Ordenas peliculas de forma ascendente con respecto al nombre");
            System.out.println("6. Ingreso de clientes nuevos");
            System.out.println("7. Mostrar clientes");
            System.out.println("8. Reportes");
            System.out.println("9. Salir");
            System.out.println("Elegir una accion anterior");
            acciones = e.nextInt();
            switch (acciones) {

                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    insertarClientes();
                    break;

                case 7:
                    mostrarClientes();
                    break;

                case 8:
                    break;

                case 9:
                    salir = 1;

                    break;
                default:
                    System.out.println("La accion elegida no es valida");
                    break;

            }
        } while (salir != 1);
    }

    public void insertarClientes() {
        System.out.println("Insertar clientes");
        int uno = 0;
        int dos;

        for (int i = uno; i < uno + 1; i++) {

            Scanner net = new Scanner(System.in);

            if ((nombreClien[i] == null) && (idClien[i] == 0) && (telefono[i] == 0)) {
                System.out.print((i + 1) + " \033[32mIngrese el nombre del cliente:");
                nombreClien[i] = net.nextLine();
                System.out.print((i + 1) + " \033[32mIngrese su ID: ");
                idClien[i] = net.nextInt();
                if (idClien[i] != aux1) {
                    aux1 = idClien[i];
                } else {

                    System.out.println("No pueden tener el mismo id, ingrese otro");
                    System.out.print((i + 1) + " \033[32mIngrese su ID: ");
                    idClien[i] = net.nextInt();
                }

                System.out.print((i + 1) + " \033[32mIngres el telefono: ");
                telefono[i] = net.nextInt();

                if (prestado[i]) {
                    tiene[i] = "\033[33mNo teiene prestado ningun libro";
                } else {
                    tiene[i] = "\033[31mPresto un libro";
                }

                System.out.println("");
            } else {
                System.out.println("No hay espacio para mas clientes");
            }

            System.out.println("¿Quieres ingresar mas peliculas? \n1=Si\n2=No");
            dos = net.nextInt();
            if (dos == 1) {
                uno++;
            } else {
                uno = 0;
            }

        }
    }

    public void mostrarClientes() {

        System.out.println("Clientes");

        for (int i = 0; i < 20; i++) {

            System.out.println("\033[32mCLIENTE " + (i + 1));
            System.out.println("Nombre: " + nombreClien[i]);
            System.out.println("\033[32mID: " + idClien[i]);
            System.out.println("\033[32mNo. Tel: " + telefono[i]);
            if (prestado[i]) {
                tiene[i] = "\033[33mNo teiene prestado ningun libro";
                System.out.println(tiene[i]);
            } else {
                tiene[i] = "\033[31mTiene prestado un libro";
                System.out.println(tiene[i]);
            }

            prestado[i] = true;
            System.out.println("");
        }

    }
}
