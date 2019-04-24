public abstract class Player implements Score {
    private String name;
    private String address;
    private String number;
    private String status;

    public Player(String name, String address, String number, String status) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("Player:\n\tName: %s\n\tAddress: %s\n\tContact Number: %s\n\tStatus: %s",name,address,number,status);
    }
}
