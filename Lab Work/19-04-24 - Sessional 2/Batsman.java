public class Batsman extends Player {
    private int totalRuns;
    private int totalOneDays;

    public Batsman(String name, String address, String number, int totalRuns, int totalOneDays) {
        super(name, address, number, "Batsman");
        this.totalRuns = totalRuns;
        this.totalOneDays = totalOneDays;
    }

    @Override
    public double average() {
        return (double) totalRuns/totalOneDays;
    }

    @Override
    public String toString() {
        return String.format("%s\n\t\tTotal Runs: %d\n\t\tTotal One Day's: %d",super.toString(),totalRuns,totalOneDays);
    }

}
