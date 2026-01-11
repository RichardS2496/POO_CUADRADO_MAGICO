import java.util.Scanner;


import controller.CuadradoMagicoController;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("De que tamano quieres el cuadrado magico?");
        int n = scanner.nextInt();
        scanner.nextLine();

        if ( n<3){
            System.out.println("El numero no puede ser menor a 3");
        } else {
            CuadradoMagicoController cuadradoMagicoController = new CuadradoMagicoController();

            cuadradoMagicoController.comenzar(n);
        }






        System.out.println();
    }
}
