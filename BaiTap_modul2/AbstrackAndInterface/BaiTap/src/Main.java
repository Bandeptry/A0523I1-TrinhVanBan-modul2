
public class Main {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];
                animal[0] = new Chicken();
                animal[1] = new Tiger();
                for(int i = 0; i < animal.length; i++){
                    System.out.println(animal[i].makeSound());
                }
    }

}
