package weeks.week_12.Football_Club;

public class FootballClubTest {

    public static void main(String[] args) {

        Player messi = new Player("Messi", 20_000_000);
        Player ronaldo = new Player("Ronaldo", 4_000_000);
        Player maguire = new Player("Maguire", 12_000);
        Player neymar = new Player("Neymar", 8_000_000);
        Player mbappe = new Player("Mbappe", 15_000_000);
        Player haaland = new Player("Haaland", 18_000_000);
        Player veli = new Player("Veli Kavlak", 100);
        Player olcay = new Player("Olcay Sahan", 50);

        FootballClub fenerbahce = new FootballClub(40_000_000, "FENERBAHÇE", 20, "ÜLKER ARENA", 50000, new Player[6]);

        fenerbahce.buyPlayer(messi);
        fenerbahce.buyPlayer(mbappe);
        fenerbahce.buyPlayer(haaland);

        fenerbahce.sellPlayer(messi);
        fenerbahce.getBalance();
        fenerbahce.getTicketFee();
        fenerbahce.sellPlayer(olcay);
        fenerbahce.buyPlayer(mbappe);
        fenerbahce.buyPlayer(messi);
        fenerbahce.buyPlayer(messi);
        fenerbahce.setTicketFee(100);
        fenerbahce.sellTicket(1000000);
        fenerbahce.getBalance();
        fenerbahce.buyPlayer(neymar);
        fenerbahce.buyPlayer(olcay);
        fenerbahce.buyPlayer(veli);

    }
}
