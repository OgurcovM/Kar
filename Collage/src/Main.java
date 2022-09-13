public class Main
{
    public static void main(String[] args)
    {
        Student student = new Student("Сергей", "Трантин", "ПКС-419", 4.97);
        Aspirant aspirant = new Aspirant("Ярослав", "Евдокимов", "ПКС-419", 5.39, "Океан");
        Student un = new Aspirant("Максим", "Огурцов", "ПКС-419", 4.59, "Океан - это жизнь");
        Student[] students = { student, aspirant, un };

        for (Student s : students)
            System.out.println(s.getScholarship());
    }
}


