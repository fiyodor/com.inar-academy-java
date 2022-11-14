package chapters.chapter_11.Exercise_02;

import chapters.chapter_10.Exercise_14.MyDate;

public class Exercise_02 {

    public static void main(String[] args) {

        Person p1 = new Person("Ertuğrul DÖNMEZ");

        System.out.println(p1);

        Person p2 = new Person("Ertuğrul DÖNMEZ", "Üsküdar/İSTANBUL");

        System.out.println(p2);

        Person p3 = new Person("Ertuğrul DÖNMEZ", "Üsküdar/İSTANBUL", "05546762772");

        System.out.println(p3);

        Person p4 = new Person("Ertuğrul DÖNMEZ", "Üsküdar/İSTANBUL", "05546762772", "ert@ert.com");

        System.out.println(p4);

        Student s1 = new Student();

        System.out.println(s1);

        Student s7 = new Student(4);

        System.out.println(s7);

       Student s2 = new Student("Haluk DÜNDAR");

        System.out.println(s2);

        Student s8 = new Student("Haluk DÜNDAR", 4);

        System.out.println(s8);

        Student s3 = new Student("Haluk DÜNDAR", "Sarıyer/İSTANBUL");

        System.out.println(s3);

        Student s9 = new Student("Haluk DÜNDAR", "Sarıyer/İSTANBUL", 2);

        System.out.println(s9);

        Student s4 = new Student("Haluk DÜNDAR", "Sarıyer/İSTANBUL", "05654321234");

        System.out.println(s4);

        Student s10 = new Student("Haluk DÜNDAR", "Sarıyer/İSTANBUL", "05654321234", 1);

        System.out.println(s10);

        Student s5 = new Student("Haluk DÜNDAR", "Sarıyer/İSTANBUL", "05654321234", "haluk@haluk.com");

        System.out.println(s5);

        Student s6 = new Student("Haluk DÜNDAR", "Sarıyer/İSTANBUL", "05654321234", "haluk@haluk.com", 2);

        System.out.println(s6);

        Employee e1 = new Employee();

        System.out.println(e1);

        Employee e2 = new Employee("Serhat GÜLBAŞ");

        System.out.println(e2);

        Employee e3 = new Employee("Serhat GÜLBAŞ", "Inar");

        System.out.println(e3);

        Employee e4 = new Employee("Serhat GÜLBAŞ", "Inar", "Minesota");

        System.out.println(e4);

        Employee e5 = new Employee("Serhat GÜLBAŞ", "Inar", "Minesota", "02165129865" );

        System.out.println(e5);

        Employee e6 = new Employee("Serhat GÜLBAŞ", "Inar", "Minesota", "02165129865", "sg@sg.com" );

        System.out.println(e6);

        Employee e7 = new Employee("Serhat GÜLBAŞ", "Inar", "Minesota", "02165129865", "sg@sg.com", 12000);

        System.out.println(e7);

        Employee e8 = new Employee("Serhat GÜLBAŞ", "Inar", "Minesota", "02165129865", "sg@sg.com", 12000, new MyDate(2022,2,5));

        System.out.println(e8);



    }
}
