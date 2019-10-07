import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("velkommen til Sten Saks Papir 1.0");

        SSP runde1 = new SSP();
        Scanner scanner = new Scanner(System.in);
        System.out.println("skriv start for at begynde");
        String spillerenString = scanner.next();
        if (spillerenString.equalsIgnoreCase("start")){
            System.out.println("velkommen til spillet nu skal du bare vælge om du vil spille med sten, saks eller papir");
        while (!spillerenString.equalsIgnoreCase("Sluk")) {
            spillerenString = scanner.next();
            if (spillerenString.equalsIgnoreCase("Sluk")) {
                System.out.println("");
            } else {
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
