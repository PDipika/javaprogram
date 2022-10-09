import java.util.Scanner;

public class StudentsGrade {
    static int marks;

    public static void main(String[] args) {
        System.out.println("enter your marks = ");
        Scanner scanner = new Scanner(System.in);
        marks = scanner.nextInt();



        if(marks>=70){
            System.out.println("student got distinction");
        } else if (marks>=60) {
            System.out.println("student got first class");
        } else if (marks>=35) {
            System.out.println("student is pass");
        }
       else if (marks<34){
            System.out.println("student is fail");
        }

    }
























}
