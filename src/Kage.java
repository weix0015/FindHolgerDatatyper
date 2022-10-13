import java.util.Scanner;
public class Kage {
    public static void main(String[] args) {
//Starter med at opret ingredienserne som variabler.
                int gramBrunFarin= 300;
                //Opret fremgangsmåden som tekstudskrift løbende.
                System.out.print ("Vi starter med at tilføje " +  gramBrunFarin+ "g BrunFarin, ");
                int dlOlieSolsikke = 2;
                System.out.println( dlOlieSolsikke + " dl olie røres sammen.");
                int stkæg= 4;
                System.out.println ("Derefter tager man æggene og pisker " + stkæg);
                int gramHvedemel= 272;
                System.out.print ("Så blandes de tør ingredienserne:"+ gramHvedemel + " g hvedemel, " );
                double tskBagepulver = 1.5;
                System.out.print ( tskBagepulver + " tsk  bagepulver, " );
                double tskSalt = 0.5;
                System.out.print ( tskSalt + " tsk Salt, " );
                int tskNatron = 1;
                System.out.print ( tskNatron + " tsk Natron, " );
                int tskKanel = 2;
                System.out.println ( "og " + tskNatron + " tsk Kanel " );


                int gramgulerod = 375;
                System.out.println ("Tilsidst hældes/røres de sammen med " + gramgulerod + "g reven gulerødder");


//Brugte https://www.dk-kogebogen.dk/teknik/weight.php til at se hvad ingredienserne vejer.
                // Man skal bruge 2 dl OlieSolsikke i opskriften. 1 dl OlieSolsikke svarer til 90 gram.
        // Jeg udregn den samlet vægt i gram.




                int gOlieSolsikke = 180;
                int gramæg = 280;
                double gBagepulver= 7.5;
                double gSalt= 2;
                int gNatron = 5;
                int gKanel= 5;


                System.out.println("Den samlet vægt i gram er:");
                System.out.println( gramBrunFarin+ gramHvedemel + gOlieSolsikke+ gramæg + gBagepulver+ gSalt + gNatron
                        + gKanel+ gramgulerod);




// Vi starter med at udregner hvad 10% af kagen er.
                double samledeVægt = 1426.5;
                System.out.println(samledeVægt/100*10);


//Vi kan nu udregne kagens vægt når den er 10% mindre.
                double resultat= 142.65;
                System.out.println(samledeVægt - resultat );
// Del 2
        int kcal = 388;
        double kulhydrat = 95.5;
        double protein = 0.5;
        System.out.println("I brunfarin er der" + " " + (int) kcal + " gram kcal " + (double) + kulhydrat
                + " gram kuhydrater " + (double) protein + " gram protein.");

        int kcal2 = 884;
        int fedt2 = 100;
        System.out.println("I olie er der " + (int) kcal2 + " gram kcal " + (int) fedt2 + " gram fedt.");

        int kcal3 = 364;
        int fedt3 = 1;
        int kulhydrat3 = 76;
        System.out.println("I hvedemel er der " + (int) kcal3 + " gram kcal " + (int) fedt3 + " gram fedt "
                + (int) kulhydrat3 + " gram kulhydrater.");

        //I natron og salt der er der 0 næring

        int kcal4= 247;
        int kulhydrater4 = 81;
        double fedt4 = 1.2;
        int protein4 = 4;
        System.out.println("I kanel er der " + (int) kcal4 + " gram kcal " + (int) kulhydrater4 + " gram kulhydrater "
                + (double) fedt4 + " gram fedt " + (int) protein4 + " gram protein.");

        int kcal5 = 41;
        int kulhydrater5 = 10;
        double fedt5 = 0.2;
        double protein5 = 0.9;
        System.out.println("I gulerod er der " + (int) kcal5 + " gram kcal " + (int) kulhydrater5 + " gram kulhydrater "
                + (double) fedt5 + " gram fedt " + (double) protein5 + " gram protein.");
    }
        }