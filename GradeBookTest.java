// Using the Class 
// GradeBookTest.java
// GradeBookTest creates GradeBook object using a two-dimensional array
// of grades, then invokes method processGrades to analyze them.
// For more info, contact me at LinkedIn:// Lance-Daniel

public class GradeBookTest
{
    public static void main(String[] args)
    {
        //int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int[][] gradesArray = {{87, 96, 70}, {68, 87, 90}, {94, 100, 90}, {100, 81, 82},
            {83, 65, 85}, {78, 87, 65}, {85, 75, 83}, {91, 94, 100}, {76, 72, 84}, {87, 93, 73}};
      
        GradeBook myGradeBook = new GradeBook( "CS101 Introdution to Java Programming", gradesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
}
