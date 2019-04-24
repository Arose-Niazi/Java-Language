import java.util.ArrayList;

public class Driver {
    public static void main(String args[]) {
        ArrayList<Score> players = new ArrayList<Score>();
        players.add(new Batsman("Arose Niazi", "House 711S, PAF Road Mianwali", "+92-341-6688868", 5000, 85));
        players.add(new Batsman("Qasim Hayat", "Unknown, Not found yet!", "+92-315-6475854", 20000, 174));

        players.add(new Bowler("Munibullah Shah", "Lucky Marwat", "+92-314-8586857", 100, 54));
        players.add(new Bowler("Faud Mufti", "PIA Road, Lahore", "+92-301-6475854", 125, 200));

        Batsman topBat = new Batsman(" ", " ", " ", 0, 1 );
        Bowler topBow = new Bowler(" ", " ", " ", 0, 1 );

        int z=0,y=0;
        for (Score x : players) {
            if (x instanceof Batsman) {
                if (z == 0) {
                    z = 1;
                    topBat = (Batsman) x;
                }
                if (x.average() > topBat.average()) topBat = (Batsman) x;
            }
            else {
                    if (y == 0) {
                        y = 1;
                        topBow = (Bowler) x;
                    }
                    if (x.average() >= topBow.average()) topBow = (Bowler) x;
                }
        }
        System.out.println(topBat);
        System.out.println("\t\tAverage: " + topBat.average());
        System.out.println(topBow);
        System.out.println("\t\tAverage: " + topBow.average());

        int j=0,k=0;
        for(Score x: players)
        {
            if (x instanceof Batsman) j++;
            else k++;
        }

        Batsman batsman[] = new Batsman[j];
        Bowler bowler[] = new Bowler[k];
        j=k=0;
        for(Score x: players)
        {
            if (x instanceof Batsman) batsman[j++] = (Batsman) x;
            else bowler[k++] = (Bowler) x;
        }
        System.out.println("\nPrinting Data using their own arrays:");
        for (Batsman x : batsman) {
            System.out.println(x);
        }
        System.out.println(" ");
        for (Bowler x : bowler) {
            System.out.println(x);
        }
    }
}
