import java.util.Scanner;

public class Escaner {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        result = Integer.valueOf(sc.nextLine());
        do{
            switch (result){
                case 1 :
                    System.out.println("valor 1");
                    break;
                case 2 :
                    System.out.println("valor 2");
                    break;
                case 0:
                    System.out.println("salir");
                    break;
            }

        }while (result != 0);

    }
}

