public class Dog extends Animal {
    String name;

    public Dog(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лает");
    }

    @Override
    public void eat() {
        System.out.println("Собака спит");
    }
}
