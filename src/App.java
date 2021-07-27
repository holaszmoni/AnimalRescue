import java.time.LocalDate;

public class App {
    public static void main(String[] args) {


       //Animal animal = new Animal();
        Activity activity = new Activity();
        Vet vet = new Vet();
        Adopter adopter = new Adopter();
        Food food = new Food();
        Dog dog = new Dog();
        Game game = new Game();
        DogFood dogFood = new DogFood();

        /*System.out.println("--------ANIMAL-----------");
        System.out.println(animal.speak());
        animal.eat();
        animal.sleep();
        animal.sound();
        animal.play();*/

        System.out.println("--------DOG-----------");
        System.out.println(dog.speak());
        dog.eat();
        dog.sleep();
        dog.sound();
        dog.play();

        dog.setName("Rex");
        dog.setAge(2);
        dog.setFavoriteFood("Pedigree");
        dog.setFavoriteActivity("Running");
        dog.setHealthLevel(3);
        dog.setHungryLevel(1);
        dog.setMoodLevel(1);
        dog.setColor("white");
        dog.setWeight(10);
        dog.setType("Labrador");
        dog.setFear(2);
        System.out.println(dog.toString());

        activity.setName("recreation");
        System.out.println(activity.toString());

        adopter.setName("Alina");
        adopter.setMoney(350);
        System.out.println(adopter.toString());

        vet.setName("Popescu");
        vet.setSpecialization("chirurgie");
        System.out.println(vet.toString());

        food.setName("Pedigree");
        food.setPrice(50);
        food.setQuantity(5);
        food.setExpirationDate(LocalDate.now().plusMonths(1));
        food.setStockAvailability(25);
        food.setType("Dry food");
        System.out.println(food.toString());

        dog.setAdopter("Alina");
        dog.setName("Rex");
        dog.setAge(2);
        System.out.println(dog.toString());
        dog.setFear(1);

        game.setAdopter("Alina");
        game.setDog("Rex");
        game.setVet("Popescu");
        System.out.println(game.toString());

        System.out.println("Animal rescue project:");

        adopter.setName("Girl and dad");
        dog.setType("Labrador");
        dog.setMoodLevel(1);
        dog.setHealthLevel(1);
        dog.setHungryLevel(1);
        dog.setAdopter("Girl and dad");
        dog.setName("Toto");
        dog.setFear(3);
        dogFood.setName("Pedigree");
        dogFood.setCalories(200);
        dog.eat(dogFood);
        dog.setAge(2);
        dog.setWeight(10);
        dog.setHealthLevel(6);
        vet.setName("Popescu");
        dog.setMedicine("Vaccine");
        dog.setMedicine("Deparazitare");
        dog.setFear(1);
        DogFood.DryFood dry = new DogFood.DryFood();
        dry.setName("Friskies");
        dog.eat(dry);
        dog.setWeight(15);
        DogFood.SpecialFood special = new DogFood.SpecialFood();
        special.setName("FRD");
        special.setCalories(100);
        dog.eat(special);

        dog.setWeight(9);

        do {
            dog.wakeup();
            dog.eat(special);
            dog.walk();
            dog.sleep();
            dog.wakeup();
            dog.play();
            dog.walk();
            dog.eat(special);
            dog.sleep();
        } while (true);

    }
}




