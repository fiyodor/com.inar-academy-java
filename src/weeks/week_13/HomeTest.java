package weeks.week_13;

public class HomeTest {

    public static void main(String[] args) {

        Home home = new Home();
        Home home2 = new Home(1000,3,5,false,1000000,50000,2,7);

        System.out.println(home.toString());
        System.out.println(home2.toString());
    }
}
