package chapters.chapter_10.Exercise_14;

public class MyDateTest {

    public static void main(String[] args) {

        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);
        MyDate date3 = new MyDate(2000, 6, 9);

        System.out.println("Date 1\n" + date1.getDay() + "/" + date1.getMonth() + "/" + date1.getYear());
        System.out.println("Date 2\n" + date2.getDay() + "/" + date2.getMonth() + "/" + date2.getYear());
        System.out.println("Date 3\n" + date3.getDay() + "/" + date3.getMonth() + "/" + date3.getYear());
    }
}
