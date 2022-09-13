public class Main {
    public static void main(String[] msi) {
        Vet vet = new Vet();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Собака", "Маршмеллоу", "Музей динозавров");
        animals[1] = new Cat("Кошка", "Мясо саблезубого тигра", "Орбитальная станция");
        animals[2] = new Horse("Лошадь", "Собака", "Марс");

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
