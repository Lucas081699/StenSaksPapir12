import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sten Saks Papir 1.0");
         Haand Lucas = Haand.Sten;
         Haand Oliver = Haand.Saks;
         Haand Scheel = Haand.Papir;

         /** Start af spil */
         StenSaksPapir runde1 = new StenSaksPapir();
        System.out.println(runde1.slaa(Lucas,Oliver));

       /** Spil mod computer */
        Haand Computershaand = null;
        int tal = (int)(Math.random()*3);

        if(tal == 0) Computershaand = Haand.Papir;
        if(tal == 1) Computershaand = Haand.Sten;
        if(tal == 2) Computershaand = Haand.Saks;
        System.out.println("Computeren slår " + Computershaand + " Hvad vil du slå");
        System.out.println( "Nu er det din tur, hvad vil du slå?");


        Scanner Simon = new Scanner(System.in);
        Haand SpillerensHaand = null;
        String SpillerensString = Simon.next();
        if (SpillerensString.equals("Sten")) { SpillerensHaand = Haand.Sten; }
        if (SpillerensString.equals("Saks")) { SpillerensHaand = Haand.Saks;  }
        if (SpillerensString.equals("Papir")) { SpillerensHaand = Haand.Papir;  }

       int resultat = runde1.slaa(Computershaand,SpillerensHaand);

        System.out.println("Spilleren slår " + resultat);
       if (resultat == 1)
           System.out.println("Du har vundet");
       if (resultat == 0)
           System.out.println("I har spillet uafgjort");
       if (resultat == 2)
           System.out.println("Du har tabt");
       if (resultat == -1)
           System.out.println("Du har fucket op på en eller anden måde");

    }
         }