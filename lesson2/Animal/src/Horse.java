public class Horse extends Animal {
    String name;

    public Horse(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь умеет гавкать, я увольняюсь");
    }

    @Override
    public void eat() {
        System.out.println("Животное есть");
    }
}
