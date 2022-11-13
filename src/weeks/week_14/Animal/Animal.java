package weeks.week_14.Animal;

public class Animal {

    public double weight;
    public double height;
    public boolean hasSwimmingSkills;
    public boolean hasFlyingSkills;

    public Animal(){

        this(10,1,true,false);
    }

    public Animal(double weight, double height, boolean hasSwimmingSkills, boolean hasFlyingSkills){

        this.weight = weight;
        this.height = height;
        this.hasSwimmingSkills = hasSwimmingSkills;
        this.hasFlyingSkills = hasFlyingSkills;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHasSwimmingSkills() {
        return hasSwimmingSkills;
    }

    public void setHasSwimmingSkills(boolean hasSwimmingSkills) {
        this.hasSwimmingSkills = hasSwimmingSkills;
    }

    public boolean isHasFlyingSkills() {
        return hasFlyingSkills;
    }

    public void setHasFlyingSkills(boolean hasFlyingSkills) {
        this.hasFlyingSkills = hasFlyingSkills;
    }

    public void runs(){

        System.out.println("Animal is running");
    }

    public void eats(){

        System.out.println("Animal is eating");
    }

    public void sleeps(){

        System.out.println("Animal is sleeping");
    }
}
