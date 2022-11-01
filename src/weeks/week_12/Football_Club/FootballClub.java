package weeks.week_12.Football_Club;

public class FootballClub {
    private long balance;
    private String clubName;
    private double ticketFee;
    private String stadiumName;
    private int stadiumCapacity;
    private Player[] team;

    static int playerCounter = 0;

    public FootballClub() {

        this(0, "default", 0, "default stadium", 0, new Player[25]);
    }

    public FootballClub(long balance, String clubName, double ticketFee, String stadiumName, int stadiumCapacity) {
        this(balance, clubName, ticketFee, stadiumName, stadiumCapacity, new Player[25]);
    }

    public FootballClub(String clubName, String stadiumName) {

        this(0, clubName, 0, stadiumName, 0, new Player[25]);
    }

    public FootballClub(long balance, String clubName, double ticketFee, String stadiumName, int stadiumCapacity, Player[] team) {
        this.balance = balance;
        this.clubName = clubName;
        this.ticketFee = ticketFee;
        this.stadiumName = stadiumName;
        this.stadiumCapacity = stadiumCapacity;
        this.team = new Player[25];
    }

    int getStadiumCapacity() {
        return stadiumCapacity;
    }

    void setStadiumCapacity(int stadiumCapacity) {

        this.stadiumCapacity = stadiumCapacity;
    }

    double getTicketFee() {
        return ticketFee;
    }

    public void setTicketFee(double ticketFee) {
        this.ticketFee = ticketFee;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    public Player[] getTeam() {
        return team;
    }

    public void setTeam(Player[] team) {
        this.team = team;
    }

    public void sellPlayer(Player p) {

        if(doPlayerExist(p)) {

            this.balance += p.getFee();

            removePlayer(p);

            System.out.println("You sold " + p.getName() + " Your team have " + playerCounter + " player" + (playerCounter == 1 ? "" : "s") + " now");

            printBalance();
        } else {
            System.out.println(p.getName() + " doesn't exist in your team. You can't sell this player.");
        }
    }

    public void buyPlayer(Player p) {

        if(doPlayerExist(p)) {
            System.out.println("You've already bought " + p.getName());
        } else if(doWeHaveEnoughSpaceForNewPlayer()) {

            if(! doWeHaveEnoughMoney(p)) {
                System.out.println("Balance is only " + this.balance);
                System.out.println(p.getName() + " costs " + p.getFee() + " You can't buy.");

                return;
            }
            this.balance = this.balance - p.getFee();

            addPlayer(p);

            System.out.println("You bought " + p.getName() + " Your team have " + playerCounter + " player" + (playerCounter == 1 ? "" : "s") + " now");

            printBalance();
        } else {
            System.out.println("Your team is full. You can't buy new players.");
        }
    }

    public void sellTicket(int soldTicketAmount){

        soldTicketAmount = soldTicketAmount > this.stadiumCapacity ? this.stadiumCapacity : soldTicketAmount;

        this.balance += (int)soldTicketAmount * this.ticketFee;
    }

    private boolean doWeHaveEnoughSpaceForNewPlayer() {

        for(int i = 0; i < this.team.length; i++) {

            Player myPlayer = team[i];

            if(myPlayer == null){

                return true;
            }
        }
        return false;
    }

    private boolean doWeHaveEnoughMoney(Player p) {
        return this.balance >= p.getFee();
    }

    private boolean doPlayerExist(Player p) {

        for(int i = 0; i < team.length; i++) {

            if(team[i] == p) {

                return true;
            }

        }
        return false;
    }

    private void printBalance() {

        System.out.println("Balance: " + this.balance);
        System.out.println("---------------------------------");
    }

    private void addPlayer(Player p) {

        for(int i = 0; i < this.team.length; i++) {

            Player myPlayer = team[i];

            if(myPlayer == null) {

                team[i] = p;

                playerCounter++;

                break;
            }
        }
    }

    private void removePlayer(Player p) {

        for(int i = 0; i < this.team.length; i++) {

            Player myPlayer = team[i];
            if(myPlayer == team[i]) {

                team[i] = null;

                playerCounter--;

                break;
            }

        }
    }
}
