package weeks.week_14.Animal;

public class Lion {

    public double tailSize;
    public double weight;
    public double height;
    public boolean hasSwimmingSkills;
    public boolean hasFlyingSkills;

    public Lion(){

        this(1,10,1,true,false);
    }

    public Lion(double tailSize, double weight, double height, boolean hasSwimmingSkills, boolean hasFlyingSkills){

        this.tailSize = tailSize;
        this.weight = weight;
        this.height = height;
        this.hasSwimmingSkills = hasSwimmingSkills;
        this.hasFlyingSkills = hasFlyingSkills;
    }

    public double getTailSize() {
        return tailSize;
    }

    public void setTailSize(double tailSize) {
        this.tailSize = tailSize;
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

        System.out.println("Lion is running");
    }

    public void eats(){

        System.out.println("Lion is eating");
    }

    public void sleeps(){

        System.out.println("Lion is sleeping");
    }

    public void roar(){

        System.out.println("Lion is roaring");
    }
}
