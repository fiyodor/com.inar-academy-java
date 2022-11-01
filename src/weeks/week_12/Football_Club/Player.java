package weeks.week_12.Football_Club;

public class Player {
    private String name;
    private long fee;

    public Player() {

        this("default", 0);
    }
    public Player(String name, int fee) {

        this.name = name;

        this.fee = fee;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public long getFee() {
        return fee;
    }
    public void setFee(long fee) {
        this.fee = fee;
    }

    public void increasePrice(long price){

        setFee(this.fee = price);
    }

    public void dicreasePrice(long price){

        setFee(this.fee - price > 0 ? this.fee - price : 0);
    }
}
