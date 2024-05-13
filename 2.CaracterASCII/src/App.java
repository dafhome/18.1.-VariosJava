import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Introduce un valor entre 33 y 126 y te indicaré a que carácter corresponde.");
        System.out.print("Numero: ");

        while ((!scan.hasNextInt())) {
            System.out.print("Numero entre 33 y 126: ");
            scan.nextLine();
        }
        int num = scan.nextInt();
        while (num < 33 || num > 126) {
            System.out.print("Numero entre 33 y 126: ");
            num = scan.nextInt();
            scan.nextLine();
        }
        

        System.out.println("El caracter "+num+" es: "+(char)num);


    }
}
