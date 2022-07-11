
public class Student {
    //Add a counter to check how many Student Class objects have been created
    static int createdStudents;
    {
        createdStudents++;
    }
    String name;
    int grade;

//Write a constructor that takes in the values of Constructor 1 but changes the grade to 1
    public Student(String name) {
        this(name,1);
    }

//Constructor 1
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

//Write a setter for the grade variable
    public void changeNota(int grade) {
        this.grade = grade;
    }

//Write a method that takes no parameters and prints the name and grade
    public void printStudent() {
            System.out.println("Student name: " + this.name);
            System.out.println("Student grade: " + this.grade);
        }
//Write a method that takes in an array of Student Class objects as a parameter and calculates the average grade
    public static double averageGrade(Student[] list) {
        double sum = 0;
        for (Student elem:list) sum += elem.grade;
        return sum / (list.length);
    }

}
