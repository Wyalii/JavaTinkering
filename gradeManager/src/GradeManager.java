
import java.util.HashMap;
import java.util.Scanner;

public class GradeManager{
    private HashMap<Integer, Student> StudentsList = new HashMap<>();
    private boolean isRunning = true;
    private Scanner scanner = new Scanner(System.in);
    private Student addStudent()
    {
      System.out.println();
      System.out.println("Fill Student Details:");
      System.out.println("- - - - -");
      System.out.println("ID: ");
      Integer newStudentId = scanner.nextInt();
      System.out.println();
      System.out.println("First Name:");
      String newStudentFirstName = scanner.next();
      System.out.println();
      System.out.println("Last Name:");
      String newStudentLastName = scanner.next();
      System.out.println();
      System.out.println("Grade:");
      Integer newStudentGrade = scanner.nextInt();
      Student newStudent = new Student(newStudentId,newStudentFirstName,newStudentLastName,newStudentGrade);
      StudentsList.put(newStudent.getId(), newStudent);
      System.out.println("Added Student: ID - %d, First name: %s, Last name: %s".formatted(newStudent.getId(),newStudent.getName(),newStudent.getLastName()));
      System.out.println();
      return  newStudent;
    }
    public Student removeStudent()
    {
      System.out.println();
      System.out.println("Provide Student ID: ");
      Integer studentId = scanner.nextInt();
      if (!StudentsList.containsKey(studentId)) {
          System.out.println("Student with ID: " + studentId + " doesn't exists.");
          return null;
      }
      Student removedStudent = StudentsList.get(studentId);

      StudentsList.remove(studentId);
      System.out.println();
      System.out.println("Removed Student: ID - %d, Name: - %s".formatted(removedStudent.getId(),removedStudent.getName()));
      return removedStudent;
      
    }

    public Student getStudentDetails()
    {
      System.out.println();
      System.out.println("Provide Student ID:");
      Integer studentId = scanner.nextInt();
      if (!StudentsList.containsKey(studentId)) {
          System.out.println("Student with ID: " + studentId + " doesn't exists.");
          return null;
      }
      Student student = StudentsList.get(studentId);
      System.out.println("ID: %d, First Name: %s, Last Name: %s, Grade: %d".formatted(student.getId(),student.getName(),student.getLastName(),student.getGrade()));
      return student;
    }

    public void getAllStudents()
    {
      if (StudentsList.isEmpty()) {
          System.out.println("no students enrolled.");
      }
      for (Student student : StudentsList.values()) {
        System.out.println();
        System.out.println("ID: %d, First Name: %s, Last Name: %s, Grade: %d".formatted(student.getId(),student.getName(),student.getLastName(),student.getGrade()));
      }
    }


    public void startProgram()
    {
      System.out.println();
      System.out.println("Student Grade Manager Started");
      System.out.println();
      while (isRunning) { 
          System.out.println();
          System.out.println("OPTIONS:");
          System.out.println("- - - - -");
          System.out.println("1 - View All Students");
          System.out.println("2 - Add Student");
          System.out.println("3 - Remove Student");
          System.out.println("4 - Change Student Details");
          System.out.println("5 - Get Student Details");
          System.out.println("Q - Quit");
          Integer userOption = scanner.nextInt();
          switch (userOption) {
              case 1:
                  getAllStudents();
                  break;

              case 2:
                addStudent();
                
                break; 

              case 3:
                 removeStudent();
                break;
              case 4:
                System.out.println("not implemented yet.");
                break;
              case 5:
                getStudentDetails();
                break;         
              default:
                  throw new AssertionError();
          }

      }
    }
}