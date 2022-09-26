public class Cat extends Animal {
    String name;

    public Cat(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяукает");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }
}
