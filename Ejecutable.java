import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
       
        ArrayList<Animal> animalitos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        do {

            System.out.println("---MENU---");
            System.out.println("1. Para agregar un perro");
            System.out.println("2. Para agregar un gato");
            System.out.println("0. Para salir");

            opcion = sc.nextInt();
            sc.nextLine();


            switch (opcion) {
                case 1:
                    System.out.println("Escriba el id del perro");
                    String idPerro = sc.nextLine();
                    System.out.println("Escriba el nombre del perro");
                    String nomPerro = sc.nextLine();
                    Perro p = new Perro(idPerro, nomPerro);
                    animalitos.add(p);
                    break;
                case 2:
                    System.out.println("Escriba el id del gato");
                    String idGato = sc.nextLine();
                    System.out.println("Escriba el nombre del gato");
                    String nomGato = sc.nextLine();
                    System.out.println("Escriba la raza del gato");
                    String razGato = sc.nextLine();
                    Gato g = new Gato(idGato, nomGato, razGato);
                    animalitos.add(g);
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
            
                default:
                    break;
            }

        } while(opcion != 0);

        int contPerros = 0;
        int contGatos = 0;

        for (Animal a : animalitos) {
            if (a instanceof Perro) {
                contPerros++;
            } else if (a instanceof Gato) {
                Gato g = (Gato)a;
                g.getRaza();
                contGatos++;
            }
        }

        System.out.println("Hay " + contPerros + " perros y " + contGatos + " gatos.");

    }
}
