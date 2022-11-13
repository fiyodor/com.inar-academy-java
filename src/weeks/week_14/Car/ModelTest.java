package weeks.week_14.Car;

public class ModelTest {

    public static void main(String[] args) {

        Brand volkswagen = new Brand("Volkswagen", 4, 2, "Yellow", 3);
        Model polo = new Model("Polo", 1.6, 750_000);

        System.out.println(volkswagen);
        System.out.println("-----------");
        System.out.println(polo);
    }
}
