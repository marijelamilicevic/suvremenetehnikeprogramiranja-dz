package unipu.hr.java;

public class Student
{
    private String id;
    private String name;
    private String surname;
    private int noOfGrade;
    private CourseGrade[] grades;

    final int ARR_SIZE = 60;

    void init ()
    {
        grades=new CourseGrade[ARR_SIZE];
        noOfGrade=0;
    }

    public void addGrade (int code, String title, int grade)
    {
        if (grade>=2 && grade<=5){
            CourseGrade courseGrade=new CourseGrade();
            courseGrade.code=code;
            courseGrade.title=title;
            courseGrade.grade=grade;
            grades[noOfGrade++]=courseGrade;
        }
    }
    @Override

    public String toString() {
        return String.format("%s-%s, %s - Average grade %.2f",
                id, name, surname, averageGrade() );
    }
    public double averageGrade ()
    {
        int sum=0;
        for (int i=0; i<noOfGrade; i++) sum += grades[i].grade;
        return noOfGrade > 0 ? (double) sum / noOfGrade : 0;
    }

    public String getId()
    {
        return id;
    }
    public void setId (String newId)
    {
        id =newId;
    }
    public String getName()
    {
        return name;
    }
    public void setName (String newName)
    {
        name=newName;
    }
    public String gerSurname()
    {
        return surname;
    }
    public void setSurname(String newSurname)
    {
        surname = newSurname;
    }
}
