import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bankrekening rekening = new Bankrekening(150);

        Scanner mijnscanner = new Scanner(System.in);
        char keuze;

        do{
            System.out.println("Bankrekening Menu:");
            System.out.println("------------------");
            System.out.println("a: afhalen");
            System.out.println("b: storten");
            System.out.println("q: stoppen");
            System.out.println("Geef jij keuze");
            System.out.println(rekening.toString());
            //System.out.println("Bankrekening bedrag:" + rekening.getBedrag());

            keuze = mijnscanner.next().charAt(0);

            switch (keuze){
                case 'a' :
                    System.out.println("Hoeveel geld wil jij afhalen?");
                    double bedrag = mijnscanner.nextDouble();
                    rekening.afhalen(bedrag);
                    break;
                case 'b' :
                    System.out.println("Hoeveel geld wil jij storten?");
                    double bedrag2 = mijnscanner.nextDouble();
                    rekening.storten(bedrag2);
                    break;
                case 'q' :
                    System.out.println("Bedankt! TOT ZIENS!");
                    break;
                default :
                    System.out.println("Fautive invoer.");
            }

        }while( keuze != 'q');

    }
}
