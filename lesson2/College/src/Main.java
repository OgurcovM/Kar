public class Main {
    public static void main(String[] args)
    {
        Student student = new Student("Maksim", "Ogurtsov", "PKS-419", 4.69);
        Aspirant aspirant = new Aspirant("Yarik", "Evdokimov", "PKC-419", 4.39, "Space");
        Student un = new Aspirant("Pavel", "Lakomov", "OSA-419", 4.7, "Ninja");
        Student[] students = { student, aspirant, un };

        for (Student s : students)
            System.out.println(s.getScholarship());
    }
}
