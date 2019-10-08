import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("velkommen til Sten Saks Papir 1.0");
        // her laver jeg en variabel der hedder runde1 og jeg siger at den skal snakke med SSP.java
        SSP runde1 = new SSP();

        // her laver jeg en scanner som skal scanne hvad det er at vi skriver inde i programmet
        Scanner scanner = new Scanner(System.in);
        System.out.println("skriv start for at begynde");

        // her laver jeg en variabel som en string som jeg så bruger senere
        String spillerenString = scanner.next();

        // her laver jeg et if statement som gør at hvis man skriver start så starter programmet og hvis man skriver sluk så slukker det
        if (spillerenString.equalsIgnoreCase("start")){
            System.out.println("velkommen til spillet nu skal du bare vælge om du vil spille med sten, saks eller papir");

            // her har jeg så puttet sluk ind i et while loop som gør at det er lige meget hvornår man skriver sluk så slukker den
        while (!spillerenString.equalsIgnoreCase("Sluk")) {
            spillerenString = scanner.next();

            // her laver jeg et if statement der gør at hvis jeg skriver sluk så slukker programmet
            if (spillerenString.equalsIgnoreCase("Sluk")) {break;}
            else {
                //indlæse spillerens hånd
                Haand spillerensHaand = null;
                if (spillerenString.equalsIgnoreCase("sten")) {
                    spillerensHaand = Haand.STEN;
                }
                if (spillerenString.equalsIgnoreCase("saks")) {
                    spillerensHaand = Haand.SAKS;
                }
                if (spillerenString.equalsIgnoreCase("papir")) {
                    spillerensHaand = Haand.PAPIR;
                }
                System.out.println("spiller slår " + spillerensHaand);

                //computer generer en hånd

                Haand computersHaand = null;
                int HaandInt = (int) (Math.random() * 3 + 1);
                // dette er hvad Andrés ville have skrevet computersHaand = Haand.values()[HaandInt];
                if (HaandInt == 1) {
                    computersHaand = Haand.STEN;
                }
                if (HaandInt == 2) {
                    computersHaand = Haand.SAKS;
                }
                if (HaandInt == 3) {
                    computersHaand = Haand.PAPIR;
                }
                System.out.println("computer slår " + computersHaand);

                //samligne med slag metode
                int resultat = runde1.slaa(spillerensHaand, computersHaand);
                //Udråbe en vinder
                if (resultat == 1) {
                    System.out.println("DU VANDT!!");
                }
                if (resultat == 2) {
                    System.out.println("Du tabte");
                }
                if (resultat == 0) {
                    System.out.println("Det blev uafgjort");
                }
                if (resultat == -1) {
                    System.out.println("Der skete en fejl");
                }
                System.out.println("nu kan du blive ved med at spille og hvis du ikke vil spille mere skal du bare skrive Sluk");
            }
        }
        }
        else{
            System.out.println("Fejl");
        }

    }
}
