public abstract class Animal {
    public static void main(String[] args){}
    private String Name;
    private int Age;
    private int healthLevel;
    private int hungryLevel;
    private int moodLevel;
    private String favoriteFood;
    private String favoriteActivity;
    private String color;
    private float weight;

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public void setHungryLevel(int hungryLevel) {
        this.hungryLevel = hungryLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public int getHungryLevel() {
        return hungryLevel;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", healthLevel=" + healthLevel +
                ", hungryLevel=" + hungryLevel +
                ", moodLevel=" + moodLevel +
                ", favoriteFood='" + favoriteFood + '\'' +
                ", favoriteActivity='" + favoriteActivity + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
    public String walk(){
        return "Walk!";
    }
    public String wakeup(){
        return "Wake up!";
    }

    public String speak() {
        return "Speaking!";
    }

    public String eat() {
        return "Eating!";
    }

    public String sleep() {
        return "Sleeping!";
    }

    public String play() {
        return "Playing!";
    }

    public String sound() {
        return "Sound!";
    }
}
