public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Activity activity = new Activity();
        Vet vet = new Vet();
        Adopter adopter = new Adopter();
        Food food = new Food();
        Game game = new Game();

        animal.setName("Rex");
        animal.setAge(2);
        animal.setFavoriteFood("Pedigree");
        System.out.println("My name is" + " "+ animal.getName() +", i'm" +" "+ animal.getAge()+" " +"years old;" + "my favourite food is" + " "+ animal.getFavoriteFood() );




    }
}
