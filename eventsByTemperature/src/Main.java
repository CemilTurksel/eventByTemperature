import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int heat;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature: ");
        heat = scanner.nextInt();

        if (heat < 5){
            System.out.println("You can ski");
        }
        else if (heat >= 5 && heat <=25 ){
            if (heat <= 15){
                System.out.println("You can go cinema");
            }
            if (heat >= 10) {
                System.out.println("You can go picnic");
            }
        else if (heat > 25 ){
                System.out.println("You can go to swim");
            }
        }
    }

}
