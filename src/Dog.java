public class Dog extends Animal{
    private String adopter;
    private String type;
    private int fear;
    private String medicine;

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getAdopter() {
        return adopter;
    }

    public void setAdopter(String adopter) {
        this.adopter = adopter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFear() {
        return fear;
    }

    public void setFear(int fear) {
        this.fear = fear;
    }

    //    @Override
//    public String toString() {
//        return "Dog{" +
//                "adopter='" + adopter + '\'' +
//                '}';
//    }

    @Override
    public String speak() {
        return "Woof!";
    }

    public String eat(DogFood food) {
        return "Dog is eating " + food.getName();
    }

    @Override
    public String sleep() {
        return "Sleeping in bed";
    }

    @Override
    public String play() {
        return "playing with the ball";
    }

    @Override
    public String sound() {
        return "Woof ufff!";
    }

    @Override
    public String wakeup() {
        return super.wakeup();
    }

    @Override
    public String walk() {
        return super.walk();
    }
}

