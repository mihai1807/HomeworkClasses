public class Main {
    public static void main(String[] args) {

        //For a given number n, calculate the sum from 1 to n using a recursive method

        System.out.println("The sum is: " + Math.sumUntilN(15,0));

        //For a given number n, calculate its factorial value using a recursive method
        System.out.println("The factorial value is: " + Math.factorial(10,1));

        //Create student class objects using both constructors
        Student first = new Student("Jack");
        Student second = new Student("Jill",5);
        Student third = new Student("Jim", 7);
        Student fourth = new Student("Adrian");
        Student fifth = new Student("Anna", 8);

        //Create an array with at least three student objects
        Student[] studentList = {first, second, third,fourth,fifth};

        //Print the data of only the students with a grade above or equal to 5
        for (Student elem:studentList) {
            if (elem.grade >=5) elem.printStudent();
        }

        //Calculate the average grade of the existing students
        double sum = 0, average;
        for (Student elem:studentList) sum += elem.grade;
        average = sum / (studentList.length);
        System.out.println("The average grade of all students is: " + average);

        //Print out how many student objects have been created
        System.out.println("Until now there are " + Student.createdStudents + " created students.");

        //Use the method that takes as a parameter a student array and returns their grade average
        System.out.println("The general average is: " + Student.averageGrade(studentList));








    }
}
