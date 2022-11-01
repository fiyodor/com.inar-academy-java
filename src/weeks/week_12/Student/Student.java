package weeks.week_12.Student;

public class Student {
    private String name;
    private String surname;
    private int id;
    private String email;

    public final static String academy = "Inar Academy";

    public String publicAccessModifier;

    String defaultAccessModifier;

    private String privateAccessModifier;

    protected String protectedAccessModifier;

    private static int counter;


    public Student(){

      this("", "", 0, "");
    }
    public Student(String name, String surname, int id, String email){

        this.name = name;

        this.surname = surname;

        this.id = id;

        this.email = email;

        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void print(){

        System.out.printf("Name: %s\nSurname: %s\nId: %d\nE-mail: %s\n", this.name, this.surname, this.id, this.email);

        System.out.println("---------------------------");
    }

    public static int getCounter(){

        return counter;
    }
}
