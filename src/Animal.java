public class Animal {
    private String Name;
    private int Age;
    private int healthLevel;
    private int hungryLevel;
    private int moodLevel;
    private String favoriteFood;
    private String favoriteActivity;

    public void setName(String Name) {
        this.Name = Name;
    }
    public void setAge(int Age) {
        this.Age =Age;
    }
    public void setHealthLevel(int healthLevel){
        this.healthLevel =healthLevel;
    }
    public void setHungryLevel(int hungryLevel){
        this.hungryLevel =hungryLevel;
    }
    public void setMoodLevel(int moodLevel){
        this.moodLevel =moodLevel;
    }
    public void setFavoriteFood(String favoriteFood){
        this.favoriteFood = favoriteFood;
    }
    public void setFavoriteActivity(String favoriteActivity){
        this.favoriteActivity =favoriteActivity;
    }
    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }
    public int getHealthLevel(){
        return healthLevel;
    }
    public int getHungryLevel(){
        return hungryLevel;
    }
    public int getMoodLevel(){
        return moodLevel;
    }
    public String getFavoriteFood(){
        return favoriteFood;
    }
    public String getFavoriteActivity(){
        return favoriteActivity;
    }
}
