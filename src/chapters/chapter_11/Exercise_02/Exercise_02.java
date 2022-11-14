package chapters.chapter_11.Exercise_02;

import chapters.chapter_10.Exercise_14.MyDate;

public class Exercise_02 {

    public static void main(String[] args) {

        Person ertugrul = new Person("Ertuğrul DÖNMEZ", "Üsküdar/İSTANBUL", "05546762772", "ert@ert.com");
        Student mesut = new Student("Mesut Said ÖZTÜRK", "Üsküdar/İstanbul", "05553337799", "mesut@mesut.com", 3);
        Employee haluk = new Employee("Haluk DÜNDAR", "Sariyer/İstanbul", "05333339966", "haluk@haluk.com", "Taski Driver", 2000, new MyDate(2022, 8,4));
        Faculty kaan = new Faculty("Kaan Pamuk", "Ordu", "05420856978", "kaanqpamuk.com", "Registrar", 3000, new MyDate(), "8/17", "4/3");
        Staff mahmut = new Staff("Mahmut", "İstanbul", "07569874125", "mah@mut.com", "Dean Office", 4000, new MyDate(), "Teacher");

        System.out.println(ertugrul);
        System.out.println(mesut);
        System.out.println(haluk);
        System.out.println(kaan);
        System.out.println(mahmut);




    }
}
