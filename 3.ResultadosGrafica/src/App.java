import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Partido> elecciones = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("         Elecciones Cataluña 2024         ");
        System.out.println("-----------------------------------------");
        System.out.println("Vamos a introducir los escaños de 5 partidos:");
        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.println("Nuevo Partido");
            elecciones.add(new Partido());
            System.out.print("Nombre:  ");
            // elecciones.get(i).setNombre(String.format("%1$-10s",scan.nextLine()));
            elecciones.get(i).setNombre(scan.nextLine());
            System.out.print("Escaños: ");
            elecciones.get(i).setEscanos(scan.nextInt());
            scan.nextLine();
        }
        Metodos.calculoPorcentaje(elecciones);

        // for (Partido partido : elecciones) {
        //     System.out.println(partido);
        // }

        System.out.println();
        System.out.println("         Elecciones Cataluña 2024         ");
        System.out.println("-----------------------------------------");
        System.out.println();
        for (Partido partido : elecciones) {
            int p = partido.getPorcentaje();
            System.out.print(String.format("%1$-10s",(partido.getNombre()))+": ");
            for (int i=0;i<p;i++){
                Metodos.printLentamente(">", 0, 1);
            }
            System.out.println();
        }
        System.out.println();
    }
}
