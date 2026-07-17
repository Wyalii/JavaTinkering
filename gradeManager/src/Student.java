public class Student{
    private Integer studentId;
    private  String firstName;
    private  String lastName;
    private  Integer grade;

    public Student(Integer studentId,String firstName,String lastName, Integer grade)
    {
      this.studentId = studentId;
      this.firstName = firstName;
      this.lastName = lastName;
      this.grade = grade;
    }

    public Integer getId()
    {
        return studentId;
    }
    public String getName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public Integer getGrade()
    {
        return grade;
    }
    public String setName(String newName)
    {
        this.firstName = newName;
        return  firstName;
    }
    public String setLastName(String newLastName)
    {
        this.lastName = newLastName;
        return  lastName;
    }
    public Integer setGrade(Integer newGrade){
      this.grade = newGrade;
      return grade;
    }
}