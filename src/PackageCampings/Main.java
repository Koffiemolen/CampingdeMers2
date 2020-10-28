package PackageCampings;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        ArrayList<Plek> aanwezigeplekken = new ArrayList<>();
        Camping campingDuMerde = new Camping("De Merde","Paris");

        campingDuMerde.voegPlekToe(new Stacaravan(1,false,3,false));
        campingDuMerde.voegPlekToe(new Stacaravan(2,false,8,false));
        campingDuMerde.voegPlekToe(new Stacaravan(3,false,45,false));
        campingDuMerde.voegPlekToe(new Stacaravan(4,false,15,false));
        campingDuMerde.voegPlekToe(new Stacaravan(5,false,2,false));
        campingDuMerde.voegPlekToe(new Stacaravan(6,false,321,false));
        campingDuMerde.voegPlekToe(new Stacaravan(7,false,12,true));
        campingDuMerde.voegPlekToe(new Stacaravan(8,false,1,true));

        campingDuMerde.voegPlekToe(new Huis(20,true,8,29.10));
        campingDuMerde.voegPlekToe(new Huis(21,false,4,22.00));
        campingDuMerde.voegPlekToe(new Huis(22,true,5,11.33));
        campingDuMerde.voegPlekToe(new Huis(23,false,8,22.00));
        campingDuMerde.voegPlekToe(new Huis(24,false,8,50.55));
        campingDuMerde.voegPlekToe(new Huis(25,true,6,22.00));
        campingDuMerde.voegPlekToe(new Huis(26,true,8,82.00));
        campingDuMerde.voegPlekToe(new Huis(27,false,7,22.00));
        campingDuMerde.voegPlekToe(new Huis(28,true,22,32.00));

        campingDuMerde.voegPlekToe(new Staplaats(50,false,33,1.50,false));
        campingDuMerde.voegPlekToe(new Staplaats(51,true,12,2.50,false));
        campingDuMerde.voegPlekToe(new Staplaats(52,false,33,78.50,false));
        campingDuMerde.voegPlekToe(new Staplaats(53,false,45,22.50,false));
        campingDuMerde.voegPlekToe(new Staplaats(54,true,33,32.50,false));
        campingDuMerde.voegPlekToe(new Staplaats(55,true,88,1.50,false));
        campingDuMerde.voegPlekToe(new Staplaats(56,true,12,12.50,false));
        campingDuMerde.voegPlekToe(new Staplaats(57,false,4,1.50,false));
        campingDuMerde.voegPlekToe(new Staplaats(58,false,33,32.50,false));
        campingDuMerde.voegPlekToe(new Staplaats(59,true,3,23.50,false));
        campingDuMerde.voegPlekToe(new Staplaats(60,true,56,44.50,false));
        campingDuMerde.voegPlekToe(new Staplaats(61,false,12,12.50,false));

        System.out.println("Camping Deux Mers heeft momenteel " + campingDuMerde.getPlekken().size() + " plaatsen.");


        System.out.println("Plek 2 bevat de volgende informatie " );
        System.out.println(campingDuMerde.geefPlekWeer(2));

        boolean quit = false;
        while(!quit)

        {
            System.out.println("\nEnter action: ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    System.out.println("Geef plek weer");

                    break;

                case 2:
                    System.out.println("Tadaa");
                    break;

                case 6:
                    System.out.println("Do something");
                    break;
            }
        }
    }
}
