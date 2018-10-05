import java.util.Scanner;

public class cmdline
{
    public static  void  main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String naam = "";
       System.out.println("Geef je naam");
       naam =   scan.nextLine();
       System.out.println("je naam is " + naam);


        String leeftijd = "";
       System.out.println("Geef leeftijd");
       leeftijd = scan.nextLine();
       System.out.println("je leeftijd is " + leeftijd );

       String postcode = "";
       System.out.println("Wat is je postcode");
        postcode = scan.nextLine();
        System.out.println("Je postcode is" + postcode);

        String kleurogen = "";
        System.out.println("Wat is je kleurogen?");
        kleurogen = scan.nextLine();
        System.out.println("Je oogkleur is" + kleurogen);

    }

}
