public class DogFood extends Food{
    protected int energy;
    protected int calories;

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }


    public static class DryFood extends DogFood {
        @Override
        public String toString() {
            return "DryFood{" +
                    "energy='" + energy + '\'' +
                    ", calories='" + calories + '\'' +
                    '}';
        }
    }

    public static class SpecialFood extends DogFood {
        @Override
        public String toString() {
            return "SpecialFood{" +
                    "energy='" + energy + '\'' +
                    ", calories='" + calories + '\'' +
                    '}';
        }
    }

    public static class WetFood extends DogFood {
        @Override
        public String toString() {
            return "WetFood{" +
                    "energy='" + energy + '\'' +
                    ", calories='" + calories + '\'' +
                    '}';
        }
    }
}
