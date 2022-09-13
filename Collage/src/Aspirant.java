public class Aspirant extends Student
{
    String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    int getScholarship()
    {
        return averageMark == 5?200:180;
    }
}
