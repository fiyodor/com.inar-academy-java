package weeks.week_14;

public class Lion {

    private double tailLength;
    private double weight;
    private double height;
    private boolean hasSwimmingSkills;
    private boolean hasFlyingSkills;

    public Lion(){

        this(1,10,1,true,false);
    }

    public Lion(double tailLength,double weight, double height, boolean hasSwimmingSkills, boolean hasFlyingSkills){

        this.tailLength = tailLength;
        this.weight = weight;
        this.height = height;
        this.hasSwimmingSkills = hasSwimmingSkills;
        this.hasFlyingSkills = hasFlyingSkills;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
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
