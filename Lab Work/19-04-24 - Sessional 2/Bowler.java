public class Bowler extends Player {
    private int totalWickets;
    private int totalMatches;

    public Bowler(String name, String address, String number, int totalWickets, int totalMatches) {
        super(name, address, number, "Bowler");
        this.totalWickets = totalWickets;
        this.totalMatches = totalMatches;
    }

    @Override
    public double average() {
        return (double) totalWickets/totalMatches;
    }

    @Override
    public String toString() {
        return String.format("%s\n\t\tTotal Wickets: %d\n\t\tTotal Matches: %d",super.toString(),totalWickets,totalMatches);
    }

}
