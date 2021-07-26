public class Adopter {
    private String name;
    private float money;

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public float getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Adopter{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}